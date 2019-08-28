/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
public class Solution {
	public static void main(String[] args){
		Class student = Student.class;
		Method[] methods = student.getDeclaredMethods();

		//construct arrayList with all the methods name
		ArrayList<String> methodList = new ArrayList<>();
		for(Method method : methods){
			methodList.add(method.getName());
		}
		//sort methods by names and print it
		Collections.sort(methodList);
		for(String name: methodList){
			System.out.println(name);
		}
	}
}