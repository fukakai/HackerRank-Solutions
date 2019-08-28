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
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        String[] result = s.split("[\\s!,?._'@]+"); //split the sentence to a String[] array

        System.out.println(result.length); //print length of the array
        for(String word: result){
            System.out.println(word); //print every word
        }
        scan.close();
    }
}