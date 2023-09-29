CREATE TABLE employee_details
(
    empid         uuid not null primary key,
    fullname            varchar(255),
    designation         varchar(255),
    mobile              varchar(255),
    email               varchar(255),
    date_of_birth         date

);

