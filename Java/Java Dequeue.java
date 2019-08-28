/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
import java.util.*;
public class test {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayDeque<Integer> deque     = new ArrayDeque<>();
		int n = scan.nextInt();
		int m = scan.nextInt();
		int max = 0;

		//Solution from 
		// Author: Rodney Shaghoulian
		for (int i = 0; i < n; i++) {
			
			if(i >= m){
				int old = deque.removeFirst();
				if (map.get(old) == 1) {
					map.remove(old);
				} else {
					map.merge(old, -1, Integer::sum);
				}
			}
			/* Add new value */
			int num = scan.nextInt();
			deque.addLast(num);
			map.merge(num, 1, Integer::sum);
			
			max = Math.max(max, map.size());
			
			/* If all integers are unique, we have found our largest
			possible answer, so we can break out of loop */
			if (max == m) {
				break;
			}
		}
			
		scan.close();
		System.out.println(max);
	}
}