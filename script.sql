CREATE DATABASE MY_DB;
USE MY_DB;
CREATE TABLE EMPLOYEE (
	id INT PRIMARY KEY,
    name VARCHAR(50),
    img_url VARCHAR(500)
);
INSERT INTO EMPLOYEE VALUES (1, 'Dhoni', 'https://images.indianexpress.com/2019/11/ms-dhoni-1200.jpg');
INSERT INTO EMPLOYEE VALUES (2, 'Kohli', 'https://amp.thenationalnews.com/image/policy:1.756607:1533232422/Britain-India-Cricket.jpg?f=16x9&w=1200&$p$f$w=28f9200');
INSERT INTO EMPLOYEE VALUES (3, 'Bumrah', 'https://cricketaddictor.com/wp-content/uploads/2019/07/290239-e1562489446974.jpg');