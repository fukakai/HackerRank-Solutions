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

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        /* Found out # of times 'a' appears in our String */
        int wordAs = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                wordAs++;
            }
        }

        long completeWords    = n / s.length();
        long remainingLetters = n % s.length();
        long totalAs          = completeWords * wordAs;
        
        /* Count up the remaining 'a' characters */
        for (int i = 0; i < remainingLetters; i++) {
            if (s.charAt(i) == 'a') {
                totalAs++;
            }
        }
        
        return totalAs;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}