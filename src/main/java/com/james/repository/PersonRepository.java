package com.james.repository;

import com.james.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
@Component
public class PersonRepository {

    private static Logger logger = LoggerFactory.getLogger(PersonRepository.class);

    private final MongoTemplate mongoTemplate;

    @Autowired
    public PersonRepository(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    public void insert(Person person) {
        mongoTemplate.insert(person);
        logger.info("Insert person: " + person);
    }

    public Person findById(String id) {
        Person person = mongoTemplate.findById(id, Person.class);
        logger.info("Find Person by id: " + id);

        return person;
    }

}
