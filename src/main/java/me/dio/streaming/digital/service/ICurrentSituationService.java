package me.dio.streaming.digital.service;

import java.util.List;

import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.CurrentSituationForm;
import me.dio.streaming.digital.entity.form.CurrentSituationUpdateForm;

public interface ICurrentSituationService {
  CurrentSituation create(CurrentSituationForm form);

  CurrentSituation get(Long id);

  List<CurrentSituation> getAll();

  CurrentSituation update(Long id, CurrentSituationUpdateForm formUpdate);

  void delete(Long id);
}
