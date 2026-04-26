package com.example.crud2.service;

import com.example.crud2.model.Produto;
import com.example.crud2.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public void salvar(Produto produto) {
        if(produto.getNome() == null || produto.getNome().isBlank()) {
            throw new RuntimeException("O nome do produto é obrigatório.");
        }
        if(produto.getValor() <= 0){
            throw new RuntimeException("O valor deve ser maior que zero.");
        }
        produtoRepository.save(produto);
    }

    public List<Produto> listarTodos() {
        return produtoRepository.findAll();
    }

    public Optional<Produto> buscarPorId(Integer id) {
        return produtoRepository.findById(id);
    }

    public void deletar(Integer id) {
        produtoRepository.deleteById(id);
    }
}
