package me.dio.streaming.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.streaming.digital.entity.Client;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

  /**
   *
   * @param birthDate: data de nascimento dos alunos
   * @return lista com todos os alunos com a data de nascimento passada como
   *         parâmetro da função
   */
  List<Client> findByBirthDate(LocalDate birthDate);

}
