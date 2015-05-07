package com.james.services;


import com.james.domain.Person;
import com.james.repository.PersonRepository;
import com.james.repository.SpringDataPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
@Service
@Transactional(readOnly = true)
public class PersonServices {

    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private SpringDataPersonRepository springDataPersonRepository;

    @Transactional(readOnly = false, propagation = Propagation.REQUIRED)
    public void insert(Person person) {
        personRepository.insert(person);
    }

    public Person findById(String id) {
        return personRepository.findById(id);
    }

    public List<Person> findByAge(int minAge, int maxAge) {
        return personRepository.findPersonByAge(minAge, maxAge);
    }

    public List<Person> findByAgeSpringData(int minAge, int maxAge) {
        return springDataPersonRepository.findByAgeBetween(minAge, maxAge);
    }

    public Page<Person> findByPage(int page, int limit) {
        page = page - 1;
        PageRequest pageRequest = new PageRequest(page, limit);
        Page<Person> result = springDataPersonRepository.findAll(pageRequest);
        return result;
    }

    public List<Person> findAll() {
        return (List<Person>) springDataPersonRepository.findAll();
    }


    public List<Person> findByStatus(String status) {
        return springDataPersonRepository.findByStatus(status);
    }

    public List<Person> findByNameLike(String name) {
        return springDataPersonRepository.findByNameLike(name);
    }

    public List<Person> findByNameQuery(String name) {
        return springDataPersonRepository.findByNameQuery(name);
    }

}
