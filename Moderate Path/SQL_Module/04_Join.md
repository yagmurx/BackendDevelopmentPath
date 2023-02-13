# JOIN METHODS
- Inner join


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