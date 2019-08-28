/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
static boolean isAnagram(String a, String b) {
	int lengthA = a.length();
	int lengthB = b.length();
	String currentLetterA,currentLetterB;
	int countA=0;
	int countB=0;
	//Hashmaps to keep a letter as index and its number of occurences as value: <a,3>
	java.util.HashMap<String, Integer> tableA = new java.util.HashMap<String, Integer>();
	java.util.HashMap<String, Integer> tableB = new java.util.HashMap<String, Integer>();

	if(a == null || b == null || lengthA != lengthB) return false; //if the given entries are not eligible

	//set the all entries to lower case, to compare the letters in an easier way
	a = a.toLowerCase();
	b = b.toLowerCase();

	//we know the two entries have the same number of letters, so we loop on any entry length
	for(int i=0; i<lengthA;i++){
		//getting each character as char, and convert to string to use it easily with Hashmaps
		currentLetterA = Character.toString(a.charAt(i));
		currentLetterB = Character.toString(b.charAt(i));
		
		//if there is no entry in the hashmap for the current letter, we set it at 0, else we get the current value
		//wich is the number of time the letter has been found previously
		countA = (tableA.get(currentLetterA) == null)? 0 : tableA.get(currentLetterA);
		countB = (tableB.get(currentLetterB) == null)? 0 : tableB.get(currentLetterB);

		//for this letter, we have to add one in the hashmap to remember this occurence
		tableA.put(currentLetterA,countA+1);
		tableB.put(currentLetterB,countB+1);
	}

	//if the Hashmaps are equals, the words are anagrams !
	if(tableA.equals(tableB)) return true;
	return false;
}