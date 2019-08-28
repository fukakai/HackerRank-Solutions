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
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(largestHourGlass(arr));

        scanner.close();
    }

    /**
    * Check all the hourGlass possibilities in a 6*6 matrix
    */
    public static int largestHourGlass(int[][] arr){
        int totalHourglass = 0;
        int largestHourGlass= -9*7; //we know the smallest size of the 7 numbers of each hourGlass can be -9, so we set "largestHourGlass" to the minimum value possible waiting for comparaison;

        //we need to need on a smaller matrix size 4*4 to check all the hourGlass possibilities
        for(int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                //saving the sum of every hourGlass possibility
                totalHourglass = arr[i][j]+arr[i][j+1]+arr[i][j+2]+
                                arr[i+1][j+1]+ 
                                arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2];
              
                //saving the sum result of the largest hourGlass found.
                largestHourGlass = (totalHourglass>largestHourGlass)? totalHourglass: largestHourGlass;
            }
        }
        //returning the sum of the largest hourGlass found.
        return largestHourGlass;
    }
}