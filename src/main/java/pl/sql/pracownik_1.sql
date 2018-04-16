USE My_schema;

CREATE TABLE Pracownik (
  id       BIGINT NOT NULL AUTO_INCREMENT,
  imie     VARCHAR(50),
  nazwisko VARCHAR(50),
  wiek     INT,
  pesel    BIGINT,
  placa    DECIMAL(7, 2),
  PRIMARY KEY (id)
);

DROP TABLE Pracownik;

INSERT INTO Pracownik (imie, nazwisko, wiek, pesel, placa)
VALUES ("Wiktor", "Magiera", 33, 121212121, 1800.00),
  ("Stanislawa", "Rogowska", 87, 999999998, 1200.98),
  ("Kazimierz", "Tarkowski", 56, 777765765, 5600.20),
  ("Brygida", "Hinca", 47, 533343536, 2700.50),
  ("Mishal", "Suchodolski", 38, 332324235, 2800.40),
  ("Basia", "Winska", 57, 786253917, 1750.60),
  ("Renata", "Kowalska", 42, 562998917, 2230.90),
  ("Franciszek", "Potocki", 47, 882222927, 2800.40);

INSERT INTO Pracownik(imie, nazwisko, wiek, pesel, placa)
VALUES ("Dominika", "Piotrowska", 26, 298137746, 2000.00),
  ("Renata", "Molenda", 47, 736281937, 2200.40),
  ("Waldemar", "Kiepski", 17, 123434561, 3000.00);

INSERT INTO Pracownik
VALUES (2, "Daniel", "Lewkowski", 38, 987654321, 3500.68);

SELECT * FROM Pracownik;

SELECT CONCAT(imie," ", nazwisko," ",  wiek) AS "Kto" FROM Pracownik;

SELECT imie AS "Imie", nazwisko AS "Nazwisko", 2018-wiek AS "Urodzony"
FROM Pracownik;

SELECT * FROM Pracownik
WHERE wiek > 30;

SELECT * FROM  Pracownik
WHERE placa > 3000;

SELECT * FROM Pracownik
WHERE wiek >30 AND placa > 2000;

ALTER TABLE Pracownik
  ADD COLUMN city VARCHAR(25);

SELECT * FROM Pracownik;

UPDATE Pracownik
SET city = "Hel"
WHERE id = 21;

SELECT * FROM Pracownik
WHERE imie LIKE 'D%'
      AND id < 10;

SELECT * FROM Pracownik
ORDER BY placa DESC;

SELECT city, COUNT(city) AS "ile miast", MAX(city) FROM Pracownik
GROUP BY city;













