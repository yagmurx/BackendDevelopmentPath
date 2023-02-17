# Homework 5

Perform the following query scenarios through the DVDRENTAL sample database.

1. List the longest Length 5 films in the film table that ends with the character of the film name (Title) 'n'.
    ```
    SELECT * FROM film
    WHERE title LIKE '%n'
    ORDER BY length DESC
    LIMIT 5;
    ```
2. List the shortest (6,7,8,9,10) films (6,7,8,9,10) 5 (6,7,8,9,10), which ends with the character of the film and ends with the character of the film.
    ```
    SELECT * FROM film
    WHERE title LIKE '%n'
    ORDER BY length ASC
    OFFSET 5 LIMIT 5;
    ```
3. In the ranking decreased according to the Last_name column in the Customer table, sort the first 4 data provided that the store_id 1 is 1.
    ```
    SELECT * FROM customer
    WHERE store_id = 1
    ORDER BY last_name DESC
    LIMIT 4;
    ```