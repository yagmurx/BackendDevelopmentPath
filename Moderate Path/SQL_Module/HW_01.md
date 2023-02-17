# HOMEWORK 1

Perform the following query scenarios through the DVDRENTAL sample database.

1. List the data in the title and description columns in the film table.

    ```
    SELECT title, description FROM film;
    ```
2. Sort the data in all columns in the film table with the conditions of being longer than 60 and shorter than 75.
    ```
    SELECT * FROM film
    WHERE length > 60 AND length < 75;
    ```
3. Sort the data in all columns in the film table with the conditions of rental_rate 0.99 and replacement_Cost 12.99 or 28.99.
    ```
    SELECT * FROM film
    WHERE rental_rate = 0.99 AND (replacement_cost = 12.99 OR replacement_cost = 28.99);
    ```
4. What is the value of the customer's value in the first_name column in the Customer table in the Last_name column?
   ```
   SELECT last_name FROM customer
   WHERE first_name = 'Mary';
   ```
5. In the film table is not longer than 50, but also the rental_rate value of 2.99 or 4.99.
   ```
   SELECT * FROM film
   WHERE (length < 50) AND NOT(rental_rate = 2.99 OR rental_rate = 4.99);
   ```