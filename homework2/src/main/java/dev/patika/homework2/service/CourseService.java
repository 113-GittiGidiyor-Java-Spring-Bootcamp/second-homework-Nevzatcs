package dev.patika.homework2.service;

import dev.patika.homework2.repository.CourseRepository;
import dev.patika.homework2.model.Course;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CourseService implements BaseService<Course>{
    private final CourseRepository repository;

    @Override
    public List<Course> findAll() {
        List<Course> courseList = new ArrayList<>();
        Iterable<Course> courseIter = repository.findAll();
        courseIter.iterator().forEachRemaining(courseList::add);
        return courseList;
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {
        return repository.findById(id).get();
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return (Course) repository.save(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Course updateOnDatabase(Course course) {
        return  repository.save(course);
    }

    @Transactional
    @Override
    public void delete(Course course) {
        repository.delete(course);

    }
}
