package com.james.repository;

import com.james.domain.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.geo.Point;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

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

    /**
     * 根据年龄进行查找，年龄有区间进行限制
     *
     * @param minAge
     * @param maxAge
     * @return
     */
    public List<Person> findPersonByAge(int minAge, int maxAge) {
        List<Person> list = mongoTemplate.find(new Query(
                Criteria.where("age").gte(minAge).andOperator(Criteria.where("age").lte(maxAge))), Person.class);

        return list;
    }

}
