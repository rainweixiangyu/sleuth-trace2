package com.example.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class Trace2ServiceImpl implements Trace2Service {
  private final static Logger log = LoggerFactory.getLogger(Trace2ServiceImpl.class);

  @Override
  public void trace2Service(){
    log.info("Call trace2Service");
  }
}
