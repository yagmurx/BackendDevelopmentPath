# Introduction to NoSQL
SQL is not a database management approach a Query language 
No-SQL is a database management approach not a Query language 
- Flexible 
  - Non-Relational 
  - Distributed 
  - Scalable 

Types of NoSQL Databases
- Key-Value
- Document
- Tabular
- Graph

Why NoSQL? 
- Application development productivity 
  - Organizing/mapping data 
- Large scale of data 
  - Capturing large amount of data and processing is expensive 
  - It could distribute to little cheaper machines or clusters 


| NoSQL | Relational | 
|---    |:---:         |
| A database management approach | Uses SQL
| Not a Query Language     
| Uses SQL, or Doesn't use SQL  
| Not only tables with fixed columns and rows | Fixed schema |
| Flexible schema             
| Scales out    | Scales up |

Databases have multiple layers
- Interface 
- Execution 
- Storage 

C.A.P Theorem
According to the CAP theorem, a noSQL database cannot achieve consistency, availability and partition tolerance.
It must sacrifice one of the three for example MongoDB and Kafka choose to focus on CP.