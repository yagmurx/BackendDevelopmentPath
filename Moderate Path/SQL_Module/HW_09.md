# Homework 9

Perform the following query scenarios through the DVDRENTAL sample database.

1. Write the Inner Join query, where we can see the City (City) and Country (Country) names in the Country table with the City table.
    ```
    SELECT city, country FROM city
    INNER JOIN country
    ON city.country_id = country.country_id
    ```
2. Write the Inner JOIN query, where we can see the names of the Customer Table and the Payment_id in the Payment table and the first_name and last_name in the Customer table together.
    ```
    SELECT payment_id, first_name, last_name FROM payment
    INNER JOIN customer
    ON customer.customer_id = payment.customer_id
    ```
3. Write the Inner Join query, where we can see the first_name and last_name names in the Customer table with the Customer table and the Customer table.,
    ```
    SELECT rental_id, first_name, last_name FROM customer
    INNER JOIN rental
    ON customer.customer_id = rental.customer_id
    ```