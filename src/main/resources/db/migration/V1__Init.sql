DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id SERIAL PRIMARY KEY,
    first_name varchar(255),
    last_name varchar(255),
    nationality varchar(255),
    availability_date DATE,
    sex varchar(255),
    civil_sate varchar(255),
    children_number int,
    family_members_number int,
    home_place int,
    home_place_from DATE,
    education_level varchar(255),
    current_mobile_number varchar(255),
    salary_mdl int

);

DROP IF EXISTS repayment_history;
CREATE TABLE repayment_history
(
    
)
