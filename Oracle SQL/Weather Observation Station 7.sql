/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
select CITY from STATION
where REGEXP_LIKE (CITY, '^(.+)[aeiou]$')
group by CITY;