/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
Set<String> names = new HashSet<>();
for(int i=0;i<t;i++){
	names.add(pair_left[i]+" "+pair_right[i]);
	System.out.println(names.size());
}