package br.com.vollmed.Api.model.medico;

import jakarta.persistence.Entity;

@Entity
public class Medico {
    // atributos -> características -> variáveis
    String nome;
    String email;
    String telefone;
    String crm;
    Especialidade especialidade;
}
