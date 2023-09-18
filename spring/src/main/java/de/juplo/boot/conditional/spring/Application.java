package de.juplo.boot.conditional.spring;

import de.juplo.boot.conditional.lib.DefaultConfig;
import de.juplo.boot.conditional.lib.SpecializedConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@Import({
    SpecializedConfig.class,
    DefaultConfig.class,
})
public class Application
{
  public static void main(String[] args)
  {
    ApplicationContext context =
        new AnnotationConfigApplicationContext(Application.class);
  }
}
