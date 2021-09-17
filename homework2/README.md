# School Management System
## Information
UML diyagrama göre Controller/Service/Repository mantığıyla JPA projesi hazırlanmış ve Hibernate API ile MySQL veritabanına kayıt yapmaya uygun hale getirilmiştir. Ekleme, çıkarma, güncelleme gibi CRUD işlemleri yapılmıştır.

![UML_classDiagram](https://user-images.githubusercontent.com/80898514/129194636-1db65fdd-88aa-45a2-b296-77acf69c5671.jpg)

## Usage
Kodlar Intellij IDEA üzerinden yazılmış, veritabanı olarak MySQL kullanılmıştır.


## Contributing
Pull requestler kabul edilir. Büyük değişiklikler için, lütfen önce neyi değiştirmek istediğinizi tartışmak için bir konu açınız.


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
### Update course and student
``` 
POST localhost:8080/api/students
    {
        "id":3,
        "s_name": "Al",
        "s_birthDate": "2021-05-03",
        "s_address": "ista",
        "s_gender": "male",
        "studentCourse": [
           {
                "id":1,
                "courseName": "Math",
                "courseCode": 1001,
                "creditScore": 5,
                "instructor": null
           }
        ]
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
### Update course and instructor
``` 
POST localhost:8080/api/students
    {
        "id": 1,
        "courseName": "Math",
        "courseCode": 1001,
        "creditScore": 5,
        "instructor": {
            
        "id": 1,
        "name": "Mehmet",
        "address": "ist",
        "phoneNumber": "05363578987",
        "hourlySalary":25
    
        }
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
# Resources

[Java](https://docs.oracle.com/en/java/) [MySQL](https://dev.mysql.com/doc/)

## License
[MIT](https://github.com/113-GittiGidiyor-Java-Spring-Bootcamp/second-homework-Nevzatcs/blob/main/LICENSE)
