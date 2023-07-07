package com.bloff.test;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class App {
    public static void main(String[] args) {
        System.out.println();
        String number = "15340.119999999225225542222";
        String number2 = "15340.14000000111";
        Double doubl = Double.valueOf(number);
        BigDecimal big = new BigDecimal(number);
        BigDecimal big2 = new BigDecimal(number2);

        Integer bigDecimal = big.multiply(new BigDecimal(100)).setScale(0, RoundingMode.HALF_UP).intValue();
        Integer bigDecimal2 = big2.multiply(new BigDecimal(100)).setScale(0, RoundingMode.HALF_UP).intValue();



        DecimalFormat dec = new DecimalFormat("#0.00");
        String format = dec.format(big);


        String[] split = String.valueOf(big).split("\\.");
        String s = split[0];

        System.out.println(format);
        System.out.println(s);


    }

}
