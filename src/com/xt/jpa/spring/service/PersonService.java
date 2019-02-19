package com.xt.jpa.spring.service;

import com.xt.jpa.spring.dao.PersonDao;
import com.xt.jpa.spring.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author xt
 * @date 2019/2/17 - 17:01
 * @description
 */
@Service
public class PersonService {

    @Autowired
    private PersonDao personDao;

    @Transactional
    public void savePersons(Person p1, Person p2) {
        personDao.save(p1);
        int i = 10/0;
        personDao.save(p2);
    }
}
