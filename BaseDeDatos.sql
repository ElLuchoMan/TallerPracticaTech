CREATE TABLE Persona(
    Identificacion NUMERIC NOT NULL,
    Primer_Nombre VARCHAR(30) NOT NULL,
    Segundo_Nombre VARCHAR(30) NOT NULL,
    Primer_Apellido VARCHAR(30) NOT NULL,
    Segundo_Apellido VARCHAR(30) NOT NULL,
    Correo VARCHAR(200) NOT NULL,
    Direccion VARCHAR(200) NOT NULL,
    Numero_Celular NUMERIC NOT NULL,
    Password VARCHAR(50) NOT NULL,
    Id_Tipo NUMERIC NOT NULL,
    PRIMARY KEY(Identificacion)
);

CREATE TABLE Tipo_Usuario(
    Id_Tipo NUMERIC GENERATED BY DEFAULT ON NULL AS IDENTITY,
    Descripcion VARCHAR(200),
    PRIMARY KEY(Id_Tipo)
);

CREATE TABLE Cuenta(
    Id_Cuenta NUMERIC GENERATED BY DEFAULT ON NULL AS IDENTITY,
    Saldo FLOAT NOT NULL,
    Identificacion NUMERIC NOT NULL,
    Id_Tipo_Cuenta NUMERIC NOT NULL,
    Id_Sucursal NUMERIC NOT NULL,
    PRIMARY KEY(Id_Cuenta)
);

CREATE TABLE Debito_Credito(
    Fecha DATE NOT NULL,
    Aprobada NUMBER(1),
    Id_Transaccion NUMERIC NOT NULL,
    Id_Cuenta NUMERIC NOT NULL
);

CREATE TABLE Tipo_Cuenta(
    Id_Tipo_Cuenta NUMERIC GENERATED BY DEFAULT ON NULL AS IDENTITY,
    Descripcion VARCHAR(200) NOT NULL,
    Tasa_Interes FLOAT NOT NULL,
    PRIMARY KEY(Id_Tipo_Cuenta)
);

CREATE TABLE Sucursal(
    Id_Sucursal NUMERIC GENERATED BY DEFAULT ON NULL AS IDENTITY,
    Descripcion VARCHAR(200) NOT NULL,
    PRIMARY KEY(Id_Sucursal)
);

CREATE TABLE TRANSACCION(
    Id_Transaccion NUMERIC GENERATED BY DEFAULT ON NULL AS IDENTITY,
    Valor_Transaccion FLOAT NOT NULL,
    Id_Tipo_Transaccion NUMERIC NOT NULL,
    PRIMARY KEY(Id_Transaccion)
);

CREATE TABLE Tipo_Transaccion(
    Id_Tipo_Transaccion NUMERIC GENERATED BY DEFAULT ON NULL AS IDENTITY,
    Descripcion VARCHAR(200) NOT NULL,
    Costo_Transaccion FLOAT NOT NULL,
    PRIMARY KEY(Id_Tipo_Transaccion)
);

ALTER TABLE Persona
    ADD CONSTRAINT FK_Tipo_Usuario
    FOREIGN KEY (Id_Tipo)
    REFERENCES Tipo_Usuario(Id_Tipo);