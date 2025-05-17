package com.oliveira.senai.Interface;

import com.oliveira.senai.Model.Professor;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {
}