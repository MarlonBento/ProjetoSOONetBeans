/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.easytrip.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Marlo
 */
@Entity
@PrimaryKeyJoinColumn(name="idUsr")
public class Fisico extends Usuario  {


    private String cpf;
    private String estadoCivil;
    private Integer idade;
    
    public Fisico(){}

    public Fisico(String nome, Integer idade, String ec, String cpf, String contato) {
                super();
		this.nome = nome;
		this.idade = idade;
		this.estadoCivil = estadoCivil;
                this.cpf = cpf;
		this.contato = contato;
    }
    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
     
    
        /**
     * @return the estadoCivil
     */
    public String getEstadoCivil() {
        return estadoCivil;
    }

    /**
     * @param estadoCivil the estadoCivil to set
     */
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    /**
     * @return the idade
     */
    public Integer getIdade() {
        return idade;
    }

    /**
     * @param idade the idade to set
     */
    public void setIdade(Integer idade) {
        this.idade = idade;
    }
}
