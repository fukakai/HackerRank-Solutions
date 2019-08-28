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

        String reverseA = new StringBuilder(A).reverse().toString(); //Reverse A
        System.out.println(A.equals(reverseA) ? "Yes" : "No"); //Answer
    }
}