package com.krow.soft.springTutorial;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OuterClassesConfig {

  @Bean
  StringBuffer stringBuffer(){

    return new StringBuffer();
  }
}
