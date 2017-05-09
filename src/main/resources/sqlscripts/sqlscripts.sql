CREATE TABLE Persons (
								PersonId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
								LastName varchar(255),
								FirstName varchar(255),
								DOB varchar(255),
								LastUpdtTs timestamp
								);
								
								
CREATE TABLE Address (
					AddressId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
					AddressLine1 varchar(255),
					AddressLine2 varchar(255),
					City varchar(255),
					State varchar(255),
					Zip varchar(255),
					LastUpdtTs timestamp,
					PersonId int,
					
					FOREIGN KEY (PersonId)   REFERENCES Persons(PersonId)
					);
					
CREATE TABLE Email (
					EmailId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
					EmailAddress varchar(255),
					EmailType varchar(50),
                    LastUpdtTs timestamp,
					PersonId int,
					
					FOREIGN KEY (PersonId)   REFERENCES Persons(PersonId)
					);
					
CREATE TABLE Phone (
					PhoneId int NOT NULL PRIMARY KEY AUTO_INCREMENT,
					PhoneType varchar(255),
					PhoneNumber varchar(255),
                    PhoneExt varchar(10),
					PersonId int,
                    LastUpdtTs timestamp,
					
					FOREIGN KEY (PersonId)   REFERENCES Persons(PersonId)
					);
                    