package com.company;

import java.io.IOException;
import com.company.service.factory.ObjectFactory;

public class HTTPApplication {
    public static void main(String[] args) throws IOException {
        ObjectFactory.getHttpService().getService();
        ObjectFactory.getHttpService().postService();
    }
}
