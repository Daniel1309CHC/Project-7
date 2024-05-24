package co.com.sofka.stepdefinitions.servicesoap;

import java.util.HashMap;

public class HeaderConfigurationSoap {
    public static HashMap<String, Object> headersSoap(){
        HashMap<String, Object> headersCollection = new HashMap<>();
        headersCollection.put("Content-Type","text/xml;charset=UTF-8");
        headersCollection.put("SOAPAction","");
        return headersCollection;
    }
}
