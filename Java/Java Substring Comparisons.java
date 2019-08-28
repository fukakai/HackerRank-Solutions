/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
public static String getSmallestAndLargest(String s, int k) {
	String smallest = "";
	String largest = "";
	String sub = "";
   
	//check all the substring possible
	 //(K-1) to do not allow the loop to search in the array "out of band"
	for(int i=0; i<s.length()-(k-1); i++){
		sub = s.substring(i,i+k); //substring i-i+k, so it can be 0 to 3
		
		if(sub.compareTo(smallest) <= 0 || smallest == "") smallest = sub; //save the smallest lexico found
		if(sub.compareTo(largest) > 0 || largest == "") largest = sub; //save the largest lexico found
	}
	return smallest + "\n" + largest;
}