package biz.neustar.ultra.client;

import com.neustar.ultra.api.webservice.v01.UltraDNS1;
import com.neustar.ultra.api.webservice.v01.UltraWSException_Exception;
import com.neustar.ultra.api.webservice.v01.UltraWebServiceV01Service;
import com.neustar.ultraservice.schema.v01.AccountDetailsList;
import com.neustar.ultraservice.schema.v01.InfoValues;
import com.neustar.ultraservice.schema.v01.ResourceRecordToCreate;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.ws.security.wss4j.WSS4JOutInterceptor;

import javax.xml.ws.Service;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * User: jbodner
 * Date: 1/28/13
 * Time: 12:32 PM
 *
 * Copyright 2000-2013 NeuStar, Inc. All rights reserved.
 * NeuStar, the Neustar logo and related names and logos are registered
 * trademarks, service marks or tradenames of NeuStar, Inc. All other
 * product names, company names, marks, logos and symbols may be trademarks
 * of their respective owners.
 */
public class UltraAPIClientImpl implements UltraAPIClient {
    private final UltraDNS1 _ultraDNS1;

    public UltraAPIClientImpl(String username, String password) {
        this(username, password, UltraWebServiceV01Service.WSDL_LOCATION.toString());
    }

    public UltraAPIClientImpl(String username, String password, String url) {
        try {
            ClientPasswordCallback._username = username;
            ClientPasswordCallback._password = password;
            Service service = UltraWebServiceV01Service.create(new URL(url), UltraWebServiceV01Service.SERVICE);
            _ultraDNS1 = service.getPort(UltraDNS1.class);
            Client cxfClient = ClientProxy.getClient(_ultraDNS1);
            WSS4JOutInterceptor wss4JOutInterceptor = new WSS4JOutInterceptor();
            wss4JOutInterceptor.setProperty("action", "UsernameToken");
            wss4JOutInterceptor.setProperty("user", "dummy");
            wss4JOutInterceptor.setProperty("passwordType", "PasswordText");
            wss4JOutInterceptor.setProperty("passwordCallbackClass", "biz.neustar.ultra.client.ClientPasswordCallback");

            cxfClient.getOutInterceptors().add(new org.apache.cxf.interceptor.LoggingOutInterceptor());
            cxfClient.getOutInterceptors().add(wss4JOutInterceptor);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            throw new UltraAPIException(9999, e.getMessage());
        }
    }

    @Override
    public String createARecord(String zoneName, String domainName, String ipAddress, int ttl) {
        return createRecord(zoneName, domainName, ResourceRecordTypes.A, ttl, ipAddress);
    }

    @Override
    public String createTXTRecord(String zoneName, String domainName, String value, int ttl) {
        return createRecord(zoneName, domainName, ResourceRecordTypes.TXT, ttl, value);
    }

    @Override
    public String createCNAMERecord(String zoneName, String domainName, String name, int ttl) {
        return createRecord(zoneName, domainName, ResourceRecordTypes.CNAME, ttl, name);
    }

    @Override
    public String createRecord(String zoneName, String domainName, ResourceRecordTypes recordType, int ttl, String... infoValues) {
        try {
            ResourceRecordToCreate resourceRecord = new ResourceRecordToCreate();
            resourceRecord.setDName(domainName);
            resourceRecord.setType(recordType.recType());
            resourceRecord.setZoneName(zoneName);
            resourceRecord.setTTL(Integer.toString(ttl));
            InfoValues infoValuesWrapper = new InfoValues();
            for (int i = 0; i < infoValues.length; i++) {
                setInfoValue(i, infoValues[i], infoValuesWrapper);
            }
            resourceRecord.setInfoValues(infoValuesWrapper);
            return _ultraDNS1.createResourceRecord("", resourceRecord);
        } catch (UltraWSException_Exception e) {
            throw new UltraAPIException(e.getFaultInfo());
        }
    }

    private void setInfoValue(int i, String value, InfoValues infoValuesWrapper) {
        try {
            Method m = infoValuesWrapper.getClass().getMethod("setInfo"+(i+1)+"Value", String.class);
            m.invoke(infoValuesWrapper,value);
        } catch (Exception e) {
            throw new UltraAPIException(9999, e.getMessage());
        }
    }

    @Override
    public String createPrimaryZone(String accountId, String zoneName) {
        try {
            return _ultraDNS1.createPrimaryZone("", accountId, zoneName, true);
        } catch (UltraWSException_Exception e) {
            throw new UltraAPIException(e.getFaultInfo());
        }
    }

    @Override
    public String deleteZone(String zoneName) {
        try {
            return _ultraDNS1.deleteZone("", zoneName);
        } catch (UltraWSException_Exception e) {
            throw new UltraAPIException(e.getFaultInfo());
        }
    }

    @Override
    public AccountDetailsList getAccountDetailsForUser() {
        try {
            return _ultraDNS1.getAccountDetailsOfUser("", "");
        } catch (UltraWSException_Exception e) {
            throw new UltraAPIException(e.getFaultInfo());
        }
    }

    @Override
    public String getNeustarNetworkStatus() {
        try {
            return _ultraDNS1.getNeustarNetworkStatus();
        } catch (UltraWSException_Exception e) {
            e.printStackTrace();
            throw new UltraAPIException(e.getFaultInfo());
        }
    }

    public static void main(String[] args) {
        String wsdl_url = "http://localhost:8008/UltraDNS_WS/v01?wsdl";
        System.out.println("url = " + wsdl_url);
        try {
            UltraAPIClient ultraAPIClient = new UltraAPIClientImpl("USERNAME", "PASSWORD", wsdl_url);
            System.out.println(ultraAPIClient.getNeustarNetworkStatus());
            AccountDetailsList accountDetailsForUser = ultraAPIClient.getAccountDetailsForUser();
            System.out.println(accountDetailsForUser);
            try {
                System.out.println(ultraAPIClient.deleteZone("testZone.com."));
            } catch (UltraAPIException e) {
                e.printStackTrace();
                if (e.getCode() != 1801) {
                    System.exit(1);
                }
            }
            System.out.println(ultraAPIClient.createPrimaryZone("ACCOUNT_ID", "testZone.com."));
            System.out.println(ultraAPIClient.createARecord("testZone.com.","foo.testZone.com.", "1.2.3.4",86400));
            System.out.println(ultraAPIClient.deleteZone("testZone.com."));
        } catch (UltraAPIException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }
}
