# Document Type Database
- A group of documents called collection. We switch tables to collections.

**HTTP Requests**
GET: requesting data from server        endpoint: /burgers
POST: sending data to server            endpoint: /burgers
PUT: sending data yo server (override)  endpoint: /burgers/{id}
DELETE: delete something                endpoint: /burgers/{id}


> It uses JSON for creating collections & documents.
https://swagger.io/

## Creating a collection

> POST /v2/namespaces/{namespace-id}/collection
```
{
"name": "my_first_collection"
}
```

## Creating a document
> POST /v2/namespaces/{namespace-id}/collection/{collection-id}

```
{
"id" : 0,
"title" : "Fix bike",
"description" : "Fix bike before housemate finds out",
"done" : true
}


RESPONSE BODY
{
  "data": {
    "3bc93355-fabf-4d21-b98e-7d070bf1db37": {
      "description": "Fix bike before housemate finds out",
      "done": true,
      "id": 0,
      "title": "Fix bike"
    },
    "f5ff15a2-62b8-4514-a86a-7f2eb961eb0c": {
      "description": "Fix bike before housemate finds out",
      "done": true,
      "id": 0,
      "title": "Fix bike"
    }
  }
}
```
## Getting a document with its document_id
> POST /v2/namespaces/{namespace-id}/collection/{collection-id}/{document-id}
