package com.oliveira.senai.Service;

import com.oliveira.senai.Model.Professor;
import com.oliveira.senai.Interface.ProfessorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {
    private final ProfessorRepository _repository;

    public ProfessorService(ProfessorRepository repository){
        this._repository = repository;
    }

    public List<Professor> listarProfessores(){
        return _repository.findAll();
    }

    public Professor salvarProfessor(Professor professor){
        return _repository.save(professor);
    }

    public void deletarProfessor(Long id){
        _repository.deleteById(id);
    }

    public Professor buscarProfById(Long id){
        return _repository.findById(id).orElse(null);
    }
}