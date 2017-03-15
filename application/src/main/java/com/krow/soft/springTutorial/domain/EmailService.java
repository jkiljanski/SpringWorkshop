package com.krow.soft.springTutorial.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class EmailService {
    private ApplicationContext applicationContext;

    @Transactional(Transactional.TxType.MANDATORY)
    public void sendEmail() {
        System.out.println("Send email");
    }

}
