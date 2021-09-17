package dev.patika.homework2.service;

import dev.patika.homework2.repository.StudentRepository;
import dev.patika.homework2.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentService implements BaseService<Student> {

    private final StudentRepository repository;
/*
    @Autowired
    public StudentService(@Qualifier("studentDAOJPA") StudentDAO studentStudentDAO) {
        this.studentStudentDAO = studentStudentDAO;
    }


 */
    @Override
    public List<Student> findAll() {
        List<Student> stuList = new ArrayList<>();
        Iterable<Student> studentIter = repository.findAll();
        studentIter.iterator().forEachRemaining(stuList::add);
        return stuList;
    }

    @Override
    @Transactional(readOnly = true)
    public Student findById(int id) {
        return (Student) repository.findById(id).get();
    }

    @Override
    @Transactional
    public Student save(Student student) {
        return (Student) repository.save(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Student updateOnDatabase(Student student) {
        return (Student) repository.save(student);
    }

    @Override
    @Transactional
    public void delete(Student student) {
        repository.delete(student);
    }
}
