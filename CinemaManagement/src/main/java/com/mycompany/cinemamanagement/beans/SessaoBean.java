package com.mycompany.cinemamanagement.beans;

import com.mycompany.cinemamanagement.model.Sessao;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class SessaoBean {

    private Sessao sessao = new Sessao();
    private Long filmeId;

    public String salvarSessao() {
        // Simulação de persistência
        System.out.println("Sessão cadastrada para o filme ID: " + filmeId);
        // Redirecionamento para a página inicial após o cadastro
        return "index.xhtml?faces-redirect=true";
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }

    public Long getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(Long filmeId) {
        this.filmeId = filmeId;
    }
}
