package me.dio.streaming.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.CurrentSituationForm;
import me.dio.streaming.digital.service.impl.CurrentSituationServiceImpl;

import java.util.List;

@RestController
@RequestMapping("/situations")
public class CurrentSituationController {

  @Autowired
  private CurrentSituationServiceImpl service;

  @PostMapping
  public CurrentSituation create(@RequestBody CurrentSituationForm form) {
    return service.create(form);
  }

  @GetMapping
  public List<CurrentSituation> getAll() {
    return service.getAll();
  }

}
