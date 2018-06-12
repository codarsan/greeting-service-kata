package com.orange.service;

import com.orange.customers.CustomerRespository;
import com.orange.notification.Mailer;

class GreetingService {

    private CustomerRespository repository;

    private Mailer mailer;

    GreetingService(CustomerRespository repository, Mailer mailer) {
        this.repository = repository;
        this.mailer = mailer;
    }

    void greeting(String name) {
        String greeting;

        if (repository.birthdayIsToday(name)) {
            greeting = "Happy birthday " + name + "!";
        } else {
            greeting = "Good morning " + name + ".";
        }

        mailer.send(greeting);
    }


}
