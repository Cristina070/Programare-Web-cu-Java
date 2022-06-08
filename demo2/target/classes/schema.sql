CREATE TABLE employees (
    id long not null auto_increment primary key,
    first_name varchar(100) not null,
    last_name varchar(100) not null,
    email varchar(100) not null
)

CREATE TABLE departments (
    id long not null auto_increment primary key,
    name varchar(100) not null,
    building_name long not null
)

CREATE TABLE projects (
    id long not null auto_increment primary key,
    description varchar(255) not null,
    budget double not null
)