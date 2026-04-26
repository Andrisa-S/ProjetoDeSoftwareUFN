package com.example.crud2.controller;

import com.example.crud2.model.Categoria;
import com.example.crud2.repository.CategoriaRepository;
import com.example.crud2.service.CategoriaService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/categoria")
public class CategoriaController {
    private final CategoriaRepository categoriaRepository;
    private final CategoriaService categoriaService;

    public CategoriaController(CategoriaRepository categoriaRepository, CategoriaService categoriaService) {
        this.categoriaRepository = categoriaRepository;
        this.categoriaService = categoriaService;
    }

    @GetMapping("/formulario")
    public String exibirFormulario(Model model) {
        model.addAttribute("categoria", new Categoria());
        return "formularioProduto";
    }


    @PostMapping("/salvar")
    public String salvarCategoria(@ModelAttribute Categoria categoria) {
        categoriaService.salvar(categoria);
        return "redirect:/categoria/listar";
    }

    @GetMapping("/listar")
    public String listarCategorias(Model model) {
        List<Categoria> categorias = categoriaRepository.findAll();
        model.addAttribute("categorias", categorias);
        return "listaProduto";
    }

    @GetMapping("/deletar/{id}")
    public String deletarCategoria(@PathVariable Integer id) {
        categoriaRepository.deleteById(id);
        return "redirect:/categoria/listar";
    }

    @GetMapping("/editar/{id}")
    public String editarCategoria(@PathVariable Integer id, Model model) {
        Optional<Categoria> categoria = categoriaRepository.findById(id);
        model.addAttribute("categoria", categoria);
        return "formularioProduto";
    }
}
