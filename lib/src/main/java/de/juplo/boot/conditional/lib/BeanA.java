package de.juplo.boot.conditional.lib;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public final class BeanA
{
  @Getter
  private final String name;

  public BeanA(String name)
  {
    this.name = name;
    log.info("BeanA was instanciated: {}", name);
  }
}
