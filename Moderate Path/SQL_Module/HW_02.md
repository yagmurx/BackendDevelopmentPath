# HOMEWORK 2

Perform the following query scenarios through the DVDRENTAL sample database.

1. Sort the data in all columns in the film table, provided that the Replacement Cost value is greater than 12.99 and 16.99 small (use Between - and its structure.)
    ```
    SELECT * FROM film
    WHERE replacement_cost BETWEEN 12.99 AND 16.99;
    ```
2. List the data in the first_name and last_name columns in the table table provided that the first_name 'penelope' or 'nick' or 'ed' values. (Use In Operator.)
    ```
    SELECT first_name, last_name FROM actor
    WHERE first_name IN('Penelope', 'Nick', 'Ed');
    ```
3. Rental_rate 0.99, 2.99, 4.99, and replace_cost 12.99, 15.99, 28.99. (Use In Operator.)
    ```
    SELECT * FROM film
    WHERE rental_rate IN(0.99, 2.99, 4.99) AND replacement_cost IN(12.99, 15.99, 28.99);
    ```
