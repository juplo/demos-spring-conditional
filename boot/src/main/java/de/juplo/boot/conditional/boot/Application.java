package de.juplo.boot.conditional.boot;

import de.juplo.boot.conditional.lib.DefaultConfig;
import de.juplo.boot.conditional.lib.SpecializedConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;


@SpringBootApplication
@Import({
    SpecializedConfig.class,
    DefaultConfig.class,
})
public class Application
{
  public static void main(String[] args)
  {
    SpringApplication.run(Application.class, args);
  }
}
