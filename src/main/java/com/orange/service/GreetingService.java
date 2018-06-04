package com.orange.service;

import com.orange.customers.CustomerRespository;
import com.orange.notification.Mailer;

public class GreetingService {

    private CustomerRespository repository;

    private Mailer mailer;

    public void greeting(String name) {
        String greeting;

        if (repository.birthdayIsToday(name)) {
            greeting = "Happy birthday " + name + "!";
        } else {
            greeting = "Good morning " + name + ".";
        }

        mailer.send(greeting);
    }


}
