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
import java.util.HashMap; // import the HashMap class

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {
        HashMap<String,Integer> pairOfSocks = new HashMap<String,Integer>();
        int value = 1;
        int totalPairOfSocks = 0;

        //loop on given socks list
        for(int i=0;i<n;i++){
            //save index in local var to make the code cleaner
            String index = Integer.toString(ar[i]);
            
            //if we cannot find any index of this type of socks, we create it and initialise it to 1 the number of socks found
            if(pairOfSocks.get(index)==null){
                pairOfSocks.put(index,1);
            }else{
                //get previous number of socks of this type, and add one
                value = pairOfSocks.get(index)+1;
                pairOfSocks.put(index,value);

                //if the new total of socks of this type is even, we have a new pair and add one to the total pair of socks
                if(value%2==0){
                    totalPairOfSocks++;
                }
            }
        }
        return totalPairOfSocks;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}