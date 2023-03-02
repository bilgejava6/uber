package com.muhammet.uber.repository;

import com.muhammet.uber.repository.entity.Sofor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISoforRepository extends JpaRepository<Sofor,Long> {
}
