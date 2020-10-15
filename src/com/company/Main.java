package com.company;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] args) {
//        System.out.println("hello world!");
//        String river = "MississippiMississippiMississippiMississippiMississippiMississippi";
//        String[] splitString = river.split("s");
//        System.out.println(Arrays.toString(s
////        String riverPart = river.substring(2,5);
////        System.out.println(riverPart);
////
////        Pattern p = Pattern.compile("Mi(.*?)pi");
////        Matcher m = p.matcher(river);
////
////        while(m.find()){
////            System.out.println(m.group(1));
////        }
//


      String html = "<divclass=\"lister-item-image\"><a href=\"/name/nm0000123/?ref_=nmls_pst\"><img alt=\"George Clooney\"height=\"209\"src=\"https://m.media-amazon.com/images/M/MV5BMjEyMTEyOTQ0MV5BMl5BanBnXkFtZTcwNzU3NTMzNw@@._V1_UY209_CR7,0,140,209_AL_.jpg\"width=\"140\"/></a></div>";

        Pattern p = Pattern.compile("src=\"(.*?)\"width");
        Matcher m = p.matcher(html);

        while(m.find()){
            System.out.println(m.group(1));
        }

        p = Pattern.compile("alt=\"(.*?)\"");
        m = p.matcher(html);

        while(m.find()){
            System.out.println(m.group(1));
        }
    }
}
