package dev.patika.homework2.service;

import dev.patika.homework2.repository.InstructorRepository;
import dev.patika.homework2.model.Instructor;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InstructorService implements BaseService<Instructor> {

    private final InstructorRepository repository;
/*
    @Autowired
    public InstructorService(@Qualifier("instructorDAOJPA")InstructorDAO instructorInstructorDAO) {
        this.instructorInstructorDAO = instructorInstructorDAO;
    }


 */
    @Override
    public List<Instructor> findAll() {
        List<Instructor> insList = new ArrayList<>();
        Iterable<Instructor> employeeIter = repository.findAll();
        employeeIter.iterator().forEachRemaining(insList::add);
        return insList;
    }

    @Override
    @Transactional(readOnly = true)
    public Instructor findById(int id) {
        return (Instructor) repository.findById(id).get();
    }

    @Override
    @Transactional
    public Instructor save(Instructor instructor) {
        return (Instructor) repository.save(instructor);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        repository.deleteById(id);
    }

    @Override
    @Transactional
    public Instructor updateOnDatabase(Instructor instructor) {
        return (Instructor) repository.save(instructor);
    }

    @Override
    @Transactional
    public void delete(Instructor instructor) {
        repository.delete(instructor);
    }
}
