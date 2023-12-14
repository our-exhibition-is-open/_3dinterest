package com.team2._3dinterest.domain.yugyeong.repository;

import com.team2._3dinterest.domain.yugyeong.entity.ContributeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContributeRepository extends JpaRepository<ContributeEntity, Integer> {
}