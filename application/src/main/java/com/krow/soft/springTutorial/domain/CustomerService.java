package com.krow.soft.springTutorial.domain;

import com.krow.soft.springTutorial.jpa.Customer;
import com.krow.soft.springTutorial.jpa.CustomerRepository;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class CustomerService implements ApplicationContextAware {

  private final CustomerRepository customerRepository;

  private ApplicationContext applicationContext;

  @Autowired
  private StringBuffer stringBuffer;

  @Value("krowa")
  String krowa;

  public CustomerService(
      final CustomerRepository customerRepository) {

    this.customerRepository = customerRepository;

    if(krowa == null){

    }
  }

  /*@Autowired
  public CustomerService(CustomerRepository customerRepository) {

    this.customerRepository = customerRepository;
  }
*/
  public Iterable<Customer> findAll() {

    customerRepository.doSomethingWithExistingTransaction(null);
    return customerRepository.findAll();
  }

  @Override public void setApplicationContext(final ApplicationContext applicationContext)
      throws BeansException {

    this.applicationContext = applicationContext;
  }
}
