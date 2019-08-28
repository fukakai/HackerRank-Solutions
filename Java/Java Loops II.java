/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int q=in.nextInt(); //Number of queries

        for(int i=0;i<q;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            String row = "";

            int res = a;
            for(int ii=0; ii<n; ii++){
                res += (Math.pow(2,ii)*b);
                row+=Integer.toString(res)+" ";
            }
            System.out.println(row);
        }
        in.close();
    }
}