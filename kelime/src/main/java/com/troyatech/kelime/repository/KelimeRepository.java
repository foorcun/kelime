package com.troyatech.kelime.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.troyatech.kelime.model.Kelime;

@Repository
public interface KelimeRepository extends JpaRepository<Kelime,Long> {

}
