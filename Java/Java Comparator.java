/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
/**
* Implements Comparator to override compare method
* https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#sort-T:A-java.util.Comparator-
* https://docs.oracle.com/javase/7/docs/api/java/util/Comparator.html#compare%28T,%20T%29
*/
class Checker implements Comparator<Player>{
    @Override
    public int compare(Player a,Player b){
        //if scores are the sames, we return the result comparing the strings name
        if (a.score == b.score) {
            return a.name.compareTo(b.name);
        } else {
            // decreasing  order
            return b.score - a.score; 
        }
    }
}