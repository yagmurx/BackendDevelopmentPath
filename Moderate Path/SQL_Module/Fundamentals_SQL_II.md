# Fundamentals of SQL II
- Typically a table is not ordered. For ordering a table we use ORDER BY.
- ORDER BY is writing after WHERE command.
- 

## ORDER BY
```
SELECT * FROM table1
ORDER BY column1 ASC;

SELECT * FROM table1
ORDER BY column1 DESC;

SELECT column1, column2 FROM table1
ORDER BY column1 ASC, column2 DESC;

SELECT column1 FROM table1
WHERE column3 LIKE 'A%'
ORDER BY column1 ASC;
```

## LIMIT & OFFSET
```
SELECT * FROM table1
WHERE column1 = 9.99
ORDER BY column2
LIMIT 20;

SELECT * FROM table1
OFFSET 6
LIMIT 4;
```

## AGGREGATE FUNCTIONS
```
SELECT MAX(column1) FROM table1;

SELECT MIN(column1) FROM table1;

SELECT AVG(column1) FROM table1;

SELECT ROUND(AVG(column1), 3) FROM table1;

SELECT SUM(column1) FROM table1;
```