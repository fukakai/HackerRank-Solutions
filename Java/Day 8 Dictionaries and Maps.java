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
        int n = in.nextInt();
        HashMap<String,Integer> phoneBook = new HashMap<String,Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            phoneBook.put(name,phone); //saving every name,number in the phone book
        }
        while(in.hasNext()){
            String s = in.next();
            //if the key exists
            if(phoneBook.containsKey(s)){
                System.out.println(s+"="+phoneBook.get(s)); //return key=value
            }else{
                System.out.println("Not found");
            }
        }
        in.close();
    }
}