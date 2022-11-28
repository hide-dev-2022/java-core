package com.anonymous.javathecompletereferenceeleventhedition.apis.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.anonymous.javathecompletereferenceeleventhedition.apis.responses.Notification;
import com.anonymous.javathecompletereferenceeleventhedition.services.AFirstSimpleProgramService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/first-simple-program")
@Tag(name = "A First Simple Program Controller", description = "A First Simple Program Controller")
public class AFirstSimpleProgramController {

  @Autowired
  private AFirstSimpleProgramService aFirstSimpleProgramService;

  @GetMapping()
  @Operation(summary = "A First Simple Program Service", description = "A First Simple Program Service")
  public ResponseEntity<Notification> aFirstSimpleProgramService() {
    Notification notification = aFirstSimpleProgramService.aFirstSimpleProgramService();
    return new ResponseEntity<>(notification, HttpStatus.OK);
  }

}
