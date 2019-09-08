select CITY.name
from CITY, COUNTRY 
where COUNTRY.continent='Africa' 
    and CITY.countrycode = COUNTRY.code 
group by CITY.name;