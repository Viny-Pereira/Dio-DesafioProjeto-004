package me.dio.streaming.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.streaming.digital.entity.Client;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

  List<Client> findByBirthDate(LocalDate birthDate);

}
