# WRAP UP

1. How many films with at least 4 'E' or 'E' are in title?
    ```
    SELECT COUNT(*) FROM film
    WHERE title ILIKE '%e%e%e%e%'
    ```
2. Write category names and the number of films per category.
    ```
    SELECT COUNT(*), category.name FROM category
    JOIN film_category ON film_category.category_id = category.category_id
    JOIN film ON film_category.category_id = film.film_id
    GROUP BY category.name;
    ```
3. What is the rating category with the most films?
    ```
    SELECT COUNT(*), rating FROM film
    GROUP BY rating
    ORDER BY COUNT(*) DESC
    LIMIT 1
    ```
4. In the film table, sort the longest 3 films that start with the 'K' character and 3 films with the least Replacement Cost.
    ```
    SELECT title, length, replacement_cost FROM film
    WHERE title LIKE 'K%'
    ORDER BY length DESC, replacement_cost ASC
    LIMIT 3;
    ```
5. What is the name of the most shopping customer?
    ```
    SELECT SUM(payment.amount), customer.first_name, customer.last_name 
    FROM payment
    LEFT JOIN customer
    ON customer.customer_id = payment.customer_id
    GROUP BY payment.customer_id, customer.first_name, customer.last_name
    ORDER BY SUM(amount) DESC
    LIMIT 1;
    ```