ultra-java-api
==============

Java wrapper for Neustar's UltraDNS SOAP API.  Still a work in progress.

biz.neustar.ultra.client.UltraAPIClientImpl is the entry point.  

To initialize an instance, supply the username, password, and optionally the URL to the WSDL 
(mostly useful for internal UltraDNS testing).

All methods throw a RuntimeException biz.neustar.ultra.client.UltraAPIException.

Currently there are very few methods exposed:

    String createARecord(String zoneName, String domainName, String ipAddress, int ttl);

    String createTXTRecord(String zoneName, String domainName, String value, int ttl);

    String createCNAMERecord(String zoneName, String domainName, String name, int ttl);

    String createRecord(String zoneName, String domainName, ResourceRecordTypes recordType, int ttl, String... infoValues);

    String createPrimaryZone(String accountId, String zoneName);

    String deleteZone(String zoneName);

    AccountDetailsList getAccountDetailsForUser();

    String getNeustarNetworkStatus();

More are forthcoming.

License
=======

Copyright 2013 Neustar

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
