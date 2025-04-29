package com.senai.cadastroendereco.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.cadastroendereco.entities.Endereco;
import com.senai.cadastroendereco.repositories.EnderecoRepository;

@Service
public class EnderecoService {
    
    @Autowired
    private EnderecoRepository enderecoRepository;
    
    //Salvar um novo endereco
    public Endereco Salvar(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
        //Buscar todos os endereços
        public List<Endereco> listarTodos() {
            return enderecoRepository.findAll();
        }
        
        //Deletar um endereco por ID
        public void deletarPorId(Long id) {
            enderecoRepository.deleteById(id);
    }


    }


	
	


