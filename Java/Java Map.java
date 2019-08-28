/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
	public static void main(String []argh){
		Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		in.nextLine();
        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();

        //construct phone book
		for(int i=0;i<n;i++){
			String name =in.nextLine();
			int phone   =in.nextInt();
            
            phoneBook.put(name,phone);
			in.nextLine();
		}

        //read phone book
		while(in.hasNext()){
			String s=in.nextLine();
            
            //if we found the name of the person, we can return the phone number
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
		}
	}
}