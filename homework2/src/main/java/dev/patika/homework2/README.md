# Test configuration for Project
## Student HTTP Methods
### GET datas 
``` 
GET localhost:8080/api/students
``` 
### GET data by Id
``` 
GET localhost:8080/api/students/1 
``` 
### Add new student
``` 
POST localhost:8080/api/students
{
"s_name" : "ali",
"s_address": "ist",
"s_birthDate":"2021-05-03",
"s_gender" : "male"
}
``` 
### Delete student By Id
``` 
DELETE localhost:8080/api/students/1
``` 
### Update student By Id
``` 
PUT localhost:8080/api/students/1
{
"s_name" : "Halim",
"s_address": "Ank",
"s_birthDate":"2021-05-03",
"s_gender" : "male"
}
``` 

## Course HTTP Methods
### GET datas
``` 
GET localhost:8080/api/courses
``` 
### GET data by Id
``` 
GET localhost:8080/api/courses/1
``` 
### Add new course
``` 
POST localhost:8080/api/courses
{
"courseName" : "Math",
"courseCode" : 1001,
"creditScore":5
}
``` 
### Delete student By Id
``` 
DELETE localhost:8080/api/courses/1
``` 
### Update course By Id
``` 
PUT localhost:8080/api/course/1
{
"courseName" : "Math",
"courseCode" : 1004,
"creditScore":5
}
``` 
## Instructor HTTP Methods
### GET datas
``` 
GET localhost:8080/api/instructors
``` 
### GET data by Id
``` 
GET localhost:8080/api/instructors/1
``` 
### Add new instructor
``` 
POST localhost:8080/api/courses
{
"name" : "Mehmet",
"address": "ist",
"phoneNumber":"05363578987"
}
``` 
### Delete instructor By Id
``` 
DELETE localhost:8080/api/instructors/1
``` 
### Update instructor By Id
``` 
PUT localhost:8080/api/instructors/1
{
"name" : "Mehmet",
"address": "istanbul",
"phoneNumber":"05363578987"

}
``` 