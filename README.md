# Graphql
Graphql with spring boot

**GraphQL** is a query language. It gives control to the user to query what he needs, thus reducing the payload on the network.

Graphql qeries are basically POST Rest requests. The payload is converted to JSON only over the network.

**POC**:

Run the springboot main class and

Open graphiql url:
```
http://localhost:8080/graphiql
```

Then execute below queries on graphiql interface (or postman with message type post, and message type raw/GraphQL):

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

**GraphQL Setup**: 

There are 2 ways to setup GraphQL:

1. See the graphql.config package. The commented out code in GraphqlConfig shows a more low level method of connecting with graphql schema. Various resolvers like EmployeesResolver (that implement DataFetcher) are mapped to the query endpoints.
2. More cleaner way is to create a query bean. See Query.java.

**Theory** : https://dzone.com/articles/graphql-with-springboot

Note that you may choose to not give few of the data members of the class in the graphql schema. But then you will not get the value of this field in the response, and neither can you specify this field specifically in the get query.


