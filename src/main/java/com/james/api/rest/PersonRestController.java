package com.james.api.rest;

import com.james.domain.Person;
import com.james.ex.ErrorCode;
import com.james.services.PersonServices;
import com.james.vo.OperateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Random;

/**
 * @author James Chow
 * @createdate 2015/5/5
 * @contact zhouxy.vortex@gmail.com
 * @since v1.0
 */
@RestController
@RequestMapping("/api/v/person")
public class PersonRestController {

    @Autowired
    private PersonServices personServices;

    @RequestMapping(value = "/init", method = RequestMethod.GET)
    public OperateMessage init() {
        OperateMessage operateMessage = new OperateMessage();
        String[] names = new String[]{"James", "David", "Chou", "Cedric",
                "Hermoine", "Ron", "Fred", "Geroge", "Ginny", "Voldermort"};
        String[] status = new String[]{"A", "B"};
        String[] imgArr = new String[]{"img/avatars/avatar.png", "img/avatars/avatar1.png",
                "img/avatars/avatar2.png", "img/avatars/avatar3.png",
                "img/avatars/avatar4.png", "img/avatars/avatar5.png",};

        // init 10 person data to database
        try {
            for (int i = 0; i < 10; i++) {
                Random random = new Random();
                int age = random.nextInt(20) + 20;
                int sal = random.nextInt(10000) + 2000;
                int gender = random.nextInt(2);
                int statusIndex = random.nextInt(2);
                int imgIndex = random.nextInt(6);
                Person person = new Person(names[i], age, status[statusIndex], gender, sal, imgArr[imgIndex], "A nice guy, brave =======" + (i + 1));
                personServices.insert(person);
            }
        } catch (Exception e) {
            operateMessage.setRet(e);
            operateMessage.setRtn_message(e.getMessage());
            operateMessage.setError_code(ErrorCode.DB_EX);
        }

        return operateMessage;
    }

    @RequestMapping(value = "/save", method = { RequestMethod.GET, RequestMethod.POST })
    public OperateMessage save(Person person) {
        OperateMessage message = new OperateMessage();
        try {
            personServices.insert(person);
            return message;
        } catch (Exception e) {
            message.setError_code(ErrorCode.DB_EX);
            message.setRtn_message("error");
            message.setRet(e);
        }

        return message;
    }

    @RequestMapping(value = "/age/{minAge}/{maxAge}", method = RequestMethod.GET)
    public List<Person> findByAge(@PathVariable("minAge") int minAge, @PathVariable("maxAge") int maxAge) {
        return personServices.findByAgeSpringData(minAge, maxAge);
//        return personServices.findByAge(minAge, maxAge);
    }

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Person find(@PathVariable("id") String id) {
        return personServices.findById(id);
    }

    @RequestMapping(value = "/page/{page}/{limit}", method = RequestMethod.GET)
    public Page<Person> findByPage(@PathVariable("page") int page, @PathVariable("limit") int limit) {
        return personServices.findByPage(page, limit);
    }

    @RequestMapping(value = "/status/{status}", method = RequestMethod.GET)
    public List<Person> findByStatus(@PathVariable("status") String status) {
        return personServices.findByStatus(status);
    }

    @RequestMapping(value = "/name/like/{name}", method = RequestMethod.GET)
    public List<Person> findByNameLike(@PathVariable("name") String name) {
        return personServices.findByNameLike(name);
    }

    @RequestMapping(value = "/name/{name}", method = RequestMethod.GET)
    public List<Person> findByName(@PathVariable("name") String name) {
        return personServices.findByNameQuery(name);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Person> findAll() {
        return personServices.findAll();
    }

}
