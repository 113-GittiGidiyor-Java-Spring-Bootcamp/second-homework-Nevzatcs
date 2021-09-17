package dev.patika.homework2.repository;

import dev.patika.homework2.model.Instructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepository extends CrudRepository<Instructor,Integer> {
}
