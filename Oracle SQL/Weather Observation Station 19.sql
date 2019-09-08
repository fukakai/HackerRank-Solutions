/* calc of uclidean Distance. It is: sqr( (x2 - x1)^2 + sqr(y2 - y1)^2 )  */
select round(
            sqrt(
                power((max(lat_n) - min(lat_n)), 2) +
                power((max(long_w) - min(long_w)), 2)
            )
            , 4)
from station;