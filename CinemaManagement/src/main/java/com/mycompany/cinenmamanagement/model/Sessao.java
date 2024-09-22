package com.mycompany.cinemamanagement.model;

import jakarta.persistence.*;
import java.util.Date;

@Entity
public class Sessao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Temporal(TemporalType.DATE)
    private Date data;
    
    private String hora;
    private String sala;

    @ManyToOne
    @JoinColumn(name = "filme_id")
    private Filme filme;

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Date getData() { return data; }
    public void setData(Date data) { this.data = data; }

    public String getHora() { return hora; }
    public void setHora(String hora) { this.hora = hora; }

    public String getSala() { return sala; }
    public void setSala(String sala) { this.sala = sala; }

    public Filme getFilme() { return filme; }
    public void setFilme(Filme filme) { this.filme = filme; }
}
