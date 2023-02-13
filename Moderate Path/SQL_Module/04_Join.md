# JOIN METHODS


![SQL JOIN TYPES SCHEME](https://www.dofactory.com/img/sql/sql-joins.png)

## INNER JOIN
```
SELECT column1, column2, ... FROM table1
INNER JOIN table2
ON table1.column1 = table2.column2;

// It shows all columns by connecting two table. 
SELECT * FROM book
INNER JOIN author ON book.author_id = author.id;

// It shows that titles from book table, first_name and last_name from author table
SELECT title, first_name, last_name FROM book
INNER JOIN author ON book.author_id = author.id;

// You can also write tables  
SELECT book.title, author.first_name, author.last_name FROM book
INNER JOIN author ON book.author_id = author.id;
```

## LEFT & RIGHT JOIN

```
// It gets all data from table2 and matches with columns of table1
SELECT column1, column2 ...
FROM table1
RIGHT JOIN table2
ON table1.column1 = table2.column2;

// It gets all data from table2 and matches with columns of table1
SELECT column1, column2 ...
FROM table1
LEFT JOIN table2
ON table1.column1 = table2.column2;
```

## FULL JOIN
```
SELECT * FROM book
FULL JOIN author ON author.id = book.author_id;

// Finding rows that aren't match
SELECT * FROM author
FULL OUTER JOIN book ON author.id = book.author_id
WHERE (book.id IS NULL OR author.id IS NULL)
```

## UNION
```
(
    SELECT * FROM book
    ORDER BY page_number DESC
    LIMIT 5
)
UNION //If there is an itersection, it doesn't show the duplicate data. For showing that use 'UNION ALL' 
(
    SELECT * FROM book
    ORDER BY title
    LIMIT 5
);
```

## INTERSECT & EXCEPT
```
(
    SELECT * FROM book
    ORDER BY page_number DESC
    LIMIT 5
)
INTERSECT // Get intersection of two query
(
    SELECT * FROM book
    ORDER BY title
    LIMIT 5
);

[a, b, c, d, e] [e, f, g, h, j] INTERSECT = [e]

(
    SELECT * FROM book
    ORDER BY page_number DESC
    LIMIT 5
)
EXCEPT // Get first query results which is not intersect of second query
(
    SELECT * FROM book
    ORDER BY title
    LIMIT 5
);
[a, b, c, d, e] [e, f, g, h, j] EXCEPT = [a, b, c, d]
```