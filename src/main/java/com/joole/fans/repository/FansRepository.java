package com.joole.fans.repository;

import com.joole.fans.model.Fans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FansRepository extends JpaRepository<Fans, Integer> {
    Fans findByid(int id);

}
