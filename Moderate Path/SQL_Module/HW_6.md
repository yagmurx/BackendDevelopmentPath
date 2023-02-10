# HOMEWORK 6

Perform the following query scenarios through the DVDRENTAL sample database.

1. What is the average of the values in the Rental_rate column in the film table?
    ```
    SELECT AVG(rental_rate) FROM film;
    ```
2. How many of the films in the film table start with the character of 'C'?
    ```
    SELECT COUNT(*) FROM film
    WHERE title LIKE 'C%';
    ```
3. How many minutes is the Length film, which is equal to the Rental_rate value of the films in the film table?
    ```
    SELECT MAX(length) FROM film
    WHERE rental_rate = 0.99;
    ```
4. How many different replacement_cost values have the length of the films in the film table?
    ```
    SELECT COUNT(DISTINCT(replacement_cost)) FROM film
    WHERE length > 150
    ```