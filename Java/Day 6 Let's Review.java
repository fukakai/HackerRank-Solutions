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
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String word = scanner.nextLine(); //get ready for the next line
        char[] wordArray;
        String peerLetters;
        String oddLetters;

        for(int i=0;i<n;i++){
            peerLetters = oddLetters = "";
            word = scanner.nextLine();
            wordArray = word.toCharArray();

            for(int j=0;j<word.length();j++){
                if(j%2==0){ //if i is peer
                    peerLetters+=wordArray[j];
                }else{ //else it is odd
                    oddLetters+=wordArray[j];
                }
            }
            System.out.println(peerLetters+" "+oddLetters);    
        }
    }
}