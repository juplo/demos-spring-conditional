package de.juplo.boot.conditional.lib;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SpecializedConfig
{
  @Bean
  public BeanA beanA()
  {
    return new BeanA("Specialized BeanA");
  }
}
