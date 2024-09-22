package com.mycompany.cinemamanagement.beans;

import com.mycompany.cinemamanagement.model.Cliente;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named
@RequestScoped
public class ClienteBean {

    private Cliente cliente = new Cliente();

    public String salvarCliente() {
        // Simulação de persistência
        System.out.println("Cliente cadastrado: " + cliente.getNome());
        // Redirecionamento para a página inicial após o cadastro
        return "index.xhtml?faces-redirect=true";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
