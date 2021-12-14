create table socio (
	nif varchar(9) not null,
	nombre varchar(50) not null,
	fechaAlta date not null,
	foto varchar(30) not null,
	usuario varchar(30) not null,
	contraseña varchar(20) not null,
	constraint pk_socio primary key (nif)
);

create table factura (
	numero integer not null,
	fecha date not null,
	direccion varchar(30) not null,
	nifsocio varchar(9) not null,
	constraint pk_factura primary key (numero),
	constraint fk_socio foreign key (nifsocio) references socio(nif)
);

create table libro (
	cod integer not null,
	nombre varchar(40) not null,
	autor varchar(40) not null,
	precio decimal(5,2) not null,
	constraint pk_libro primary key (cod)
);

create table linea_factura (
	cod integer not null,
	nfactura integer not null,
	codlibro integer not null,
	cantidad integer not null,
	importe decimal not null,
	constraint pk_linea_factura primary key (cod, nfactura, codlibro),
	constraint fk_factura foreign key (nfactura) references factura(numero),
	constraint fk_libro foreign key (codlibro) references libro(cod)
);


insert into socio values('87665158Z', 'Alberto García López', '7/25/2010', '87665158Z.jpg', 'albergarlop250710', 'xtgwWv77PT');
insert into socio values('61133728G', 'Javier Gelo González', '3/21/2015', '61133728G.jpg', 'javgelgon210315', '6o9eRLWkw4');
insert into socio values('92326214M', 'María Díaz Alberti', '1/2/2017', '92326214M.jpg', 'mardiaalb020117', 'lRhqJWt7Me');
insert into socio values('46740602W', 'Antonio Claro Hombre', '8/18/2018', '46740602W.jpg', 'antclahom180818', 'wTcAWmCeex');
insert into socio values('89728163B', 'Fran Borrego Martínez', '3/29/2012', '89728163B.jpg', 'frabormar090312', 'ZlRc6kru75');
insert into socio values('66418268H', 'Bruno López Rodríguez', '5/15/2016', '66418268H.jpg', 'bruloprod150516', 'edbhdERXki');


insert into factura values(1, '7/2/2011', 'Larios, 9', '87665158Z');
insert into factura values(8, '9/12/2011', 'Larios, 9', '87665158Z');
insert into factura values(9, '10/27/2011', 'Larios, 9', '87665158Z');
insert into factura values(2, '3/28/2016', 'Colón, 2', '61133728G');
insert into factura values(3, '1/7/2018', 'Rafael Alberti, 21', '92326214M');
insert into factura values(4, '8/12/2019', 'Federico, 7', '46740602W');
insert into factura values(5, '3/15/2013', 'Un borrego, 1', '89728163B');
insert into factura values(6, '3/21/2013', 'Lolito Fernandez, 15', '66418268H');
insert into factura values(7, '5/24/2017', 'Rosario, 10', '66418268H');

insert into libro values(402, 'Don Quijote de la Mancha', 'Miguel de Cervantes', 8.50);
insert into libro values(496, 'Citas del Presidente Mao Tse-Tung', 'Mao Tse-Tung', 14.50);
insert into libro values(814, 'Harry Potter', 'J.K. Rowling', 11.99);
insert into libro values(5666, 'El Señor de los Anillos', 'J.R.R. Tolkien', 15.50);
insert into libro values(6401, 'El Alquimista', 'Paulo Coelho', 7.20);
insert into libro values(2662, 'El Código da Vinci', 'Dan Brown', 12.80);
insert into libro values(6446, 'Crepúsculo – La saga', 'Stephenie Meyer', 6.50);
insert into libro values(9550, 'Lo que el viento se llevó', 'Margaret Mitchell', 10.00);
insert into libro values(883, 'Piense y hágase rico', 'Napoleón Hill', 5.99);
insert into libro values(456, 'El diario de Ana Frank', 'Ana Frank', 10.99);

