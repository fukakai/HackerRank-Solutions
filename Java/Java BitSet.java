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
        int bitSetLength = scanner.nextInt();
        int numberOperations = scanner.nextInt();

        //BitSet Initialisation
        BitSet B1 = new BitSet(bitSetLength);
        BitSet B2 = new BitSet(bitSetLength);

        scanner.nextLine();
        //While, has new operations
        while(scanner.hasNextLine()){
            String operation = scanner.next();  //Operation to do
            int a = scanner.nextInt();          //first parameter = B1 or B2
            int b = scanner.nextInt();          //second parameter =  value

            //if a==1; make the operation on B1, else on B2
            switch(operation){
                case "AND": if(a==1)  B1.and(B2);   else B2.and(B1);    break;
                case "SET": if(a==1)  B1.set(b);    else B2.set(b);     break;
                case "FLIP":if(a==1)  B1.flip(b);   else B2.flip(b);    break;
                case "OR":  if(a==1)  B1.or(B2);    else B2.or(B1);     break;
                case "XOR": if(a==1)  B1.xor(B2);   else B2.xor(B1);    break;
                default: break;
            }

            //Print result --> cardinality = Returns the number of bits set to true in this BitSet.
            System.out.println(B1.cardinality()+" "+B2.cardinality());
        }
    }
}