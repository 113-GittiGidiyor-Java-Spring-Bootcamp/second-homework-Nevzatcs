package dev.patika.homework2.dao;


import dev.patika.homework2.model.Course;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class CourseDAOJPA implements CourseDAO<Course>{

    private EntityManager entityManager;


    public CourseDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    @Transactional
    public List<Course> findAll() {
        return entityManager.createQuery("FROM  Course c ", Course.class).getResultList();
    }

    @Override
    @Transactional
    public Course findById(int id) {
        return entityManager.find(Course.class,id);
    }

    @Override
    @Transactional
    public Course save(Course course) {
        return entityManager.merge(course);
    }

    @Override
    public void deleteById(int id) {
        Course course = entityManager.createQuery("FROM Course c WHERE c.id=:id", Course.class).setParameter("id",id).getSingleResult();
        entityManager.remove(course);
    }

    @Override
    public Course updateOnDatabase(Course course) {
        Course foundCourse = entityManager.find(Course.class, course);
        return entityManager.merge(foundCourse);
    }
}
