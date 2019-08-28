/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale locale_us = new Locale("en", "US");
        Locale locale_in = new Locale("in", "IN");
        Locale locale_ch = new Locale("ch", "CH");
        Locale locale_fr = new Locale("fr", "FR"); 

        String us = NumberFormat.getCurrencyInstance(locale_us).format(payment);
        String in = NumberFormat.getCurrencyInstance().format(payment);
        String ch = NumberFormat.getCurrencyInstance().format(payment);
        String fr = NumberFormat.getCurrencyInstance(locale_fr).format(payment);

        in = in.replace("¤","Rs.");
        ch = ch.replace("¤","￥");

        System.out.println("US: " + us);
        System.out.println("India: " + in);
        System.out.println("China: " + ch);
        System.out.println("France: " + fr);
    }
}