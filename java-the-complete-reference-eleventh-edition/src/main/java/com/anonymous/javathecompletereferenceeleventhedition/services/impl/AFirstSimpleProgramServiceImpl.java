package com.anonymous.javathecompletereferenceeleventhedition.services.impl;

import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import com.anonymous.javathecompletereferenceeleventhedition.apis.responses.Notification;
import com.anonymous.javathecompletereferenceeleventhedition.services.AFirstSimpleProgramService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AFirstSimpleProgramServiceImpl implements AFirstSimpleProgramService{

  @Override
  public Notification aFirstSimpleProgramService() {
    log.info("This is a simple Java program");
    return new Notification(ZonedDateTime.now(), "This is a simple Java program");
  }
  
}
