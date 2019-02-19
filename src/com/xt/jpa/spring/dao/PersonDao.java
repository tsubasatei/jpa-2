package com.xt.jpa.spring.dao;

import com.xt.jpa.spring.entity.Person;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * @author xt
 * @date 2019/2/17 - 16:57
 * @description
 */
@Repository
public class PersonDao {

    /**
     * 如何获取到和当前事务关联的 EntityManager 对象呢？
     * 通过 @PersistenceContext 注解来标记成员变量！
     */
    @PersistenceContext
    private EntityManager entityManager;

    public void save(Person person) {
        entityManager.persist(person);
    }
}


