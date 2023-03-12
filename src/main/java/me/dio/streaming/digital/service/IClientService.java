package me.dio.streaming.digital.service;

import java.time.LocalDate;
import java.util.List;

import me.dio.streaming.digital.entity.Client;
import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.ClientForm;
import me.dio.streaming.digital.entity.form.ClientUpdateForm;

public interface IClientService {

  Client create(ClientForm form);

  Client get(Long id);

  List<Client> getAll(String brithDate);

  Client update(Long id, ClientUpdateForm formUpdate);

  void delete(Long id);

  List<CurrentSituation> getAllCurrentSituationId(Long id);

}
