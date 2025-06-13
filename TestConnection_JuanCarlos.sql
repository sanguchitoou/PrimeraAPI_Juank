--Creación de Usuario
CREATE USER C##JUANCARLOS_PRACTICA IDENTIFIED BY "1234";

GRANT CONNECT TO C##JUANCARLOS_PRACTICA;
GRANT ALL PRIVILEGES TO C##JUANCARLOS_PRACTICA;
GRANT RESOURCE TO C##JUANCARLOS_PRACTICA;


--Creación de la tabla
CREATE TABLE tbUsuario(
    idUsuario               INT PRIMARY KEY,
    nombre                  VARCHAR2(35),
    apellido                VARCHAR2(35)
);

INSERT ALL
    INTO tbUsuario (idUsuario, nombre, apellido) VALUES (1, 'Andrée Alessandro', 'Orellana Sandoval')
    INTO tbUsuario (idUsuario, nombre, apellido) VALUES (2, 'Juan Carlos', 'Rodríguez Funes')
    INTO tbUsuario (idUsuario, nombre, apellido) VALUES (3, 'Jennifer Subía', 'Al faro Tocineta')
SELECT 1 FROM dual;

SELECT * FROM tbUsuario;