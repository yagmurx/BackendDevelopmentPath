# Works with Tables


## Creating a database
```
CREATE TABLE <table_name> (
	<column_name> <data_type> <constraint>,
	...
	<column_name> <data_type> <constraint>
);

CREATE TABLE author (
	id SERIAL PRIMARY KEY,
	first_name VARCHAR(50) NOT NULL,
	last_name VARCHAR(50) NOT NULL,
	email VARCHAR(100),
	birthday DATE
);

// CREATING A TABLE WITH SAME COLUMN NAMES OF ANOTHER TABLE

CREATE TABLE author2(LIKE author);

// DUPLACATING A TABLE WITH ITS DATA
CREATE TABLE author3 AS
SELECT * FROM author;

```
## Adding data to database
```
INSERT INTO author(first_name, last_name, email, birthday)
VALUES
	('Haruki', 'Murakami', 'haruki@murakami.com', '1948-11-07'),
	('Sabahattin', 'Ali', 'sabahattin@ali.com', '1914-07-11'),
	('Orhan', 'Pamuk', 'orhan@pamuk.com', '1950-04-14'),
	('Halide Edip', 'Adıvar', 'halide@edip.com', '1884-07-11'),
	('Zygmunt', 'Bauman', 'zygmunt@bauman.com', '1911-07-12');

// COPYING ROWS FROM ANOTHER TABLE
INSER INTO author2
SELECT * FROM author
WHERE first_name = 'Sabahattin'
```

## Deleting a database
```
DROP TABLE author3;
```

## UPDATE & DELETE
```
UPDATE <table_name>
SET column1 = value1,
	column2 = value2,
	...
WHERE condition;

UPDATE author
SET first_name = 'Emrah Safa',
	last_name = 'Gürkan',
	email = 'emrah@gurkan.com',
	birthday = '1980-01-01'
WHERE id = 10;


DELETE FROM <table_name>
WHERE condition;
	 
``` 

## PRIMARY & FOREIGN KEY
```
CREATE TABLE book (
	id SERIAL PRIMARY KEY,
	title VARCHAR(100) NOT NULL,
	page_number INTEGER NOT NULL,
	author_id INTEGER REFERENCES author(id)
);
```

## DATATYPES
[PostgreSQL Docs](https://www.postgresql.org/docs/current/datatype.html)

## ALTER & NOT NULL
```
ALTER TABLE users
ALTER COLUMN username
SET NOT NULL;

DELETE FROM users
WHERE username IS NULL;
```

## UNIQUE
```
CREATE TABLE users (
	id SERIAL PRIMARY KEY,
	username VARCHAR(20) NOT NULL,
	email VARCHAR(50) UNIQUE,
	age INT
);

ALTER users
ADD UNIQUE(email); 
```
## CHECK
```
CREATE TABLE products (
	product_no INTEGER,
	name TEXT,
	price NUMERIC CHECK(price > 0),
	discounted_price NUMERIC CHECK(discounted_price > 0),
	CHECK (price > discounted_price)
); 

ALTER TABLE users
ADD CHECK (age > 18);
```