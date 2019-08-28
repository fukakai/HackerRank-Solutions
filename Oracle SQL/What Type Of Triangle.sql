/*
    Author: Romain DALICHAMP
    Github: https://github.com/fukakai
    Portfolio: http://romain.dalichamp.fr
    Contact: romain.dalichamp@free.fr
*/
select case when a+b<= c or b+c<=a or c+a<= b then 'Not A Triangle'
            when a=b and b=c then 'Equilateral'
            when (a=b and a!=c) or (b=c and c!=a) or (c=a and b!=c) then 'Isosceles'
            /* Implicit - No Need this line when a!=b and b!=c and a!=c then 'Scalene' */
            else 'Scalene'
        end
from TRIANGLES;