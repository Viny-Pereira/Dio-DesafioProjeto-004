package me.dio.streaming.digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.streaming.digital.entity.Client;
import me.dio.streaming.digital.entity.Registration;
import me.dio.streaming.digital.entity.form.RegistrationForm;
import me.dio.streaming.digital.repository.ClientRepository;
import me.dio.streaming.digital.repository.RegistrationRepository;
import me.dio.streaming.digital.service.IRegistrationService;

import java.util.List;

@Service
public class RegistrationServiceImpl implements IRegistrationService {

  @Autowired
  private RegistrationRepository registrationRepository;

  @Autowired
  private ClientRepository clientRepository;

  @Override
  public Registration create(RegistrationForm form) {
    Registration registration = new Registration();
    Client client = clientRepository.findById(form.getClientId()).get();

    registration.setClient(client);

    return registrationRepository.save(registration);
  }

  @Override
  public Registration get(Long id) {
    return registrationRepository.findById(id).get();
  }

  @Override
  public List<Registration> getAll(String country) {

    if (country == null) {
      return registrationRepository.findAll();
    } else {
      return registrationRepository.findClientRegisterCountry(country);
    }

  }

  @Override
  public void delete(Long id) {
  }

}
