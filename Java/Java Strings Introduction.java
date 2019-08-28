/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        
        //set vars
        int sum = A.length() + B.length();
        int lex = A.compareTo(B);

        //print sum of total letters
        System.out.println(sum);

        //compare the lexicography position of each word
        if(lex > 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
        //Capitalise first letter
        String upperA = A.substring(0,1).toUpperCase()+A.substring(1);
        String upperB = B.substring(0,1).toUpperCase()+B.substring(1);

        //print final result
        System.out.println(upperA+" "+upperB);
    }
}