# Graphql
Graphql with spring boot


Graphql query to fetch name and yearsofService form employee service:
```
{
  employees {
    yearsOfService,name
  }
}
```

Graphql query to fetch only name form employee service:
```
{
  employees {
    name
  }
}
```