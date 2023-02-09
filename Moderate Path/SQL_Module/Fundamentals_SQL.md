#  Fundamentals of SQL
- SQL is a declarative language.
- Queries are seperated by semicolumn [;]
- Komutlar key sensitive değildir.
- Karşılaştırma veya arama yapılan veriler key sensitivedir.

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

## BETWEEN & IN

```
 SELECT column1, column2 FROM table1
 WHERE column2 BETWEEN 90 AND 120;

 SELECT column1, column2 FROM table
 WHERE (column1 BETWEEN 2 AND 4) AND (column2 BETWEEN 10 AND 20);

 SELECT * FROM table1
 WHERE length IN (40, 50, 60);
```

## LIKE & ILIKE

```
SELECT * FROM table1
WHERE column1 LIKE 'A%'; // '%y' or 'A%y' possibiles

SELECT * FROM table1
WHERE column1 ILIKE 'a%';

SELECT * FROM table1
WHERE column1 LIKE 'J_n';

SELECT * FROM table1
WHERE column1 ~~ 'B%';

SELECT * FROM table1
WHERE column1 ~~* 'b%';
```

## DISTINCT & COUNT

```
SELECT DISTINCT column1 FROM table1; //benzersiz değerleri döndürür

SELECT DISTINCT column1 FROM table1
WHERE column1 LIKE 'A%';

SELECT COUNT(column1) FROM table1
WHERE column1 LIKE 'A%';
```