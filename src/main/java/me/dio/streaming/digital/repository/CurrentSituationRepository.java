package me.dio.streaming.digital.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import me.dio.streaming.digital.entity.CurrentSituation;

@Repository
public interface CurrentSituationRepository extends JpaRepository<CurrentSituation, Long> {

}
