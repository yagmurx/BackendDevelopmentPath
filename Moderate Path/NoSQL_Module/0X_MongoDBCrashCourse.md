# MongoDB Crash Course

[Education Link](https://youtu.be/-56x56UppqQ)

- It is an NoSQL database
- Using bson as like json files.
- Relational databases.


> MongoDB Compass used in this course.

## Creating Database
> 'Create Database' button at Databases tab. EX: test_1

## Creating Collection
> Click the database at Databases tab.
> 'Create Collection' button at there. EX: products

## Creating Document
> Click the collection at Collections tab.
> Click 'Add Data' button and select 'Insert Document'

```
{
  "_id": {
    "$oid": "63f67396dddb6c12dcb2e53d"
  },
  "name": "keyboards"
}
```
## Using Shell

**Database Commands**
```
// Showing all databases
show dbs

// Selecting a database
use test_1

// Deleting the database
db.dropDatabase()

// Creating new database
use acme

// Showing existing database
db
```

**Collection Commands**
```
// Showing collections
show collections

// Creating collection
db.createCollection('posts')
```

**Document Commands**
```
db.posts.insert( {
    title: 'Post One',
    body: 'Body of post one',
    category: 'News',
    likes: 4,
    tags: ['news', 'events'],
    user: {
        name: 'John Doe',
        status: 'author'
    },
    date: Date()
})

db.posts.insertMany([
    {
        title: 'Post Two',
        body: 'Body of post two',
        category: 'Technology',
        date: Date()
    },
    {
        title: 'Post Three',
        body: 'Body of post three',
        category: 'News',
        date: Date()
    },
    {
        title: 'Post Four',
        body: 'Body of post three',
        category: 'Entertainment',
        date: Date()
    }
])
```
