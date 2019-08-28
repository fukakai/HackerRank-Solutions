/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.util.Scanner;
import java.util.regex.*;

public class Solution
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());
        
        //loop on the given testcases
		while(testCases>0){
			String pattern = in.nextLine();
          	try{ //try to compile the given patter
                Pattern.compile(pattern);
                System.out.println("Valid");                  
            }catch(Exception e){
                //if the pattern throws an exception, it is invalid.
                System.out.println("Invalid");
            }
            //Decrementing testCases counter
            testCases = testCases-1;
		}
	}
}