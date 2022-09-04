package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.modelo.Produto;

@Controller
public class Controle {
	@RequestMapping("/verproduto")
	public String exibirProduto(Model modelo) {
		Produto produto = new Produto();
		produto.setNome("Notebook");
        produto.setPreco(5000.99);
        modelo.addAttribute("prod", produto);
		return "exibeproduto";
	}
}
