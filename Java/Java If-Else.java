/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        String nIs = "Weird";
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(N % 2!= 0){ nIs = "Weird";}
        else if(N >= 2 && N <= 5){ nIs = "Not Weird";}
        else if(N >= 6 && N <= 20){ nIs = "Weird";}
        else if(N > 20){ nIs = "Not Weird";}
        
        System.out.println(nIs);

        scanner.close();
    }
}