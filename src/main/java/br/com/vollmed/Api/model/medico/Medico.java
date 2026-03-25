package br.com.vollmed.Api.model.medico;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // SPRING JPA - Informa que a classe é uma entidade, ou seja, será uma tabela no BD.
@Table(name = "medicos") // SPRING JPA - *Opcional, altera o nome da tabela de medico para medicos
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Medico {
    // atributos -> características -> variáveis
    private String nome;
    private String email;
    private String telefone;
    private String crm;
    private Especialidade especialidade;
}
