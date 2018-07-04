package br.unesp.rc.easytrip.model;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;


@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario implements Serializable{

    private Integer id;
    String nome;
    String contato;
    private List <Endereco> enderecos = new ArrayList<>();

	

	public Usuario() {}

	public Usuario(String nome, String contato) {
		super();
		this.nome = nome;
		this.contato = contato;
	}




	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "idUsr")
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "nome")
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}


	@OneToMany (cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	public List <Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List <Endereco> enderecos) {
		this.enderecos = enderecos;
	}

	
	public String getContato() {
		return contato;
	}

	public void setContato(String contato) {
		this.contato = contato;
	}
	

}