package me.dio.streaming.digital.service;

import java.util.List;

import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.CurrentSituationForm;
import me.dio.streaming.digital.entity.form.CurrentSituationUpdateForm;

public interface ICurrentSituationService {
  /**
   * Cria uma Avaliação Física e salva no banco de dados.
   * 
   * @param form - formulário referente aos dados para criação da Avaliação Física
   *             no banco de dados.
   * @return - Avaliação Física recém-criada.
   */
  CurrentSituation create(CurrentSituationForm form);

  /**
   * Retorna uma Avaliação Física que está no banco de dados de acordo com seu Id.
   * 
   * @param id - id da Avaliação Física que será exibida.
   * @return - Avaliação Física de acordo com o Id fornecido.
   */
  CurrentSituation get(Long id);

  /**
   * Retorna todas as Avaliações Física que estão no banco de dados.
   * 
   * @return - Uma lista com todas as Avaliações Física que estão salvas no DB.
   */
  List<CurrentSituation> getAll();

  /**
   * Atualiza a avaliação física.
   * 
   * @param id         - id da Avaliação Física que será atualizada.
   * @param formUpdate - formulário referente aos dados necessários para
   *                   atualização da Avaliação
   *                   Física no banco de dados.
   * @return - Avaliação Física recém-atualizada.
   */
  CurrentSituation update(Long id, CurrentSituationUpdateForm formUpdate);

  /**
   * Deleta uma Avaliação Física específica.
   * 
   * @param id - id da Avaliação Física que será removida.
   */
  void delete(Long id);
}
