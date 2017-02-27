package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.Customer;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;

@Component
public class CustomerValidator {

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void validate(Customer customer) throws SwearInFirstnameException {
        if(customer.getFirstName()!=null && customer.getFirstName().contains("dupa")){
            throw new SwearInFirstnameException();
        }
    }
}
