# HOMEWORK 8
1. In your test database, let's create a table Employee with the column information named id (Integer), Name Varchar (50), Birthday Date, Email Varchar (100).
    ```
    CREATE TABLE employee (
        id SERIAL PRIMARY KEY,
        name VARCHAR(50) NOT NULL,
        birthday DATE,
        email VARCHAR(100)
    );
    ```
3. Let's add 50 data to the Employee table we have created.
    ```
    insert into employee (name, birthday, email) values ('Francesca Burfield', '1972-05-22', null);
    insert into employee (name, birthday, email) values ('Stefania Sprague', null, 'ssprague1@comsenz.com');
    insert into employee (name, birthday, email) values ('Stacee Percifull', null, 'spercifull2@wikipedia.org');
    insert into employee (name, birthday, email) values ('Pren Seamark', '1978-10-06', 'pseamark3@webs.com');
    insert into employee (name, birthday, email) values ('Jemie Hebbard', '1902-10-29', 'jhebbard4@de.vu');
    insert into employee (name, birthday, email) values ('Con Bonnesen', null, 'cbonnesen5@4shared.com');
    insert into employee (name, birthday, email) values ('Robbert Torrance', '1916-11-17', 'rtorrance6@symantec.com');
    insert into employee (name, birthday, email) values ('Richardo Towne', '1993-09-07', 'rtowne7@taobao.com');
    insert into employee (name, birthday, email) values ('Dehlia Castlake', '1978-10-10', 'dcastlake8@quantcast.com');
    insert into employee (name, birthday, email) values ('Giselle Reolfo', '1915-08-02', 'greolfo9@cnet.com');
    insert into employee (name, birthday, email) values ('Iago Fryatt', '2019-10-13', 'ifryatta@pcworld.com');
    insert into employee (name, birthday, email) values ('Lorilee Jonczyk', '1987-01-31', null);
    insert into employee (name, birthday, email) values ('Annadiana Jouannin', '1964-02-04', 'ajouanninc@yahoo.com');
    insert into employee (name, birthday, email) values ('Lem Gawler', '1999-09-04', 'lgawlerd@a8.net');
    insert into employee (name, birthday, email) values ('Brandise Sally', null, 'bsallye@skype.com');
    insert into employee (name, birthday, email) values ('Ralf Godmar', '1914-10-09', 'rgodmarf@networkadvertising.org');
    insert into employee (name, birthday, email) values ('Robbin Yakovliv', '1989-09-09', 'ryakovlivg@paypal.com');
    insert into employee (name, birthday, email) values ('Gustaf Cadd', null, 'gcaddh@wufoo.com');
    insert into employee (name, birthday, email) values ('Aaren Duligal', '1936-02-08', null);
    insert into employee (name, birthday, email) values ('Dacia Lamshead', '1929-12-13', 'dlamsheadj@ft.com');
    insert into employee (name, birthday, email) values ('Erny Dabrowski', '1926-08-23', 'edabrowskik@privacy.gov.au');
    insert into employee (name, birthday, email) values ('Andeee Ruckledge', null, null);
    insert into employee (name, birthday, email) values ('Lillian Woehler', null, 'lwoehlerm@answers.com');
    insert into employee (name, birthday, email) values ('Maynard Evens', null, 'mevensn@nationalgeographic.com');
    insert into employee (name, birthday, email) values ('Parsifal Burlingham', '1909-08-02', 'pburlinghamo@mozilla.org');
    insert into employee (name, birthday, email) values ('Loutitia Muggleton', '1972-03-19', 'lmuggletonp@facebook.com');
    insert into employee (name, birthday, email) values ('Seymour Tice', null, 'sticeq@mozilla.org');
    insert into employee (name, birthday, email) values ('Kerwinn Palleske', '1919-03-19', 'kpallesker@newsvine.com');
    insert into employee (name, birthday, email) values ('Kristel Mc Queen', '1929-05-19', 'kmcs@instagram.com');
    insert into employee (name, birthday, email) values ('Nadeen Feldmus', null, 'nfeldmust@mapquest.com');
    insert into employee (name, birthday, email) values ('Bald Stanmore', '2020-04-17', 'bstanmoreu@wikia.com');
    insert into employee (name, birthday, email) values ('Ediva Whitsun', null, 'ewhitsunv@g.co');
    insert into employee (name, birthday, email) values ('Phaedra Blazek', '2012-08-31', 'pblazekw@xinhuanet.com');
    insert into employee (name, birthday, email) values ('Bram Haster', '1909-05-27', 'bhasterx@twitter.com');
    insert into employee (name, birthday, email) values ('Demetris Lacaze', '1915-12-13', 'dlacazey@mashable.com');
    insert into employee (name, birthday, email) values ('Keith Connerry', '2004-07-12', 'kconnerryz@princeton.edu');
    insert into employee (name, birthday, email) values ('Flory Gowling', '1943-11-18', null);
    insert into employee (name, birthday, email) values ('Roseann Treby', '1956-11-23', 'rtreby11@geocities.com');
    insert into employee (name, birthday, email) values ('Nathaniel Lorek', '1917-03-18', 'nlorek12@ycombinator.com');
    insert into employee (name, birthday, email) values ('Fredia Matevosian', '1977-01-13', 'fmatevosian13@paginegialle.it');
    insert into employee (name, birthday, email) values ('Erin Buckthought', '1912-07-23', null);
    insert into employee (name, birthday, email) values ('Grace Rudolfer', '1969-04-24', null);
    insert into employee (name, birthday, email) values ('Elvira Assender', '1973-04-20', 'eassender16@rakuten.co.jp');
    insert into employee (name, birthday, email) values ('Violante Brickham', '1959-10-26', 'vbrickham17@stumbleupon.com');
    insert into employee (name, birthday, email) values ('Mathilda Farney', '2011-09-07', null);
    insert into employee (name, birthday, email) values ('Graham Fairrie', '1935-03-07', 'gfairrie19@delicious.com');
    insert into employee (name, birthday, email) values ('Nerty Harland', null, 'nharland1a@globo.com');
    insert into employee (name, birthday, email) values ('Wendel Gronw', '1911-03-26', null);
    insert into employee (name, birthday, email) values ('Maurizia Philipeaux', null, null);
    insert into employee (name, birthday, email) values ('Alexander MacClenan', '1910-05-30', 'amacclenan1d@t-online.de');
    ```
4. Let's do 3 update operations that will update other columns according to each of the columns.
    ```
    UPDATE employee
    SET name = 'Harry Potter',
	birthday = '1990-01-04',
	email = 'harry@hogwarts.com'
    WHERE id = 33;

    UPDATE employee
    SET name = 'Bilbo Baggings',
	birthday = '1910-04-06',
	email = 'bilbo@baggings.com'
    WHERE name = 'Pren Seamark';

    UPDATE employee
    SET name = 'Frodo Baggings',
	birthday = '1940-10-05',
	email = 'frodo@baggings.com'
    WHERE email = 'edabrowskik@privacy.gov.au';
    ```
5. According to each of the columns, let's do 3 delete operations that will wipe the relevant line.
    ```
    DELETE FROM employee
    WHERE name LIKE 'A%';

    DELETE FROM employee
    WHERE birthday < '1980-01-01';

    DELETE FROM employee
    WHERE email NOT ILIKE '%.com'; 
    ```