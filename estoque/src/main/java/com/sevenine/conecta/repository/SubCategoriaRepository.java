package com.sevenine.conecta.repository;

import com.sevenine.conecta.repository.data.SubCategoriaData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SubCategoriaRepository extends JpaRepository<SubCategoriaData, Long> {
}
