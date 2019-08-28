/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++)
            {
                String s1=sc.next();
                int x=sc.nextInt();
                String sx = Integer.toString(x);

                while(s1.length() < 15){ s1 += " "; }
                while(sx.length() < 3){ sx = "0"+sx;}

                System.out.println(s1+sx);
            }
            System.out.println("================================");

    }
}