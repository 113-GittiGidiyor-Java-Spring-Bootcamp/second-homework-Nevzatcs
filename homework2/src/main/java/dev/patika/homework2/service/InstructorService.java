package dev.patika.homework2.service;

import dev.patika.homework2.dao.InstructorDAO;
import dev.patika.homework2.model.Instructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class InstructorService implements BaseService<Instructor> {

    private InstructorDAO instructorInstructorDAO;

    @Autowired
    public InstructorService(@Qualifier("instructorDAOJPA")InstructorDAO instructorInstructorDAO) {
        this.instructorInstructorDAO = instructorInstructorDAO;
    }

    @Override
    public List<Instructor> findAll() {
        return instructorInstructorDAO.findAll();
    }

    @Override
    public Instructor findById(int id) {
        return (Instructor) instructorInstructorDAO.findById(id);
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return (Instructor) instructorInstructorDAO.save(instructor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        instructorInstructorDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Instructor updateOnDatabase(Instructor instructor, int id) {
        return (Instructor) instructorInstructorDAO.updateOnDatabase(instructor, id);
    }
}
