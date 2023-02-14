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

## SUBQUERY AND JOIN
```
SELECT author.first_name, author.last_name, book.title, book.page_number
FROM author
INNER JOIN book
ON book.author_id = author.id
WHERE page_number >
(
    SELECT AVG(page_number) FROM book
);

SELECT actor.first_name, actor.last_name, film.title, film.length
FROM actor
INNER JOIN film_actor ON film_actor.actor_id = actor.actor_id
INNER JOIN film       ON film.film_id = film_actor.film_id
WHERE length =
(
    SELECT MAX(length) FROM film
);
```