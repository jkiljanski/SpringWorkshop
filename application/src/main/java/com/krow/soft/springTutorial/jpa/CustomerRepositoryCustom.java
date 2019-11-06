package com.krow.soft.springTutorial.jpa;

import javax.validation.constraints.NotNull;

public interface CustomerRepositoryCustom {

  void doSomethingWithExistingTransaction(@NotNull String key);
}
