package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class EntityCountValidator {

    @Autowired
    CustomerRepository customerRepository;

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void validate( )  {
        if(customerRepository.count()==5 ) {

        }else {
            throw new RuntimeException("Nie ma 5 elementow w repo. Jest ich "+customerRepository.count());
        }
    }
}
