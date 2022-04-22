create DATABASE if not exists TpJavaBot

use TPJavaBot;

-- CONCEPTOS --
CREATE TABLE if not exists Conceptos (
    id_concepto int auto_increment, 
    nombre_concepto varchar(50),
    id_capitulo int,
    numero_concepto int,
    contenido_concepto LONGTEXT,
    PRIMARY key(id_concepto)
);

-- PREGUNTAS --
CREATE TABLE if not exists Preguntas (
    id_pregunta int PRIMARY key auto_increment,
    contenido_pregunta varchar(255) not null,
    id_concepto int not null,
    FOREIGN KEY (id_concepto) REFERENCES Conceptos(id_concepto)
);

-- RESPUESTAS --
CREATE TABLE if not exists Respuestas (
    id_respuesta int PRIMARY key auto_increment,
    contenido_respuestas varchar(255) not null,
    id_pregunta int not null,
    es_correcta boolean not null,
    FOREIGN KEY (id_pregunta) REFERENCES Preguntas(id_pregunta)
);

-- EJEMPLOS --
CREATE TABLE if not exists Ejemplos (
    id_ejemplos int PRIMARY key auto_increment,
    descripcion_ejemplo varchar(255),
    contenido_ejemplo varchar(255),
    id_concepto int,
    FOREIGN key (id_concepto) REFERENCES Conceptos(id_concepto)
);

-- INGRESO DE DATOS --
	
insert into conceptos (id_capitulo,
    numero_concepto,
    nombre_concepto,
    contenido_concepto)
	values (2,
		1, 
		'Estructuras de control',
		'Una estructura de control en java es una declaraci�n que determina si las otras declaraciones se ejecutar�n o no. Controla el flujo de un programa.'),
		(2,
		2, 
		'Declaraci�n if-then',
		'Es la declaraci�n m�s b�sica entre todas las declaraciones de flujo de control en Java. Eval�a una expresi�n booleana y permite que el programa ingrese un bloque de c�digo si la expresi�n se eval�a como verdadera.'),
		(2,
		3, 
		'Declaraci�n if-then-else',
		'La sentencia if-else es una extensi�n de la sentencia if, que usa otro bloque de c�digo, es decir, el bloque else. El bloque else se ejecuta si la condici�n del bloque if se eval�a como falsa.'),
		 (2,
		4, 
		'Declaraci�n switch',
		'Las sentencias Switch son similares a las sentencias if-else-if. La declaraci�n switch contiene varios bloques de c�digo llamados casos y se ejecuta un solo caso en funci�n de la variable que se est� cambiando. La instrucci�n switch es m�s f�cil de usar en lugar de las instrucciones if-else-if. Tambi�n mejora la legibilidad del programa.'),
		 (2,
		5, 
		'Declaraci�n while',
		'Es el bucle m�s com�n, el ciclo while eval�a una determinada condici�n. Si la condici�n es verdadera, se ejecuta el c�digo. Este proceso contin�a hasta que la condici�n especificada resulta ser falsa. La condici�n que se especificar� en el ciclo while debe ser una expresi�n booleana. Se generar� un error si el tipo utilizado es int o una cadena.'),
		(2,
		6, 
		'Declaraci�n do-while',
		'El ciclo do-while es similar al ciclo while, la �nica diferencia es que la condici�n en el ciclo do-while se eval�a despu�s de la ejecuci�n del cuerpo del ciclo. Esto garantiza que el bucle se ejecute al menos una vez.'),
		(2,
		7, 
		'Declaraci�n for',
		'El bucle for en java se usa para iterar y evaluar un c�digo varias veces. Cuando el usuario conoce el n�mero de iteraciones, se recomienda utilizar el bucle for.');

insert into Preguntas(contenido_pregunta, id_concepto)
	values ('�C�al es la funci�n de las estructuras de control?',1),
	('�C�antas condiciones puede evaluar la declaracion if-then?',2),
	('�Con qu� tipo de bucle podemos simular un for?',5),
	('El bucle while se considera un bucle controlado por sucesos.�Verdadero o falso?',7),
	('�Que palabra clave se utiliza para generar paquetes en java?',5);

insert into Respuestas(contenido_respuestas, id_pregunta, es_correcta)
	values ('Controlar el flujo del programa',1, true),
	('Controlar las clases del programa',1,false),
	('Son las instancias de una clase',1,false),
	('Todas las posibles',2, false),
	('Solo una.',2,true),
	('Ninguna',2,false),
	(' Con un bucle while',3, false),
	('Con un bucle do-while',3,false),
	('Con cualquier bucle controlado por sucesos combinado con variables contadoras dentro y fuera de los bucles.',3,true),
	('Verdadero',2,true),
	('Falso',2,false);

INSERT INTO ejemplos (descripcion_ejemplo,contenido_ejemplo,id_concepto) 
	VALUES 
	('Estructuras de control','instrucci�n 1; instrucci�n 2; if(condici�n){  instrucci�n 3; instrucci�n 4; }instrucci�n 5; instrucci�n 6;',1),
	('Declaraci�n if-then', 'if(hourOfDay < 11) System.out.println("Good Morning");',2),
	('Declaraci�n if-then-else','if(hourOfDay < 11) { System.out.println("Good Morning"); }if(hourOfDay >= 11) { System.out.println("Good Afternoon");}',3);
	