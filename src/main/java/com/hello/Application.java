package com.hello;

import org.springframework.web.client.RestTemplate;

public class Application {

    public static void main(String args[]) {
        RestTemplate restTemplate = new RestTemplate();
        Page page = restTemplate.getForObject("http://graph.facebook.com/pivotalsoftware", Page.class);

        System.out.println(":::: RESULT ::::");
        System.out.println(String.format("Name: %s", page.getName()));
        System.out.println(String.format("About: %s", page.getAbout()));
        System.out.println(String.format("Phone: %s", page.getPhone()));
        System.out.println(String.format("Website: %s", page.getWebsite()));
    }
}
