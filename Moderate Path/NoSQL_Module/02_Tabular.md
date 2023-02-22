# Tabular Database

We will create a 'BOOKS' database.

- Book ID   : UUID
- Author    : Text
- Title     : Text
- Year      : Int
- Categories: Set of Text
- Timestamp : Timestamp

The only way to find any row is by searching for key and the whole data row will be returned. This key is also what is known as a **partition key**. Because our NoSQL database is a distributed database, it means our data can be sold on loads and loads of different nodes. So if two rows had the same partition key, they will be stored together on one node.

## Creating a tabular database
```
describe keyspaces;
use tabular;
```
## CREATE TABLE IF NOT EXISTS: Creating a database 
```
CREATE TABLE IF NOT EXISTS books (
           book_id uuid,
           author text,
           title text,
           year int,
           categories set <text>,
           added timestamp,
           PRIMARY KEY (book_id)
           );

describe keyspace tabular;
```

## INSERT INTO: Adding a data
```
INSERT INTO books (book_id, author, title, year, categories, added)
           ... VALUES ( uuid(), 'Bobby Brown', 'Dealing with Tables', 1999, { 'programming', 'computers'}, toTimeStamp(now()));

SELECT * FROM books;
```

## WHERE: Getting a value with primary key
```
SELECT * FROM books
WHERE book_id = fa0eb731-d257-4735-bec9-754abf3d4aa4;
```

## Creating another database 
```
CREATE TABLE IF NOT EXISTS restaurant_by_country (
           ... country text,
           ... name text,
           ... cuisine text,
           ... url text,
           ... PRIMARY KEY ((country), name, url)
           ... ) WITH CLUSTERING ORDER BY (name DESC, url ASC);

INSERT INTO restaurant_by_country (country, name, cuisine, url)
VALUES('SINGAPORE', 'The Hut', 'lebanese', 'www.hut.sg');

 country        | name            | url               | cuisine
----------------+-----------------+-------------------+-------------
      SINGAPORE |       The Shack |      www.shack.sh |    americak
      SINGAPORE |         The Hut |        www.hut.sg |    lebanese
         POLAND | Wiejska Karczma |    www.karczma.pl | traditional
 UNITED KINGDOM |    The Red Rose | www.redrose.co.uk |         pub
 
```