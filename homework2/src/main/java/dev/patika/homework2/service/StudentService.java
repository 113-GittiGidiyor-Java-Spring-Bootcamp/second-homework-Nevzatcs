package dev.patika.homework2.service;

import dev.patika.homework2.dao.StudentDAO;
import dev.patika.homework2.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class StudentService implements BaseService<Student> {

    private StudentDAO studentStudentDAO;

    @Autowired
    public StudentService(@Qualifier("studentDAOJPA") StudentDAO studentStudentDAO) {
        this.studentStudentDAO = studentStudentDAO;
    }

    @Override
    public List<Student> findAll() {
        return studentStudentDAO.findAll();
    }

    @Override
    public Student findById(int id) {
        return (Student) studentStudentDAO.findById(id);
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return (Student) studentStudentDAO.save(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        studentStudentDAO.deleteById(id);
    }

    @Override
    public Student updateOnDatabase(Student student, int id) {
        return (Student) studentStudentDAO.updateOnDatabase(student, id);
    }
}
