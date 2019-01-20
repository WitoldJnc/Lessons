CREATE TABLE `students` (
	`student_id` int NOT NULL AUTO_INCREMENT,
	`student_name` varchar(40) NOT NULL,
	`group_id` int NOT NULL,
	PRIMARY KEY (`student_id`)
);

CREATE TABLE `disciplines` (
	`discipline_id` int NOT NULL AUTO_INCREMENT,
	`discipline_name` varchar(30) NOT NULL,
	PRIMARY KEY (`discipline_id`)
);

CREATE TABLE `school_groups` (
	`group_id` int NOT NULL AUTO_INCREMENT,
	`group_number` int NOT NULL,
	PRIMARY KEY (`group_id`)
);

CREATE TABLE `marks` (
	`mark_id` int NOT NULL AUTO_INCREMENT,
	`mark` int NOT NULL,
	`discipline_id` int NOT NULL,
	`student_id` int NOT NULL,
	PRIMARY KEY (`mark_id`)
);

CREATE TABLE `group_discipline` (
	`group_id` int NOT NULL,
	`discipline_id` int NOT NULL
);

ALTER TABLE `group_discipline` ADD CONSTRAINT `group_discipline_fk0` FOREIGN KEY (`group_id`) REFERENCES `school_groups`(`group_id`);

ALTER TABLE `group_discipline` ADD CONSTRAINT `group_discipline_fk1` FOREIGN KEY (`discipline_id`) REFERENCES `disciplines`(`discipline_id`);

ALTER TABLE `marks` ADD CONSTRAINT `marks_fk0` FOREIGN KEY (`discipline_id`) REFERENCES `group_discipline`(`discipline_id`);

ALTER TABLE `marks` ADD CONSTRAINT `marks_fk1` FOREIGN KEY (`student_id`) REFERENCES `students`(`student_id`);

ALTER TABLE `students` ADD CONSTRAINT `students_fk0` FOREIGN KEY (`group_id`) REFERENCES `school_groups`(`group_id`);