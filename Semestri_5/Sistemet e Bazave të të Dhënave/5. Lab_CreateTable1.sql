CREATE DATABASE Laboratori;

DROP DATABASE Laboratori;

CREATE TABLE
    emri_tabeles (kolona1 INT, kolona2 VARCHAR(50), kolona3 DATE)
DROP TABLE emri_tabeles;

TRUNCATE TABLE emri_tabeles;

ALTER TABLE emri_tabeles
ALTER COLUMN kolona1 type VARCHAR(5);

ALTER TABLE emri_tabeles ADD Ditelindja DATE
CREATE TABLE
    persons (
        ID INT PRIMARY KEY NOT NULL,
        LastName VARCHAR(255) NOT NULL,
        FirstName VARCHAR(255) NOT NULL,
        Age INT
    );

DROP TABLE persons;

CREATE TABLE
    persons (
        ID INT NOT NULL,
        LastName VARCHAR(255) NOT NULL,
        FirstName VARCHAR(255) NOT NULL,
        Age INT,
        CONSTRAINT UC_Person UNIQUE (ID, LastName)
    );

ALTER TABLE persons ADD CONSTRAINT PK_Person PRIMARY KEY (ID, LastName)
ALTER TABLE persons
DROP CONSTRAINT UC_Person;

INSERT INTO
    persons (ID, LastName, FirstName, Age)
VALUES
    (1, 'Filan', 'Fisteku', 24),
    (2, 'Filan', 'Fisteku', 24),
    (3, 'Filan', 'Fisteku', 24),
    (4, 'Filan', 'Fisteku', 24);

SELECT * FROM persons
DROP TABLE persons;