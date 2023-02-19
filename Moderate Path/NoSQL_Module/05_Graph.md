# Graph Database

> In this part, we use docker

```
docker network create graph
```

## Create values
> with Gremlin
```
schema.vertexLabel('god').ifNotExists().partitionBy('name', Text).property('age', Int).create();
schema.vertexLabel('demigod').ifNotExists().partitionBy('name', Text).property('age', Int).create();
schema.vertexLabel('human').ifNotExists().partitionBy('name', Text).property('age', Int).create();
schema.vertexLabel('monster').ifNotExists().partitionBy('name', Text).property('age', Int).create();
schema.vertexLabel('location').ifNotExists().partitionBy('name', Text).property('age', Int).create();
schema.vertexLabel('titan').ifNotExists().partitionBy('name', Text).property('age', Int).create();
```

## Create Edges
> with Gremlin
```
schema.edgeLabel('father').ifNotExists().from('demigod').to('god').create();
schema.edgeLabel('father').ifNotExists().from('god').to('titan').create();
schema.edgeLabel('mother').ifNotExists().from('demigod').to('human').create();
schema.edgeLabel('brother').ifNotExists().from('god').to('god').create();

schema.edgeLabel('lives').ifNotExists().from('god').to('location').property('reason', Text).create();
schema.edgeLabel('lives').ifNotExists().from('monster').to('location').property('reason', Text).create();
```

## Creating Items
> with Gremlin
```
saturn = g.addV('titan').property('name', 'saturn').property('age', 10000).next();
sky    = g.addV('location').property('name', 'sky').next();
sea    = g.addV('location').property('name', 'sea').next();
jupiter = g.addV('god').property('name', 'jupiter').property('age', 5000).next();
```

## Get Table
> with Gremlin
```
g.V().hasLabel('demigod', 'god', 'human', 'monster', 'titan', 'location');
```