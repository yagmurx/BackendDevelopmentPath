# HOMEWORK 4

Perform the following query scenarios through the DVDRENTAL sample database.

1. List the different values in the replacement_cost column in the film table.
    ```
    SELECT DISTINCT replacement_cost FROM film;
    ```
2. How many different data are the replacement_cost column in the film table?
    ```
    SELECT COUNT(DISTINCT replacement_cost) FROM film;
    ```
3. How many of the film names in the film table (title) start with the character T and at the same time Rating is equal to 'G'?
    ```
    SELECT COUNT(*) FROM film
    WHERE title LIKE 'T%' AND rating = 'G';
    ```
4. How many of the country names in the Country table consist of 5 characters?
    ```
    SELECT COUNT(*) FROM country
    WHERE country LIKE '_____';
    ```
5. How many of the city names in the City table end with 'R' or R?
    ```
    SELECT COUNT(*) FROM city
    WHERE city ILIKE '%r';
    ```