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

    // Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
        int level = 0;  //current elevation number
        char[] field = s.toCharArray(); //current elevation char
        int numberOfValley = 0; //number of valley crossed
        String currentChar=""; //current elevation string

        for(int i=0;i<n;i++){
            //convert char to string
            currentChar =Character.toString(field[i]);

            //if we are going up, and this next level will be 0, we are going out of a valley
            if(level==-1 && currentChar.equals("U")){
                numberOfValley++;
                level++;
            //if current position is going up, update the level +1
            }else if(currentChar.equals("U")){
                level++;
            //if current position is going down, update the level -1
            }else if(currentChar.equals("D")){
                level--;;
            }
        }
        return numberOfValley;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}