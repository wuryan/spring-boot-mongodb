package com.james.repository;

import com.james.domain.Person;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

/**
 * @author James Chow
 * @createdate 2015/5/6
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
public interface SpringDataPersonRepository extends PagingAndSortingRepository<Person, String> {

    List<Person> findByStatus(String status);

    List<Person> findByAgeBetween(int minAge, int maxAge);

    List<Person> findByNameLike(String name);

    @Query("{ 'name': ?0 }")
    List<Person> findByNameQuery(String name);
}
