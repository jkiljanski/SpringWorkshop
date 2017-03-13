package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.Customer;
import com.krow.soft.springTutorial.jpa.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerValidator customerValidator;
    private final EntityCountValidator entityCountValidator;


    public CustomerService(CustomerRepository customerRepository, CustomerValidator customerValidator, EntityCountValidator entityCountValidator) {
        this.customerRepository = customerRepository;
        this.customerValidator = customerValidator;
        this.entityCountValidator = entityCountValidator;
    }

    public Iterable<Customer> findAll() {
        customerRepository.doSomethingWithExistingTransaction();
        return customerRepository.findAll();
    }

    @Transactional
    public void createNew(Customer customer) throws SwearInFirstnameException {

        customerRepository.save(customer);
        try {
            customerValidator.validate(customer);
        }catch(SwearInFirstnameException e){
            e.printStackTrace();
        }
        entityCountValidator.validate();

    }
}
