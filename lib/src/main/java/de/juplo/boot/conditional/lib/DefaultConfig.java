package de.juplo.boot.conditional.lib;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class DefaultConfig
{
  @ConditionalOnMissingBean()
  @Bean
  public BeanA beanA()
  {
    return new BeanA("Default for BeanA");
  }
}
