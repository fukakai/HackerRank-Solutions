/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.io.*;
import java.util.*;

import java.util.Scanner;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

//understanding with https://github.com/RodneyShag/HackerRank_solutions/blob/master/Java/Advanced/Java%20MD5/Solution.java
public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();

        //enconding the txt in MD5
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update(text.getBytes());
        byte[] digest = md.digest();
        
        // Print the encoded value in hexadecimal
        for (byte b : digest) {
            System.out.format("%02x", b);
        }
    }
}