DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS employee;
DROP TABLE IF EXISTS department;


CREATE TABLE department(
        department_id SERIAL PRIMARY KEY,
        department_name varchar(100) UNIQUE NOT NULL
        
);

CREATE TABLE employee(

        employee_id SERIAL PRIMARY KEY,
        job_title varchar(100) NOT NULL,
        first_name varchar(100) NOT NULL,
        last_name varchar(100) NOT NULL,
        gender varchar(100) NOT NULL,
        date_of_birth date NOT NULL,
        hire_date date,
        department_name varchar(100) NOT NULL,

        constraint fk_department_name foreign key (department_name) references department(department_name)
 
);

CREATE TABLE project(
        project_id SERIAL PRIMARY KEY,
        name varchar(100) NOT NULL,
        start_date date
        
);

CREATE TABLE employee_project(

        employee_id int not null,
        project_id int not null,
        
        constraint fk_employee_project_employee_id foreign key (employee_id) references employee(employee_id),
        constraint fk_employee_project_project_id foreign key (project_id) references project(project_id)    
    
);

INSERT INTO department (department_name) 
VALUES ('Cleric'), ('Fighter'), ('Wizard');

INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('Sales Manager','Greg', 'Spellweaver', 'Male', '1980-05-25', '2014-01-08','Wizard');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('IT Consultant','Bob', 'Crystalwing', 'Male', '1975-12-04', '2012-09-06', 'Cleric');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('Administrative Assistant','Samantha', 'Mountainchewer', 'Female', '1965-07-04', '2013-06-29', 'Cleric');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('Marketing Proffessional','Brian', 'Greatwalker', 'Male', '1945-09-14', '2010-08-015', 'Fighter');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('Accounts Receivable','Alex', 'Magicstream', 'Female', '1988-04-29', '2011-11-17', 'Wizard');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('Project Manager',' David', 'Whiteaxe', 'Male', '1955-03-11', '2016-05-03', 'Fighter');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('CFO','Lindsey', 'Wolfthorne', 'Female', '1976-09-17', '2017-09-03', 'Fighter');
INSERT INTO employee (job_title, first_name, last_name, gender, date_of_birth, hire_date, department_name) VALUES ('CEO','Jeff', 'Eaglesworn', 'Male', '1966-02-20', '2018-11-25', 'Wizard');

INSERT INTO project (name, start_date)
VALUES ('Curse of the broken printer', '2019-02-15'), ('Defeat Grondar the Auditor', '2019-02-01'), ('Complete the Budgeting Ritual', '2019-02-10'), ('Bring peace to the Warring ERP systems', '2019-02-15');

INSERT INTO employee_project (employee_id, project_id) 
VALUES (2, 1), (1, 2), (3, 3), (4, 4);

SELECT * FROM employee
JOIN employee_project ON employee.employee_id = employee_project.employee_id
JOIN project ON employee_project.project_id = project.project_id;

SELECT * FROM project
JOIN employee_project ON project.project_id = employee_project.project_id
JOIN employee ON employee.employee_id = employee.employee_id;

