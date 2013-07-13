CREATE TABLE user (ID BIGINT GENERATED BY DEFAULT AS IDENTITY (START WITH 1 INCREMENT BY 1) NOT NULL, 
	ADDRESS VARCHAR(255), 
	DOB DATE, 
	NAME VARCHAR(255), 
	PRIMARY KEY (ID));
