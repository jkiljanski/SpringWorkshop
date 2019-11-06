package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.Customer;
import com.krow.soft.springTutorial.jpa.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerVerifier {

    private final CustomerRepository customerRepository;

    public CustomerVerifier(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Transactional(Transactional.TxType.REQUIRES_NEW)
    public void verify(Customer customer){

        if(!customerRepository.findByLastName(customer.getLastName()).isEmpty()) {
            throw new RuntimeException("Customer exists");
        }
    }

}
