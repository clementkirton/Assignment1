/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.servicea1;

import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author w206113903
 */
public class Manager 
{
    private static String readUrl(String urlString) throws Exception 
    {
        BufferedReader reader = null;
        try 
        {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuilder buffer = new StringBuilder();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1) 
            {
                buffer.append(chars, 0, read);
            }

            return buffer.toString();
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    
    }
    
    public void jsonRet() throws Exception {
        String json = readUrl("https://www.w3schools.com/angular/customers.php");

        Gson gson = new Gson();
        customers record = gson.fromJson(json, customers.class);
        
        for(records records : record.records)
       {
           System.out.println("\nName = " + records.Name + "\nCity = "+ records.City + "\nCountry = "+records.Country);
       }
    }
    
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, Exception {

        new Manager().jsonRet();
    }
}
