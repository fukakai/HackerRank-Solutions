/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
//create and return the object depending of its type defined here by a string
switch (order.toLowerCase()) {
	case "pizza":   return new Pizza();
	case "cake":    return new Cake();
	default:        return null;
}