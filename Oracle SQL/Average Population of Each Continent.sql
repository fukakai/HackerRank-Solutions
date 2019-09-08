select COUNTRY.continent, floor(avg(CITY.population))
from CITY, COUNTRY 
where CITY.countrycode = COUNTRY.code 
group by COUNTRY.continent;