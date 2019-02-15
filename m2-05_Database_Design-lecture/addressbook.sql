DROP TABLE IF EXISTS owner_pet;
DROP TABLE IF EXISTS owner;
DROP TABLE IF EXISTS pet;
DROP TABLE IF EXISTS visit_procedure;
DROP TABLE IF EXISTS visit;
DROP TABLE IF EXISTS procedure;


CREATE TABLE owner(
        
        owner_id serial primary key,
        first_name varchar(100) NOT NULL,        
        last_name varchar(100) NOT NULL
        
);

CREATE TABLE pet(
        pet_id SERIAL PRIMARY KEY,
        pet_name varchar(100) NOT NULL,
        pet_type varchar(100) NOT NULL,
        pet_age varchar(100) NOT NULL
        
);

CREATE TABLE owner_pet(
        
        owner_id int not null,
        pet_id int not null,
        
        constraint fk_owner_id foreign key (owner_id) references owner(owner_id),
        constraint fk_pet_id foreign key (pet_id) references pet(pet_id)
        
);


CREATE TABLE visit(
        visit_id SERIAL PRIMARY KEY,
        pet_id int NOT NULL,
        visit_date TIMESTAMP NOT NULL

);

CREATE TABLE procedure(
        procedure_id SERIAL PRIMARY KEY,
        procedure_name varchar(100) NOT NULL
 
);

CREATE TABLE visit_procedure(
        
        visit_id int not null,
        procedure_id int not null,
        
        constraint fk_visit_id foreign key (visit_id) references visit(visit_id),
        constraint fk_procedure_id foreign key (procedure_id) references procedure(procedure_id)
                
);



     