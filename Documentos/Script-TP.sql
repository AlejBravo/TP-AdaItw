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
		'Una estructura de control en java es una declaración que determina si las otras declaraciones se ejecutarán o no. Controla el flujo de un programa.'),
		(2,
		2, 
		'Declaración if-then',
		'Es la declaración más básica entre todas las declaraciones de flujo de control en Java. Evalúa una expresión booleana y permite que el programa ingrese un bloque de código si la expresión se evalúa como verdadera.'),
		(2,
		3, 
		'Declaración if-then-else',
		'La sentencia if-else es una extensión de la sentencia if, que usa otro bloque de código, es decir, el bloque else. El bloque else se ejecuta si la condición del bloque if se evalúa como falsa.'),
		 (2,
		4, 
		'Declaración switch',
		'Las sentencias Switch son similares a las sentencias if-else-if. La declaración switch contiene varios bloques de código llamados casos y se ejecuta un solo caso en función de la variable que se está cambiando. La instrucción switch es más fácil de usar en lugar de las instrucciones if-else-if. También mejora la legibilidad del programa.'),
		 (2,
		5, 
		'Declaración while',
		'Es el bucle más común, el ciclo while evalúa una determinada condición. Si la condición es verdadera, se ejecuta el código. Este proceso continúa hasta que la condición especificada resulta ser falsa. La condición que se especificará en el ciclo while debe ser una expresión booleana. Se generará un error si el tipo utilizado es int o una cadena.'),
		(2,
		6, 
		'Declaración do-while',
		'El ciclo do-while es similar al ciclo while, la única diferencia es que la condición en el ciclo do-while se evalúa después de la ejecución del cuerpo del ciclo. Esto garantiza que el bucle se ejecute al menos una vez.'),
		(2,
		7, 
		'Declaración for',
		'El bucle for en java se usa para iterar y evaluar un código varias veces. Cuando el usuario conoce el número de iteraciones, se recomienda utilizar el bucle for.');

insert into Preguntas(contenido_pregunta, id_concepto)
	values ('¿Cúal es la función de las estructuras de control?',1),
	('¿Cúantas condiciones puede evaluar la declaracion if-then?',2),
	('¿Con qué tipo de bucle podemos simular un for?',5),
	('El bucle while se considera un bucle controlado por sucesos.¿Verdadero o falso?',7),
	('¿Que palabra clave se utiliza para generar paquetes en java?',5);

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
	('Estructuras de control','instrucción 1; instrucción 2; if(condición){  instrucción 3; instrucción 4; }instrucción 5; instrucción 6;',1),
	('Declaración if-then', 'if(hourOfDay < 11) System.out.println("Good Morning");',2),
	('Declaración if-then-else','if(hourOfDay < 11) { System.out.println("Good Morning"); }if(hourOfDay >= 11) { System.out.println("Good Afternoon");}',3);
	