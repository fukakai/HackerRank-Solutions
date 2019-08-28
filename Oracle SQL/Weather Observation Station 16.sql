/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
select round(latitude,4) from 
    (select min(LAT_N) as latitude from STATION
        where LAT_N > 38.7780);