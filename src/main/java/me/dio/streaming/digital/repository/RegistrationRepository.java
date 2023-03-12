package me.dio.streaming.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import me.dio.streaming.digital.entity.Registration;

import java.util.List;

@Repository
public interface RegistrationRepository extends JpaRepository<Registration, Long> {

  @Query("FROM Registration r WHERE r.client.country = :country ")
  List<Registration> findClientRegisterCountry(String country);

  // List<Matricula> findClientRegisterCountry(String country);

}
