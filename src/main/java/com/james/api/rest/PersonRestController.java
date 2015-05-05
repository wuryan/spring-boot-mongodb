package com.james.api.rest;

import com.james.domain.Person;
import com.james.ex.ErrorCode;
import com.james.services.PersonServices;
import com.james.vo.OperateMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Person find(@PathVariable("id") String id) {
        return personServices.findById(id);
    }
}
