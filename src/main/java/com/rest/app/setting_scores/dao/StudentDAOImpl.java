package com.rest.app.setting_scores.dao;

import com.rest.app.setting_scores.entity.Student;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class StudentDAOImpl implements StudentDAO {

    // define field for entity manager
    private EntityManager entityManager;

    // inhject enitity manager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Student theStudent) {
        this.entityManager.persist(theStudent);
    }

    @Override
    public Student findById(Integer id) {
        return this.entityManager.find(Student.class, id);
    }

    @Override
    public List<Student> findAll() {

        // create query
        TypedQuery<Student> theQuery = this.entityManager.createQuery("FROM Student order by lastName desc ", Student.class);
        // return query results
        return theQuery.getResultList();
    }

    @Override
    public List<Student> findByLastName(String lastName) {

        // create query
        TypedQuery<Student> theQuery = this.entityManager.createQuery("from Student where lastName =: lastName", Student.class);

        // set query parameter
        theQuery.setParameter("lastName", lastName);

        // return the result
        return theQuery.getResultList();
    }

    @Override
    @Transactional
    public void update(Student theStudent) {
        this.entityManager.merge(theStudent);
    }
}
