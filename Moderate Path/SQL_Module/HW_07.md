# HOMEWORK 7
Perform the following query scenarios through the DVDRENTAL sample database.

1. Group the movies in the film table according to the ratings.
    ```
    SELECT rating, COUNT(*) FROM film
    GROUP BY rating;
    ```
2. When we group the movies in the film table according to the replacement_cost column, list the replace_cost value of more than 50 films and the number of corresponding films.
    ```
    SELECT replacement_cost, COUNT(*) FROM film
    GROUP BY replacement_cost
    HAVING COUNT(*) > 50;
    ```
3. What are the number of customers corresponding to the store_id values in the Customer table?
    ```
    SELECT store_id, COUNT(*) FROM customer
    GROUP BY store_id;
    ```
4. After grouping the city data in the City table according to the Country_id column, share the Country_id information and the number of cities with the highest number of cities.
    ```
    SELECT country_id, COUNT(*) FROM city
    GROUP BY country_id
    ORDER BY COUNT(*) DESC
    LIMIT 1;
    ```