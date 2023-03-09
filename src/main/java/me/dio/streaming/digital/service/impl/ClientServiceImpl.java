package me.dio.streaming.digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.streaming.digital.entity.Client;
import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.ClientForm;
import me.dio.streaming.digital.entity.form.ClientUpdateForm;
import me.dio.streaming.digital.infra.utils.JavaTimeUtils;
import me.dio.streaming.digital.repository.ClientRepository;
import me.dio.streaming.digital.service.IClientService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ClientServiceImpl implements IClientService {

  @Autowired
  private ClientRepository repository;

  @Override
  public Client create(ClientForm form) {
    Client client = new Client();
    client.setName(form.getName());
    client.setCpf(form.getCpf());
    client.setCountry(form.getCountry());
    client.setBirthDate(form.getBirthDate());

    return repository.save(client);
  }

  @Override
  public Client get(Long id) {
    return null;
  }

  @Override
  public List<Client> getAll(String birthDate) {

    if (birthDate == null) {
      return repository.findAll();
    } else {
      LocalDate localDate = LocalDate.parse(birthDate, JavaTimeUtils.LOCAL_DATE_FORMATTER);
      return repository.findByBirthDate(localDate);
    }

  }

  @Override
  public Client update(Long id, ClientUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {
  }

  @Override
  public List<CurrentSituation> getAllCurrentSituationId(Long id) {

    Client client = repository.findById(id).get();

    return client.getSituation();

  }

}
