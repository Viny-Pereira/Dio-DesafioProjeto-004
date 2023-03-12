package me.dio.streaming.digital.service;

import java.util.List;

import me.dio.streaming.digital.entity.Registration;
import me.dio.streaming.digital.entity.form.RegistrationForm;

public interface IRegistrationService {

  Registration create(RegistrationForm form);

  Registration get(Long id);

  List<Registration> getAll(String country);

  void delete(Long id);

}
