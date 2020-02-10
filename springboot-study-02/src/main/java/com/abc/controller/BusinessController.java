package com.abc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pc.lism.entity.Person;

/**
 * @author Nick
 * @version 1.0
 * @since 2020/2/9 23:00
 */
@Controller
@RequestMapping("/find")
public class BusinessController {

    @Autowired
    private Person person;

    @RequestMapping("/person")
    @ResponseBody
    public Person findPerson(){
        return person;
    }

}
