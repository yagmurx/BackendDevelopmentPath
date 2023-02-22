# Key Value Databases
- You have a key column and a value column.

> with graphQL

## Creating a database
```
mutation {
  createTable (
    keyspaceName :"keyvalue",
    tableName: "shop_inventory",
    partitionKeys :[{name: "key", type: {basic: TEXT}}],
    values: [{name: "value", type: {basic:TEXT}}]
  )
}
```

## Creating a value
```
mutation {
  insertshop_inventory (
    value: {key: "3rd53", value: "beans"}
  ) {
    value {
      key,
    	value
    }
  }
}

OUTPUT:
{
  "data": {
    "insertshop_inventory": {
      "value": {
        "key": "3rd53",
        "value": "beans"
      }
    }
  }
}
```

## Get values

```
query {
  shop_inventory {
    values {key, value}
  }
}

OUTPUT:
{
  "data": {
    "shop_inventory": {
      "values": [
        {
          "key": "42dhw",
          "value": "shampoo"
        },
        {
          "key": "3rd53",
          "value": "beans"
        }
      ]
    }
  }
}
```
## Deleting a data
```
mutation {
  deleteshop_inventory (
    value: {key: "dhe342"}
  ) {
    value {
      key
    }
  }
}
```
