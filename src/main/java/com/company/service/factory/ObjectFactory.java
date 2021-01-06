package com.company.service.factory;

import com.company.service.HttpService;

public class ObjectFactory {
    private static HttpService httpService;

    public static HttpService getHttpService(){
        if(httpService == null){
            httpService = new HttpService();
        }
        return httpService;
    }
}
