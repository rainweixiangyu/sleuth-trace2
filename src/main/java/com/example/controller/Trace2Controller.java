package com.example.controller;

import com.example.service.Trace2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Trace2Controller {
  @Autowired
  private Trace2Service trace2Service;

  @RequestMapping(value = "/trace2", method = RequestMethod.GET)
  public void trace() {
    trace2Service.trace2Service();
  }
}
