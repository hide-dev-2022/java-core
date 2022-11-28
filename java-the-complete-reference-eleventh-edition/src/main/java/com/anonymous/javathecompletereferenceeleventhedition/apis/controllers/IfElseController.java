package com.anonymous.javathecompletereferenceeleventhedition.apis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.anonymous.javathecompletereferenceeleventhedition.apis.responses.Notification;
import com.anonymous.javathecompletereferenceeleventhedition.services.IfElseService;

import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/if-else")
@Tag(name = "If Else Controller", description = "If Else Controller")
public class IfElseController {
  
  @Autowired
  private IfElseService ifElseService;

  @PostMapping("/season")
  public ResponseEntity<Notification> getSeason(@RequestParam int month) {
    
    Notification notification = ifElseService.getSeason(month);

    return new ResponseEntity<>(notification, HttpStatus.OK);
  }
}
