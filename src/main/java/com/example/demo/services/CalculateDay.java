package com.example.demo.services;

import java.util.Date;

public class CalculateDay {

    public String calculateTheDay (){

        Date date = new Date();
        int q = date.getDay();
        int m = date.getMonth();
        int j = date.getYear()/100;
        int k = date.getYear()%100;

        int h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;

        int d = ((h + 5) % 7) + 1;


        if (d != 5){
            return "Nej";
        }
        return "Ja";

    }
}
