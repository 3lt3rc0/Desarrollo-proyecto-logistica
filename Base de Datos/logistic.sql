CREATE TABLE Cliente (
    idCliente INT PRIMARY KEY,
    nombre VARCHAR(100),
    direccion VARCHAR(200)
);

CREATE TABLE Envio (
    idEnvio INT PRIMARY KEY,
    destino VARCHAR(100),
    estado VARCHAR(50),
    fechaEnvio DATE,
    fechaEntrega DATE
);

CREATE TABLE OrdenDeEnvio (
    idOrden INT PRIMARY KEY,
    idEnvio INT,
    idCliente INT,
    FOREIGN KEY (idEnvio) REFERENCES Envio(idEnvio),
    FOREIGN KEY (idCliente) REFERENCES Cliente(idCliente)
);
