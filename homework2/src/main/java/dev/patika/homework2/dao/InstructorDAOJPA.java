package dev.patika.homework2.dao;


import dev.patika.homework2.model.Instructor;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class InstructorDAOJPA implements InstructorDAO<Instructor>{

    private EntityManager entityManager;


    public InstructorDAOJPA(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public List<Instructor> findAll() {
        return entityManager.createQuery("FROM  Instructor i ",Instructor.class).getResultList();
    }

    @Override
    @Transactional
    public Instructor findById(int id) {
        return entityManager.find(Instructor.class,id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return entityManager.merge(instructor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        Instructor instructor = entityManager.createQuery("FROM Instructor i WHERE  i.id=:id", Instructor.class).setParameter("id",id).getSingleResult();
        entityManager.remove(instructor);
    }

    @Override
    @Transactional
    public Instructor updateOnDatabase(Instructor instructor) {
        Instructor foundInstructor = entityManager.find(Instructor.class, instructor);
        return entityManager.merge(foundInstructor);
    }
}