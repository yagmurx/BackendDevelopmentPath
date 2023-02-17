# HOMEWORK 3

Perform the following query scenarios through the DVDRENTAL sample database.

1. List the ones that start with the 'A' character of the country's names in the Country column in the Country table and end with 'A' character.
   ```
    SELECT country FROM country
    WHERE country LIKE 'A%a';
    ```

2. List the ones in the Country table, which consists of at least 6 characters in the country column and end with the end of the 'N' character.
    ```
    SELECT country FROM country
    WHERE country LIKE '_____%n'
    ```

3. List the movie names containing at least 4 large or lowercase -free 't' character of the film names in the Title column in the film table.
    ```
    SELECT title FROM film
    WHERE title ILIKE '%T%';
    ```
4. List the data that starts with the Title 'C' character from the data in all columns in the film table and has a length of 90 and is more than 90 and Rental_rate 2.99.
    ```
    SELECT * FROM film
    WHERE title ILIKE 'C%' AND length > 90 AND rental_rate=2.99;
    ```