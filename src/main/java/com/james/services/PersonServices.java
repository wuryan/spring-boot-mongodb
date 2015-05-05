package com.james.services;


import com.james.domain.Person;
import com.james.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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

    @Transactional(readOnly = false)
    public void insert(Person person) {
        personRepository.insert(person);
    }

    public Person findById(String id) {
        return personRepository.findById(id);
    }

}
