DROP DATABASE IF EXISTS TestingExam;
CREATE DATABASE TestingExam;

USE TestingExam;


CREATE TABLE `User`(
	userId INT PRIMARY KEY AUTO_INCREMENT,
    FullName VARCHAR(50) NOT NULL , 
    Email VARCHAR(50) UNIQUE KEY NOT NULL, 
    `Password` VARCHAR(50) NOT NULL ,
    isAdmin BOOLEAN,
    ExpInYear INT ,
    Proskill VARCHAR(50) 
);

INSERT INTO `User` (FullName, Email, Password, isAdmin, ExpInYear, Proskill) VALUES
('Nguyen Van A', 'nguyen.vana@vti.com.vn', 'Password1', TRUE, 5, NULL),
('Tran Thi B', 'tran.thib@vti.com.vn', 'SecurePass', FALSE, NULL, 'Python'),
('Le Van C', 'le.vanc@vti.com.vn', 'PassWord2', FALSE, NULL, 'C++'),
('Pham Thi D', 'pham.thid@vti.com.vn', 'MyPasswd', TRUE, 7, NULL),
('Hoang Van E', 'hoang.vane@vti.com.vn', 'StrongPw', FALSE, NULL, 'Kotlin'),
('Dang Thi F', 'dang.thif@vti.com.vn', 'GoodPass1', TRUE, 10, NULL),
('Bui Van G', 'bui.vang@vti.com.vn', 'BestPwd', FALSE, NULL, 'PHP'),
('Ngo Thi H', 'ngo.thih@vti.com.vn', 'NicePass', FALSE, NULL, 'Ruby'),
('Vu Van I', 'vu.vani@vti.com.vn', 'CoolPass', TRUE, 8, NULL),
('Do Thi J', 'do.thij@vti.com.vn', 'SafePwd1', FALSE, NULL, 'TypeScript');
