select sum(CITY.population)
from CITY, COUNTRY 
where COUNTRY.continent='Asia' 
    and CITY.countrycode = COUNTRY.code 
group by COUNTRY.continent;