/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
int sSize = s.length-2; //the table is declared too large !

//Bubble Sort algorithm
for (int i = 0; i < sSize-1; i++){
	for (int j = 0; j < sSize-i-1; j++){

		String temp = s[j]; //save temporarty string to change

		//Use BigDecimal class to compare two numbers of a different type
		BigDecimal  bigD = new BigDecimal (s[j]);
		BigDecimal  bigDplus = new BigDecimal (s[j+1]);

		//Java8doc: -1, 0, or 1 as this BigDecimal is numerically less than, equal to, or greater than val.
		if (bigD.compareTo(bigDplus) == -1) { 
			//Swap the numbers
			s[j] = s[j+1];
			s[j+1] = temp; 
		} 
	}
}