package br.unesp.rc.easytrip.dao;




import org.hibernate.Session;

import br.unesp.rc.easytrip.utils.Connection;
import br.unesp.rc.easytrip.model.Fisico;



public class FisicoDAO {
		public static Integer create (String nome, Integer idade, String ec,  String cpf, String contato) {
		Fisico usuario = new Fisico(nome, idade, ec, cpf, contato);
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		session.save(usuario);
		session.getTransaction().commit(); 
		session.close();
                return usuario.getId();
}


	public static void update(Integer idFis, String nome, Integer idade, String estadoCivil,  String cpf, String contato) {

    	
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Fisico usr = read(idFis);

		if (nome.equals("")) {}
		else {usr.setNome(nome);}
		
		if (estadoCivil.equals("")) {}
		else {usr.setEstadoCivil(estadoCivil);}
		
		if (idade==null) {}
		else {usr.setIdade(idade);}
		
		if (cpf.equals("")) {}
		else {usr.setCpf(cpf);}
		
		if (contato.equals("")) {}
		else {usr.setContato(contato);}
		
		session.update(usr);
		
		session.getTransaction().commit(); 
		session.close();
		
	}
	


	
	public static Fisico read(Integer id) {
		Session session = Connection.obterSessionFactory().openSession();
		Fisico usr = (Fisico) session
				.get(Fisico.class, id);
		session.close();
		return usr;
				
		
	}	
	
	
     }
	


	

