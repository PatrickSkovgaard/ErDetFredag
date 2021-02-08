package com.example.demo.services;

import java.util.Date;

public class CalculateDay {

    public String calculateTheDay (){

        Date date = new Date();
        int q = date.getDay();
        int m = date.getMonth();
        int j = date.getYear()/100;  //Århundredet
        int k = date.getYear()%100;  //Året i århundredet

        int h = (q + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) - 2 * j) % 7;  //Midlertidig variabel

        int d = ((h + 5) % 7) + 1;  //Hvilken dag det er i ugen, udregnet som et tal mellem 1-7


        if (d != 5){
            return "Nej";
        }
        return "Ja";

    }
}
