package com.mycompany.cinemamanagement.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Filme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String genero;
    private int duracao;

    @OneToMany(mappedBy = "filme", cascade = CascadeType.ALL)
    private List<Sessao> sessoes;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getGenero() { return genero; }
    public void setGenero(String genero) { this.genero = genero; }

    public int getDuracao() { return duracao; }
    public void setDuracao(int duracao) { this.duracao = duracao; }

    public List<Sessao> getSessoes() { return sessoes; }
    public void setSessoes(List<Sessao> sessoes) { this.sessoes = sessoes; }
}
