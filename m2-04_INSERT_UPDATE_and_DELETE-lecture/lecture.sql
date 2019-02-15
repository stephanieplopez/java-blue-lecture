
--Using Assessing 
-- INSERT
SELECT * FROM countrylanguage;
-- 1. Add Klingon as a spoken language in the USA
INSERT INTO countrylanguage (countrycode, language, isofficial, percentage)
VALUES ('USA', 'Klingon', false, 99);
-- 2. Add Klingon as a spoken language in Great Britain
INSERT INTO countrylanguage(isofficial, percentage, language, countrycode)
VALUES (false, 25, 'Klingon', 'GBR');

-- UPDATE
SELECT * FROM country WHERE code = 'USA'
SELECT * FROM city WHERE name = 'Houston';
-- 3796 / 3813
-- find out how to update the capital
-- how to find Houston
-- use select statement to check the rows that will change
-- 1. Update the capital of the USA to Houston
UPDATE country
SET capital = 3796
WHERE code = 'USA';

-- 2. Update the capital of the USA to Washington DC and the head of state
UPDATE country
SET capital = 3813, headofstate ='Mickey Mouse'
WHERE code = 'USA'

-- DELETE

-- 1. Delete English as a spoken language in the USA
-- FIRST CREATE A SELECT STATEMENT, THEN write delete
SELECT * FROM countrylanguage
WHERE countrycode = 'USA' AND language = 'English';

DELETE FROM countrylanguage
WHERE countrycode = 'USA' AND language = 'English';
-- 2. Delete all occurrences of the Klingon language 
SELECT * FROM countrylanguage
WHERE LANGUAGE = 'Klingon';

DELETE FROM countrylanguage
WHERE LANGUAGE = 'Klingon';
-- REFERENTIAL INTEGRITY

SELECT * FROM countrylanguage;
-- 1. Try just adding Elvish to the country language table.
INSERT into countrylanguage (language) VALUES ('Elvish');

-- No country for ZZZ exists
-- 2. Try inserting English as a spoken language in the country ZZZ. What happens?

-- 3. Try deleting the country USA. What happens?
DELETE FROM country WHERE code = 'USA';

-- CONSTRAINTS

-- 1. Try inserting English as a spoken language in the USA

-- 2. Try again. What happens?

-- 3. Let's relocate the USA to the continent - 'Outer Space'


-- How to view all of the constraints

SELECT * FROM INFORMATION_SCHEMA.TABLE_CONSTRAINTS
SELECT * FROM INFORMATION_SCHEMA.CONSTRAINT_COLUMN_USAGE
SELECT * FROM INFORMATION_SCHEMA.REFERENTIAL_CONSTRAINTS


-- TRANSACTIONS
SELECT * FROM countrylanguage

-- 1. Try deleting all of the rows from the country language table and roll it back.
START TRANSACTION;
DELETE from countrylanguage;
ROLLBACK;
-- or COMMIT; to save the changes

-- 2. Try updating all of the cities to be in the USA and roll it back
