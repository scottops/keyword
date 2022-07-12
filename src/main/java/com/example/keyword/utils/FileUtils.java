package com.example.keyword.utils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.MessageFormat;

public class FileUtils {
    public static void main(String[] args) throws IOException {

        String template = "<li class=\"item\">\n" +
                "            <div class=\"key\"><span class=\"word\">{0}</span> <span>读音</span></div>\n" +
                "            <div class=\"info\">{1}</div>\n" +
                "        </li>";


        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Thread.currentThread().getContextClassLoader().getResourceAsStream("data.txt")));
        String line =  null;
        int i=0;
        while (   (line=bufferedReader.readLine()) != null) {
            String[] split = line.split("\\|");
            String format = MessageFormat.format(template, split[0].trim(), line.replaceFirst(split[0],"").trim());
            System.out.println(format);

        }
        bufferedReader.close();




    }



}
