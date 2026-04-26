package com.example.crud2.controller;

import com.example.crud2.model.Categoria;
import com.example.crud2.model.Produto;
import com.example.crud2.repository.CategoriaRepository;
import com.example.crud2.repository.ProdutoRepository;
import com.example.crud2.service.ProdutoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/produto")
public class ProdutoController {
    private final ProdutoRepository produtoRepository;
    private final ProdutoService produtoService;
    private final CategoriaRepository categoriaRepository;

    public ProdutoController(ProdutoRepository produtoRepository, ProdutoService produtoService, CategoriaRepository categoriaRepository) {
        this.produtoRepository = produtoRepository;
        this.produtoService = produtoService;
        this.categoriaRepository = categoriaRepository;
    }

    @GetMapping("/formulario")
    public String exibirFormulario(Model model) {
        model.addAttribute("produto", new Produto());
        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "formularioProduto";
    }

    @PostMapping("/salvar")
    public String salvarProduto(@ModelAttribute Produto produto, @RequestParam("Categoria Id") Integer categoriaId) {
        Categoria categoria = categoriaRepository.findById(categoriaId)
                .orElseThrow(() -> new IllegalArgumentException("Categoria inválida"));
        produto.setCategoria(categoria);
        produtoService.salvar(produto);
        return "redirect:/produto/listar";
    }

    @GetMapping("/listar")
    public String listarProdutos(Model model) {
        List<Produto> produtos = produtoRepository.findAll();
        model.addAttribute("produtos", produtos);
        return "listaProduto";
    }

    @GetMapping("/deletar/{id}")
    public String deletarProduto(@PathVariable Integer id) {
        produtoRepository.deleteById(id);
        return "redirect:/produto/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarProduto(@PathVariable Integer id, Model model) {
        Produto produto = produtoService.buscarPorId(id)
                .orElseThrow(() -> new IllegalArgumentException("Produto inválido"));
        model.addAttribute("produto", produto);
        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "formularioProduto";
    }
}
