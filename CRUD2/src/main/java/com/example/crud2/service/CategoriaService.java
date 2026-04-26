package com.example.crud2.service;

import com.example.crud2.model.Categoria;
import com.example.crud2.model.Produto;
import com.example.crud2.repository.CategoriaRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoriaService {
    private final CategoriaRepository categoriaRepository;

    public CategoriaService(CategoriaRepository categoriaRepository){
        this.categoriaRepository = categoriaRepository;
    }

    public void salvar(Categoria categoria) {
        if(categoria.getNome() == null || categoria.getNome().isBlank()) {
            throw new RuntimeException("O nome do produto é obrigatório.");
        }
        categoriaRepository.save(categoria);
    }
}
