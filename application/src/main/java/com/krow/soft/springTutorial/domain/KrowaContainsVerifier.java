package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.Customer;
import org.springframework.stereotype.Service;

@Service
public class KrowaContainsVerifier {

    public void verify(Customer customer) throws KrowaException {

        if (customer.getFirstName().equals("krowa")) {
            throw  new KrowaException();
        }


    }

}
