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
        Scanner scan= new Scanner(System.in);
        //initial number of elements
        int firstInt = scan.nextInt(); 
        int queries;
        int cell;
        String operation = "";
        int index;
        int addElement;
        List myList = new ArrayList<Integer>();

        //creatin a list
        for(int i=0; i<firstInt;i++){
            cell = scan.nextInt();
            myList.add(cell);
        }
        
        //number of queries
        queries = scan.nextInt(); 
        for(int i=0;i<queries;i++){
            //go to next line
            scan.nextLine(); 
            //type of query
            operation = scan.nextLine(); 
             //query parameters
            index = scan.nextInt();

            if(operation.equals("Insert")){
                //add element to the list at the specified index
                addElement = scan.nextInt();
                myList.add(index,addElement);
            }else if(operation.equals("Delete")){
                //delete element from the list at the specified index
                myList.remove(index);
            }
        }

        //print the list
        for(int i=0;i<myList.toArray().length;i++){
            System.out.print(myList.get(i)+" ");
        }
    }
}