/* Calc of the Manhattan Distance |x1 - x2| + |y1 - y2| */
select round((max(lat_n)-min(lat_n))+
             (max(long_w)-min(long_w))
            ,4) from station;