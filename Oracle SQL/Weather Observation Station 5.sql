/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
select * from (select CITY C, length(CITY) L
                from STATION
                order by L desc, C asc)
where rownum = 1;

select * from (select CITY c, length(CITY) L
                from STATION
                order by L asc, C asc)
where rownum = 1;