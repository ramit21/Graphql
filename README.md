# Graphql
Graphql with spring boot

**GraphQL** is a query language. It gives control to the user to query what he needs, thus reducing the payload on the network. The schema first approach of the graphql makes it very easy to share the schema with end users, unlike rest apis where you have to implement swagger to share the contract.

Graphql qeries are basically POST Rest requests. The payload is converted to JSON only over the network.

**POC**:

Run the springboot main class and

Open graphiql url:
```
http://localhost:8080/graphiql
```

Then execute below queries on graphiql interface (or postman with message type post, and message type raw/GraphQL):

Query to fetch name and yearsofService form employee service (by default {} means query{} ):
```
{
  employees {
    yearsOfService,name
  }
}
```

Query to fetch only name form employee service:
```
{
  employees {
    name
  }
}
```

Mutation query to create an object
```
mutation
{
  addEmployee(id:3 name:"Ramit" yearsOfService:10)
  		{id,name,yearsOfService}
}
```

Query to fetch by id above created object:
```
{
  employeeById(id:3){name, id}
}
```

**GraphQL Setup**: 

There are 2 ways to setup GraphQL:

1. See the graphql.config package. The commented out code in GraphqlConfig shows a more low level method of connecting with graphql schema. Various resolvers like EmployeesResolver (that implement DataFetcher) are mapped to the query endpoints.
2. More cleaner way is to create a query bean. See Query.java where the method names map to schema queries.

**Theory** : https://dzone.com/articles/graphql-with-springboot

Note that you may choose to not give few of the data members of the class in the graphql schema. But then you will not get the value of this field in the response, and neither can you specify this field specifically in the get query.


