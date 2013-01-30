package biz.neustar.ultra.client;

import com.neustar.ultraservice.schema.v01.AccountDetailsList;

/*
 * User: jbodner
 * Date: 1/30/13
 * Time: 2:39 PM
 *
 * Copyright 2000-2013 NeuStar, Inc. All rights reserved.
 * NeuStar, the Neustar logo and related names and logos are registered
 * trademarks, service marks or tradenames of NeuStar, Inc. All other
 * product names, company names, marks, logos and symbols may be trademarks
 * of their respective owners.
 */
public class SampleMain {
    /*
    arg pos     value
    0           wsdl url
    1           username
    2           password
    3           account id
     */
    public static void main(String[] args) {

        if (args.length != 4) {
            System.err.println("Required params: wsdlUrl userName password accountId");
            System.exit(1);
        }
        String wsdlUrl = args[0];
        String username = args[1];
        String password = args[2];
        String accountId = args[3];

        System.out.println("url = " + wsdlUrl);
        try {
            UltraAPIClient ultraAPIClient = new UltraAPIClientImpl(username, password, wsdlUrl);
            System.out.println(ultraAPIClient.getNeustarNetworkStatus());
            AccountDetailsList accountDetailsForUser = ultraAPIClient.getAccountDetailsForUser();
            System.out.println(accountDetailsForUser.getAccountDetailsData().get(0).getAccountID());
            try {
                System.out.println(ultraAPIClient.deleteZone("testZone.com."));
            } catch (UltraAPIException e) {
                e.printStackTrace();
                if (e.getCode() != 1801) {
                    System.exit(1);
                }
            }
            System.out.println(ultraAPIClient.createPrimaryZone(accountId, "testZone.com."));
            System.out.println(ultraAPIClient.getSecondaryZonesOfAccount(accountId));
            System.out.println(ultraAPIClient.createARecord("testZone.com.", "foo.testZone.com.", "1.2.3.4", 86400));
            System.out.println(ultraAPIClient.deleteZone("testZone.com."));
        } catch (UltraAPIException e) {
            e.printStackTrace();
        }
    }
}
