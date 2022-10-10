package com.wayne.aop.xml;

import lombok.extern.slf4j.Slf4j;

/**
 * @author wayne
 */
@Slf4j
public class BookProxy {
    public void before(){
      log.info("买书之前的逻辑");
    }
}
