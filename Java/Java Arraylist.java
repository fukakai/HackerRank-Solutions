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
        Scanner scanner = new Scanner(System.in);
        int firstInt = scanner.nextInt();
        int secondInt;
        int nextInt;
        int tableCell;
        int x;
        int y;

        //group of arrayList. we know it length with the firstInt
        ArrayList<ArrayList<Integer>> group = new ArrayList<ArrayList<Integer>>(firstInt);
        //my arraylist is temporary container receiving an unknown length list
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();

        for(int i=0;i<firstInt;i++) {
            nextInt = scanner.nextInt();
            for(int j=0;j<nextInt;j++){
                tableCell = scanner.nextInt();
                myArrayList.add(tableCell); //adding every nextInt to temporary myArrayList
            }
            //adding the created list with the numbers of the lines to the group
            group.add(myArrayList);
            //Reset the arraylist to be ready for the next lin/loop
            myArrayList = new ArrayList<Integer>();
        }

        secondInt = scanner.nextInt();
        for(int i=0;i<secondInt;i++) {
            x = scanner.nextInt()-1; //first line of the group, is index 0
            y = scanner.nextInt()-1; //first cell of the lists, is index 0
            
            //let's try to print the corresponding element to the given X, Y
            //Where x is one of the given lines previously and y the place of an element in the arraylist
            try{
                System.out.println(group.get(x).get(y));
            }catch(Exception e){ //if an exception arrive because of array is null or out of band request:
                System.out.println("ERROR!");
            }
        }
    }
}