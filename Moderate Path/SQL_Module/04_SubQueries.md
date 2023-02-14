# SUBQUERIES

## SUBQUERY

```
//This query gets books which are longer than The Alchemist.

SELECT * FROM book
WHERE page_number > 
(
    SELECT page_number FROM book
    WHERE title = 'The Alchemist'
);


SELECT title, page_number, (SELECT MAX(page_number) FROM book), ((SELECT MAX(page_number) FROM book) - page_number) AS differ
FROM book
WHERE page_number >
(
    SELECT page_number FROM book
    WHERE title = 'The Alchemist'
);

| title | page_number | max | differ | 
+-------+-------------+-----+--------+
| AAAAA |     555     | 888 |  333   |
+-------+-------------+-----+--------+
| BBBBB |     421     | 888 |  467   |
```

## ANY & ALL

```
// It returns two ID values
SELECT first_name, last_name
FROM Author
WHERE id = ANY
(
    SELECT id
    FROM book
    WHERE title = 'The Alchemist' OR 'Blindless'
);

//It returns  ID values equal or more than queries' ID
SELECT first_name, last_name
FROM Author
WHERE id > ANY
(
    SELECT id
    FROM book
    WHERE title = 'The Alchemist' OR 'Blindless'
);

//It returns all ID values more than queries' ID
SELECT first_name, last_name
FROM Author
WHERE id > ALL
(
    SELECT id
    FROM book
    WHERE title = 'The Alchemist' OR 'Blindless'
);
```