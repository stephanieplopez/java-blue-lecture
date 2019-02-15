-- start of creation of database
-- Natural key does not exist, so we use a surrogate key
DROP TABLE IF EXISTS ourtable;
CREATE TABLE ourtable (
        id serial primary key,
        name varchar(35)      
);

SELECT * FROM ourtable;
--How do we see next sequence?

INSERT INTO ourtable(name) VALUES ('Joe');
