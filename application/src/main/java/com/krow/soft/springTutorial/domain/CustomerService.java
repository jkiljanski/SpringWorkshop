package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.Customer;
import com.krow.soft.springTutorial.jpa.CustomerRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;
    private final CustomerVerifier customerVerifier;
    private final KrowaContainsVerifier krowaContainsVerifier;
    private final EmailService emailService;

    public CustomerService(CustomerRepository customerRepository, CustomerVerifier customerVerifier, KrowaContainsVerifier krowaContainsVerifier, EmailService emailService) {
        this.customerRepository = customerRepository;
        this.customerVerifier = customerVerifier;
        this.krowaContainsVerifier = krowaContainsVerifier;
        this.emailService = emailService;
    }

    public Iterable<Customer> findAll() {
        customerRepository.doSomethingWithExistingTransaction();
        return customerRepository.findAll();
    }

    @Transactional
    public void addCustomer(Customer customer) throws RuntimeException {

        // customerVerifier.verify(customer);
        customerRepository.save(customer);

        krowaContainsVerifier.verify(customer);
        //customerRepository.save(customer);
        sendEmail(customer);
    }

    @Transactional
    public void addCustomerTwice(Customer customer) {
        customer.setLastName("a");
        addCustomer(customer);
        // customer.clearId();

        Customer customer2 = new Customer(customer.getFirstName(), "b");
        addCustomer(customer2);
    }

    public void sendEmail(Customer customer) {
        emailService.sendEmail();
    }



}
