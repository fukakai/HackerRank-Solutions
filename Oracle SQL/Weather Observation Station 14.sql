/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
select trunc(max(LAT_N),4) from STATION
where LAT_N < 137.2345;