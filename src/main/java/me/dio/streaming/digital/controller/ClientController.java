package me.dio.streaming.digital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import me.dio.streaming.digital.entity.Client;
import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.ClientForm;
import me.dio.streaming.digital.service.impl.ClientServiceImpl;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/clients")
public class ClientController {

  @Autowired
  private ClientServiceImpl service;

  @PostMapping
  public Client create(@Valid @RequestBody ClientForm form) {
    return service.create(form);
  }

  @GetMapping("/situation/{id}")
  public List<CurrentSituation> getAllCurrentSituationId(@PathVariable Long id) {
    return service.getAllCurrentSituationId(id);
  }

  @GetMapping
  public List<Client> getAll(@RequestParam(value = "birthDate", required = false) String birthDate) {
    return service.getAll(birthDate);
  }

}
