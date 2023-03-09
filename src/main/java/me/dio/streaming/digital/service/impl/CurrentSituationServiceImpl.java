package me.dio.streaming.digital.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import me.dio.streaming.digital.entity.Client;
import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.CurrentSituationForm;
import me.dio.streaming.digital.entity.form.CurrentSituationUpdateForm;
import me.dio.streaming.digital.repository.ClientRepository;
import me.dio.streaming.digital.repository.CurrentSituationRepository;
import me.dio.streaming.digital.service.ICurrentSituationService;

import java.util.List;

@Service
public class CurrentSituationServiceImpl implements ICurrentSituationService {

  @Autowired
  private CurrentSituationRepository currentSituationRepository;

  @Autowired
  private ClientRepository clientRepository;

  @Override
  public CurrentSituation create(CurrentSituationForm form) {
    CurrentSituation currentSituation = new CurrentSituation();
    Client client = clientRepository.findById(form.getClientId()).get();

    currentSituation.setClient(client);
    currentSituation.setCurrentPlan(form.getCurrentPlan());
    currentSituation.setScreensNumber(form.getScreensNumber());

    return currentSituationRepository.save(currentSituation);
  }

  @Override
  public CurrentSituation get(Long id) {
    return null;
  }

  @Override
  public List<CurrentSituation> getAll() {

    return currentSituationRepository.findAll();
  }

  @Override
  public CurrentSituation update(Long id, CurrentSituationUpdateForm formUpdate) {
    return null;
  }

  @Override
  public void delete(Long id) {

  }
}
