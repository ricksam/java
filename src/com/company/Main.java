package com.company;

import com.sun.deploy.net.HttpRequest;
import sun.net.www.http.HttpClient;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import com.company.HttpsTrustManager;

public class Main {

    //private static HttpsURLConnection connection;

    public static void main(String[] args) {
        com.company.HttpsTrustManager.allowAllSSL();
        // Create a neat value object to hold the URL

        try {
            URL url = new URL("https://rcksoftware.azurewebsites.net/home/testjson");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("accept", "application/json");
            connection.setRequestMethod("GET");
            InputStream responseStream = responseStream = connection.getInputStream();
            System.out.println(responseStream.toString());
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
