/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
        //if the score is the same
        if(a.score == b.score){
            return a.name.compareTo(b.name); //compare names
        }else{
            return b.score - a.score; //descending order
        }
    }
}