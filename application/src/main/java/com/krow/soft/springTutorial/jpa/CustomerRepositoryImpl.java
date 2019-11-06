package com.krow.soft.springTutorial.jpa;

import javax.validation.constraints.NotNull;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    public void doSomethingWithExistingTransaction(@NotNull String key){
        //put some logic here
    }
}
