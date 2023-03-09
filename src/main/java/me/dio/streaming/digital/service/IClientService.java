package me.dio.streaming.digital.service;

import java.time.LocalDate;
import java.util.List;

import me.dio.streaming.digital.entity.Client;
import me.dio.streaming.digital.entity.CurrentSituation;
import me.dio.streaming.digital.entity.form.ClientForm;
import me.dio.streaming.digital.entity.form.ClientUpdateForm;

public interface IClientService {
  /**
   * Cria um Aluno e salva no banco de dados.
   * 
   * @param form formulário referente aos dados para criação de um Aluno no banco
   *             de dados.
   * @return Aluno recém-criado.
   */
  Client create(ClientForm form);

  /**
   * Retorna um Aluno que está no banco de dados de acordo com seu Id.
   * 
   * @param id id do Aluno que será exibido.
   * @return Aluno de acordo com o Id fornecido.
   */
  Client get(Long id);

  /**
   * Retorna os Alunos que estão no banco de dados.
   * 
   * @return Uma lista os Alunos que estão salvas no DB.
   */
  List<Client> getAll(String brithDate);

  /**
   * Atualiza o Aluno.
   * 
   * @param id         id do Aluno que será atualizado.
   * @param formUpdate formulário referente aos dados necessários para atualização
   *                   do Aluno
   *                   no banco de dados.
   * @return Aluno recém-atualizado.
   */
  Client update(Long id, ClientUpdateForm formUpdate);

  /**
   * Deleta um Aluno específico.
   * 
   * @param id id do Aluno que será removido.
   */
  void delete(Long id);

  /**
   *
   * @param id id do aluno que será recuperada a lista de avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<CurrentSituation> getAllCurrentSituationId(Long id);

}
