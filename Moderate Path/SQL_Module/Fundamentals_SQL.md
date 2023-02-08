#  Fundamentals of SQL
- SQL is a declarative language.
- Queries are seperated by semicolumn [;]
- 

## SELECT 

```
SELECT column1 FROM table1
SELECT column1, column2 FROM table1
SELECT * FROM table1
SELECT column1 || ' ' || column2 FORUM table1
``` 

## WHERE

**COMPARISION OPERATORS**

```
SELECT * FROM table1
WHERE column1 = 'X';


SELECT * FROM table1
WHERE column2 > 14.99;
```

**LOGIC OPERATORS**

```
SELECT * FROM table1
WHERE column1 = 'X' AND column2 > 14.99;

SELECT * FROM table1
WHERE column1 = 'X' OR column1 = 'Y';

SELECT * FROM table1
WHERE NOT column1 = 14.99;

SELECT 0 FROM table1
WHERE column1 < 14.99 AND column1 > 9.99;  
```