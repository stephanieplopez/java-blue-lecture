-- ORDERING RESULTS

-- Populations of all countries in descending order
//SELECT name, population FROM country ORDER BY population DESC;
SELECT name, population
FROM country
ORDER BY population DESC;

--Names of countries and continents in ascending order
SELECT name, continent
FROM country
ORDER BY continent ASC, name ASC;

-- LIMITING RESULTS
-- The name and average life expectancy of the countries with the 10 highest life expectancies.
SELECT name, lifeexpectancy
FROM country 
WHERE lifeexpectancy IS NOT NULL
ORDER BY lifeexpectancy DESC
LIMIT 10;

SELECT name, round(gnp / population, 4) AS per_capita_gnp FROM country WHERE gnp > 0

-- CONCATENATING OUTPUTS

-- The name & state of all cities in California, Oregon, or Washington.
-- "city, state", sorted by state then city
SELECT (name || ', ' ||  district) AS name_state
FROM city 
WHERE district IN('California', 'Oregon', 'Washington')
ORDER BY district, name;

-- AGGREGATE FUNCTIONS
-- Average Life Expectancy in the World
SELECT AVG(lifeexpectancy)
FROM country;

-- Total population in Ohio
SELECT SUM(population)
FROM city 
WHERE district = 'Ohio';

-- The surface area of the smallest country in the world
SELECT MIN(surfacearea) 
FROM country;

-- The 10 largest countries in the world
SELECT *
FROM country
ORDER BY  surfacearea DESC
LIMIT 10;

-- The number of countries who declared independence in 1991
SELECT COUNT(*) 
FROM country
WHERE indepyear = 1991;

SELECT MIN(population) FROM country
GROUP BY region;

-- GROUP BY
-- Count the number of countries where each language is spoken, ordered from most countries to least
SELECT language, COUNT(countrycode) AS countries
FROM countrylanguage
GROUP BY language
ORDER BY countries DESC;

-- Average life expectancy of each continent ordered from highest to lowest
SELECT continent, AVG(lifeexpectancy) AS avg_lifeexpectancy
FROM country
GROUP BY continent
ORDER BY avg_lifeexpectancy DESC;

-- Exclude Antarctica from consideration for average life expectancy
SELECT continent, AVG(lifeexpectancy) AS avg_lifeexpectancy
FROM country
WHERE continent <> 'Antartica' AND lifeexpectancy IS NOT NULL
GROUP BY continent
ORDER BY avg_lifeexpectancy DESC;

-- Sum of the population of cities in each state in the USA ordered by state name
SELECT district, SUM(population)
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- The average population of cities in each state in the USA ordered by state name
SELECT district, ROUND(AVG(population), 0)
FROM city
WHERE countrycode = 'USA'
GROUP BY district
ORDER BY district;

-- SUBQUERIES

-- All the Cities on the region British Islands
SELECT * FROM city
WHERE countrycode IN ('GBR', 'IRL');

SELECT code FROM country
WHERE region = 'British Islands';

SELECT * FROM city
WHERE countrycode IN (SELECT code FROM country WHERE region = 'British Islands');

-- Find the names of cities under a given government leader
SELECT * FROM city
WHERE countrycode IN (SELECT code FROM country WHERE headofstate = 'Elisabeth II');

-- Find the names of cities whose country they belong to has not declared independence yet
SELECT * from city
WHERE countrycode IN(SELECT code FROM country WHERE indepyear is NULL); 



-- Additional samples
-- You may alias column and table names to be more descriptive
SELECT name AS city_name 
FROM city as cities;

-- Alias can also be used to create shorthand references, such as "c" for city and "co" for country.
SELECT c.name, co.name
FROM city AS c, country AS co

-- Ordering allows columns to be displayed in ascending order, or descending order (Look at Arlington)
SELECT name, population
FROM city
WHERE countrycode = 'USA'
ORDER BY name AS, population DESC;

-- Limiting results allows rows to be returned in 'limited' clusters,where LIMIT says how many, and OFFSET (optional) specifies the number of rows to skip

-- Most database platforms provide string functions that can be useful for working with string data. In addition to string functions, string concatenation is also usually supported, which allows us to build complete sentences if necessary.
SELECT (name || ' IS THE STATE OF ' || district) as city_state
FROM city
WHERE countrycode = 'USA';


-- Aggregate functions provide the ability to COUNT, SUM, and AVG, as well as determine MIN and MAX. Only returns a single row of value(s) unless used with GROUP BY.

-- Counts the number of rows in the city table

-- Also counts the number of rows in the city table

-- Gets the SUM of the population field in the city table, as well as
-- the AVG population, and a COUNT of the total number of rows.

-- Gets the MIN population and the MAX population from the city table.

-- Using a GROUP BY with aggregate functions allows us to summarize information for a specific column. For instance, we are able to determine the MIN and MAX population for each countrycode in the city table.
