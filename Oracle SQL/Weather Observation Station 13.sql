/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
select trunc(sum(LAT_N),4) from STATION where LAT_N BETWEEN 38.7880 and 137.2345;