ultra-java-api
==============

Java wrapper for Neustar's UltraDNS SOAP API.  Still a work in progress.

biz.neustar.ultra.client.UltraAPIClientImpl is the entry point.  

To initialize an instance, supply the username, password, and optionally the URL to the WSDL 
(mostly useful for internal UltraDNS testing).

All methods throw a RuntimeException biz.neustar.ultra.client.UltraAPIException.

Currently there are very few methods exposed.  More are forthcoming.

