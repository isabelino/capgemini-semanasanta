INSERT INTO regiones (nombre) VALUES ('Europa');
INSERT INTO regiones (nombre) VALUES ('Asia');
INSERT INTO regiones (nombre) VALUES ('Africa');
INSERT INTO regiones (nombre) VALUES ('Oceania');
INSERT INTO regiones (nombre) VALUES ('CentroAmerica');
INSERT INTO regiones (nombre) VALUES ('NorteAmerica');
INSERT INTO regiones (nombre) VALUES ('Sudamerica');
INSERT INTO regiones (nombre) VALUES ('Antartida');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(1,'Carlos','Lopez','clo@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(2,'Jose','Perez','jp@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(3,'Maria','Calles','mc@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(4,'Dina','Gonzalez','dg@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(5,'Pepe','Mujica','pm@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(6,'Juan','Chavez','jc@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(7,'Pedro','Diaz','pd@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(8,'Ramon','Sanchez','cl@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(2,'Luis','Garcia','lg@email.com',2323221,'2022-04-11');
INSERT INTO clientes (region_id,nombre,apellido,email,telefono,created_at) VALUES(1,'Emilio','Iglesias','ei@email.com',2323221,'2022-04-11');

INSERT INTO usuarios (username,password,enabled) VALUES('rolando','$2a$10$BMjXwei6SpTy231xwDwoa.3zWuLfPSY0DtMKRg81bXQ7AJzCLMLfO',1);
INSERT INTO usuarios (username,password,enabled) VALUES('admin','$2a$10$9Lc06wyeN5YSmA64AkIsq.HA/k8RwZw3rbL5IyZWAvuQqsRojLQ0q',1);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(1,1);
INSERT INTO usuarios_roles (usuario_id,role_id) VALUES(2,2);