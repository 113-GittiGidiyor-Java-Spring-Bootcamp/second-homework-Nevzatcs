package dev.patika.homework2.controller;

import dev.patika.homework2.model.Course;
import dev.patika.homework2.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {
    CourseService courseService;

    @Autowired
    public CourseController(CourseService courseService) {
        this.courseService = courseService;
    }

    @GetMapping("/courses")
    public ResponseEntity<List<Course>> findAll(){
        return new ResponseEntity<>(courseService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/courses")
    public Course saveCourses(@RequestBody Course course){
        return courseService.save(course);
    }

    @DeleteMapping(value = "/courses/{id}")
    public void deleteCourseById(@PathVariable int id){
        courseService.deleteById(id);
    }

    @GetMapping("/courses/{id}")
    public Course findCourseById(@PathVariable int id){
        return  courseService.findById(id);
    }

    @PutMapping("/courses")
    public Course updateCourse(@RequestBody Course course){
        return   courseService.updateOnDatabase(course);
    }

    @GetMapping("/courses/delete-course")
    public String deleteCourse(@RequestBody Course course){
        courseService.delete(course);
        return course + " is deleted";
    }



}
