package me.dio.streaming.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.dio.streaming.digital.entity.Registration;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

  /**
   *
   * @param country bairro referência para o filtro
   * @return lista de alunos matriculados que residem no bairro passado como
   *         parâmetro
   */
  // @Query(value = "SELECT * FROM tb_matriculas m " +
  // "INNER JOIN tb_alunos a ON m.aluno_id = a.id " +
  // "WHERE a.country = :country", nativeQuery = true)
  @Query("FROM Registration r WHERE r.client.country = :country ")
  List<Registration> findClientRegisterCountry(String country);

  // List<Matricula> findClientRegisterCountry(String country);

}
