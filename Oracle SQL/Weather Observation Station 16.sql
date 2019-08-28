select round(latitude,4) from 
    (select min(LAT_N) as latitude from STATION
        where LAT_N > 38.7780);