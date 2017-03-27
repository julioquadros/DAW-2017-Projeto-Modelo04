/*
 * @Author: Julio Sergio Quadros dos Santos.
 * @Email: julioquadros@hotmail.com
 * @2017 - Todos os Direitos Reservados
 */
package br.edu.ifsul.modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "idioma")
public class Idioma implements Serializable {
    @Id
    @SequenceGenerator(name = "seq_idioma", sequenceName = "seq_idioma_id", allocationSize = 1)
    private Integer id;
    private String nome;
    private String sigla;

    public Idioma() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
