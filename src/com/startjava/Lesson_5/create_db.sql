CREATE TABLE jaegers ( 
	id SERIAL PRIMARY KEY, 
	modelName TEXT, 
	mark INTEGER, 
	height NUMERIC(4, 2), 
	weight NUMERIC(4, 3), 
	status TEXT, 
	origin TEXT, 
	launch DATE, 
	kaijuKill INTEGER
);
\i D:/Java/StartJava/src/com/startjava/Lesson_5/init_db.sql
\i D:/Java/StartJava/src/com/startjava/Lesson_5/queries.sql