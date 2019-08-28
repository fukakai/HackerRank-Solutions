/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.util.*;

public class Solution {

    public static boolean canWin(int leap, int[] game) {
        return recLoop(leap,game,0);
    }

    public static boolean recLoop(int leap, int[] game, int i){
        if (i < 0 || game[i] == 1) {
            //lose
            return false;
        } else if (i + 1 >= game.length || i + leap >= game.length) {
            //win
            return true;
        }
        
        game[i] = 1; //marked as visited
        return recLoop(leap, game, i + leap)
            || recLoop(leap, game, i + 1)
            || recLoop(leap, game, i - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();

        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}