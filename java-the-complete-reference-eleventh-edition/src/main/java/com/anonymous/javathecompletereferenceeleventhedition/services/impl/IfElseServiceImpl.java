package com.anonymous.javathecompletereferenceeleventhedition.services.impl;

import java.time.ZonedDateTime;

import org.springframework.stereotype.Service;

import com.anonymous.javathecompletereferenceeleventhedition.apis.responses.Notification;
import com.anonymous.javathecompletereferenceeleventhedition.services.IfElseService;

@Service
public class IfElseServiceImpl implements IfElseService {

  @Override
  public Notification getSeason(int month) {
    String season = "";

    if (month == 12 || month == 1 || month == 2) {
      season = "Winter";
    } else if (month == 3 || month == 4 || month == 5) {
      season = "Spring";
    } else if (month == 6 || month == 7 || month == 8) {
      season = "Summer";
    } else if (month == 9 || month == 10 || month == 11) {
      season = "Autumn";
    } else {
      season = "Bogus Month";
    }

    return new Notification(ZonedDateTime.now(), season.toString());
  }

}
