package com.java.restapi;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

class Result{
    private static final String RESTURL = "https://jsonmock.hackerrank.com/api/food_outlets";
    public static  String getRelevantFoodOutlets(String city,String pagenumber) throws IOException {
        String response=getresponseperpage(city,pagenumber);
        return null;
    }
    private static String getresponseperpage(String city, String pagenumber) throws IOException {
        String newurl= RESTURL+"?city="+city+"&page="+pagenumber;
        System.out.println(newurl);
        URL url=new URL(newurl);
        HttpURLConnection connection= (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");
        connection.setRequestProperty("Content-Type","application/json");

        BufferedReader br=new BufferedReader(new InputStreamReader(connection.getInputStream()));
        String response;
        StringBuilder sb=new StringBuilder();
        while((response=br.readLine())!=null){
            sb.append(response);
        }
        return sb.toString();
    }
}
public class GetFoodOutlets {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\SAYAN\\Desktop\\test.txt"));

        String city = bufferedReader.readLine();

        String pagenumber = bufferedReader.readLine();

        String result = Result.getRelevantFoodOutlets(city, pagenumber);

            bufferedWriter.write(result);
            bufferedWriter.write("\n");

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
