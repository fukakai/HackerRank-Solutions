/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
select NAME from STUDENTS
where MARKS > 75
order by SUBSTR(NAME,-3,3), ID ASC;