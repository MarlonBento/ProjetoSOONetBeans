/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.easytrip.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Marlo
 */
@Entity
@PrimaryKeyJoinColumn(name="idusr")
public class Juridico extends Usuario {
    private String cnpj;

    public Juridico(String nome, String cnpj, String contato) {
        super();
	this.nome = nome;
	this.cnpj = cnpj;
	this.contato = contato;
    }

    public Juridico() {
        
    }
    /**
     * @return the cnpj
     */
    public String getCnpj() {
        return cnpj;
    }

    /**
     * @param cnpj the cnpj to set
     */
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
  
    
  
   
}

