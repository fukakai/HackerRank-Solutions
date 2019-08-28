/*
	Author: Romain DALICHAMP
	Github: https://github.com/fukakai
	Portfolio: http://romain.dalichamp.fr
	Contact: romain.dalichamp@free.fr
*/
-- SOLUTION 1
/** 
SELECT MAX(SALARY*MONTHS), COUNT(*)
FROM EMPLOYEE
WHERE (SALARY*MONTHS) = 
    (SELECT MAX(SALARY*MONTHS) FROM EMPLOYEE);
*/

-- SOLUTION 2
select earnings,numberOfEmployees from 
    ( select months * salary as earnings, count(*) as numberOfEmployees
        from employee
        group by months * salary
        order by 1 desc
) where rownum = 1;