CREATE SCHEMA IF NOT EXISTS gym;
USE gym;

DROP TABLE IF EXISTS exercise_schedule;
DROP TABLE IF EXISTS user;
DROP TABLE IF EXISTS abonement;
DROP TABLE IF EXISTS trainer;
DROP TABLE IF EXISTS person;
DROP TABLE IF EXISTS salary;
DROP TABLE IF EXISTS exercise_day;
DROP TABLE IF EXISTS exercise_program_has_exercise;
DROP TABLE IF EXISTS exercise_program;
DROP TABLE IF EXISTS exercise;

CREATE TABLE abonement (
	id INT PRIMARY KEY AUTO_INCREMENT,
    price DECIMAL NOT NULL,
    name VARCHAR(45)
);

CREATE TABLE person (
	id INT PRIMARY KEY AUTO_INCREMENT,
	name VARCHAR(45) NOT NULL,
    surname VARCHAR(45) NOT NULL,
    gender VARCHAR(45),
    age INT
);

CREATE TABLE user (
    person_id INT PRIMARY KEY,
    trainer_id INT NOT NULL,
	abonement_id INT NOT NULL
);

CREATE TABLE trainer (
    person_id INT PRIMARY KEY,
    salary_id INT NOT NULL
);

CREATE TABLE salary (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    salary INT NOT NULL,
    bonus INT NOT NULL
);

CREATE TABLE exercise_schedule (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    exercise_day_id INT NOT NULL,
    user_id INT NOT NULL,
    appointment_date DATE NOT NULL,
    ending_date DATE
);

CREATE TABLE exercise_day (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    exercise_program_id INT NOT NULL,
    day_name VARCHAR(10) NOT NULL
);

CREATE TABLE exercise_program (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL
);

CREATE TABLE exercise_program_has_exercise (
    exercise_program_id INT NOT NULL,
    exercise_id INT NOT NULL,
    CONSTRAINT PK_exercise_program_exercise PRIMARY KEY (exercise_program_id, exercise_id)
);

CREATE TABLE exercise (
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(45) NOT NULL,
    duration_in_minutes DECIMAL NOT NULL,
    muscle_group VARCHAR(45),
    repeats_quantity INT,
    burned_calories INT
);


INSERT INTO abonement(price, name) VALUES
	(12, 'normal'),
    (21, 'normal+'),
    (31, 'normal++'),
    (45, 'advanced'),
    (46, 'normal+++'),
    (29, 'medium'),
    (21, 'light+'),
    (50, 'advanced+'),
    (14, 'light'),
    (60, 'advanced++');

INSERT INTO user(person_id, trainer_id, abonement_id) VALUES
	(1, 1, 4),
    (12, 2, 2),
    (13, 3, 3),
    (14, 1, 1),
    (15, 6, 7),
    (16, 10, 9),
    (17, 2, 8),
    (18, 9, 6),
    (19, 7, 4),
    (11, 8, 3);

INSERT INTO salary(salary, bonus) VALUES
	(120, 30),
    (80, 20),
    (140, 30),
    (160, 40),
    (180, 0),
    (200, 10),
    (70, 40),
    (220, 0),
    (250, 30),
    (140, 60);

INSERT INTO trainer(person_id, salary_id) VALUES
	(1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6),
    (7, 3),
    (8, 8),
    (9, 9),
    (10, 7);

INSERT INTO person(name, surname, age, gender) VALUES
	('John', 'Doe', 21, 'male'),
    ('Doe', 'John', 23, 'male'),
    ('Joe', 'Dohn', 18, 'male'),
    ('Dohn', 'Joe', 19, 'male'),
    ('Roman', 'Marchuk', 21, 'male'),
    ('Ivan', 'Marchuk', 21, 'male'),
    ('Serghiy', 'Marchuk', 21, 'male'),
    ('Ivan', 'Marchuk', 20, 'male'),
    ('Pavlo', 'Petrov', 19, 'male'),
    ('Serghiy', 'Petrov', 32, 'male'),
    ('Ivan', 'Petrov', 18, 'male'),
    ('Oleg', 'Petrov', 32, 'male'),
    ('John', 'Petrov', 23, 'male'),
    ('Oleg', 'Doe', 33, 'male'),
    ('Serghiy', 'Doe', 32, 'male'),
    ('Ivan', 'Doe', 31, 'male'),
    ('John', 'Marchuk', 23, 'male'),
    ('Dohn', 'Doe', 24, 'male'),
    ('John', 'Petrov', 25, 'male'),
    ('Olena', 'Ivanivna', 26, 'female');

INSERT INTO exercise_schedule(user_id, exercise_day_id, appointment_date, ending_date) VALUES
	(11, 2,  '2019-8-13',  null),
    (12, 1,  '2019-9-13',  null),
    (13, 3,  '2019-10-13',  '2019-11-13'),
    (14, 4,  '2019-8-8',  '2019-9-8'),
    (1, 5,  '2019-8-7',   '2019-9-7'),
    (15, 6,  '2019-8-6',  null),
    (16, 7,  '2019-8-6',  null),
    (17, 8,  '2019-8-7',  '2019-10-7'),
    (18, 9,  '2019-9-13',  null),
    (13, 4,  '2019-8-10',  null);

INSERT INTO exercise_day(day_name, exercise_program_id) VALUES
	('tuesday', 1),
    ('tuesday', 3),
    ('sunday', 2),
    ('monday', 4),
    ('wednesday', 5),
    ('saturday', 1),
    ('tuesday', 6),
    ('tuesday', 9),
    ('saturday', 7),
    ('monday', 8);

INSERT INTO exercise_program(name) VALUES
	('legs program 1'),
    ('legs program 2'),
    ('legs program 3'),
    ('chest program 1'),
    ('chest program 2'),
    ('arms program 1'),
    ('arms program 2'),
    ('arms program 3'),
    ('global program 1'),
    ('global program 2');

INSERT INTO exercise_program_has_exercise(exercise_program_id, exercise_id) VALUES
	(1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
    (6, 6),
    (7, 7),
    (8, 5),
    (9, 6),
    (2, 6);

INSERT INTO exercise(name, duration_in_minutes, muscle_group, repeats_quantity, burned_calories) VALUES
	('legs ex 1', 2, 'legs', 5, 120),
    ('legs ex 2', 3, 'legs', 5, 120),
    ('legs ex 3', 4, 'legs', 5, 120),
    ('legs ex 4', 5, 'legs', 5, 120),
    ('legs ex 5', 6, 'legs', 5, 120),
    ('arms ex 1', 2, 'arms', 5, 120),
    ('arms ex 2', 3, 'arms', 5, 120),
    ('arms ex 3', 4, 'arms', 5, 120),
    ('arms ex 4', 5, 'arms', 5, 120),
    ('arms ex 5', 6, 'arms', 5, 120);


ALTER TABLE user
	ADD CONSTRAINT FK_user_person
    FOREIGN KEY (person_id)
    REFERENCES person(id),
    
    ADD CONSTRAINT FK_user_trainer
    FOREIGN KEY (trainer_id)
    REFERENCES trainer(person_id),
    
    ADD CONSTRAINT FK_user_abonement
    FOREIGN KEY (abonement_id)
    REFERENCES abonement(id);
    
ALTER TABLE trainer
	ADD CONSTRAINT FK_trainer_person
    FOREIGN KEY (person_id)
    REFERENCES person(id),
    
    ADD CONSTRAINT FK_trainer_salary
    FOREIGN KEY (salary_id)
    REFERENCES salary(id);
    
ALTER TABLE exercise_schedule
	ADD CONSTRAINT FK_exercise_schedule_exercise_day
    FOREIGN KEY (exercise_day_id)
    REFERENCES exercise_day(id),
    
    ADD CONSTRAINT FK_exercise_scedule_user
    FOREIGN KEY (user_id)
    REFERENCES user(person_id);
    
ALTER TABLE exercise_day
	ADD CONSTRAINT FK_exercise_day_exercise_program
    FOREIGN KEY (exercise_program_id)
    REFERENCES exercise_program(id);
    
ALTER TABLE exercise_program_has_exercise
	ADD CONSTRAINT FK_exercise_program_has_exercise_exercise_program
    FOREIGN KEY (exercise_program_id)
    REFERENCES exercise_program(id),
    
    ADD CONSTRAINT FK_exercise_program_has_exercise_exercise
    FOREIGN KEY (exercise_id)
    REFERENCES exercise(id);
    
CREATE INDEX person_name_surname
	ON person(name, surname);

CREATE INDEX exercise_muscle_group
	ON exercise(muscle_group);