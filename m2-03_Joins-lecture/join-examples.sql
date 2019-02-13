-- These queries require the JOINS database

--INNER JOIN  (DEFAULT IF JUST USE JOIN) -- joined on foreign key, retrieved like data
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one 
JOIN two ON one.number = two.number;


--LEFT JOIN  (Left Outer Join) - popular interview question, diff between left join and left outer join -- nothing they are the same
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one
LEFT JOIN two on one.number = two.number;


--RIGHT JOIN  (Right Outer Join)
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one
RIGHT JOIN two on one.number = two.number;


--FULL OUTER JOIN
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one
FULL JOIN two on one.number = two.number;


--Everything from ONLY the left table
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one
LEFT JOIN two ON one.number = two.number
WHERE two.number is NULL;

--Everything from ONLY the right table
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one
RIGHT JOIN two ON one.number = two.number
WHERE one.number IS NULL;


--Everything in ONLY the Left or Right table, but not both
SELECT one.number AS one_number, one.description as one_description, two.number as two_number, two.description as two_description
FROM one
FULL OUTER JOIN two on one.number = two.number
WHERE one.number IS NULL OR two.number IS NULL;


--UNION
-- Create a Union between the two tables that shows all values from both in two columns
-- puts two select tables together
SELECT number, description FROM one
UNION
SELECT number, description FROM two
ORDER BY number;







