package dev.patika.homework2.dao;


import dev.patika.homework2.model.Student;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class StudentDAOJPA implements StudentDAO<Student>{

    private EntityManager entityManager;


    public StudentDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Student> findAll() {
        return entityManager.createQuery("FROM  Student s ",Student.class).getResultList();
    }

    @Override
    @Transactional
    public Student findById(int id) {
        return entityManager.find(Student.class,id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return entityManager.merge(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Student student = entityManager.createQuery("FROM Student s WHERE s.id=:id", Student.class).setParameter("id",id).getSingleResult();
        entityManager.remove(student);
    }
    @Override
    @Transactional
    public Student updateOnDatabase(Student student , int id) {
        Student foundStudent = entityManager.find(Student.class, id);
        foundStudent.setS_name(student.getS_name());
        foundStudent.setS_address(student.getS_address());
        foundStudent.setS_birthDate(student.getS_birthDate());
        foundStudent.setS_gender(student.getS_gender());
        entityManager.merge(foundStudent);
        return foundStudent;
    }
}