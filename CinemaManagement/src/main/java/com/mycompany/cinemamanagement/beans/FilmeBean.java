package com.mycompany.cinemamanagement.beans;

import com.mycompany.cinemamanagement.model.Filme;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class FilmeBean {

    private Filme filme = new Filme();

    public String salvarFilme() {
        // Simulação de persistência
        System.out.println("Filme cadastrado: " + filme.getTitulo());
        // Redirecionamento para a página inicial após o cadastro
        return "index.xhtml?faces-redirect=true";
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
}
