package br.unesp.rc.easytrip.dao;




import org.hibernate.Session;

import br.unesp.rc.easytrip.utils.Connection;

import br.unesp.rc.easytrip.model.Juridico;



public class JuridicoDAO {
		public static Integer create (String nome, String cnpj, String contato) {
		Juridico usuario = new Juridico(nome, cnpj, contato);
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		session.save(usuario);
		session.getTransaction().commit(); 
		session.close();
                return usuario.getId();
}


	public static void update(Integer idJur, String nome,  String cnpj, String contato) {

    	
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Juridico usr = read(idJur);

		if (nome.equals("")) {}
		else {usr.setNome(nome);}
		
		if (cnpj.equals("")) {}
		else {usr.setCnpj(cnpj);}
		
		if (contato.equals("")) {}
		else {usr.setContato(contato);}
		
		session.update(usr);
		
		session.getTransaction().commit(); 
		session.close();
		
	}
	


	
	public static Juridico read(Integer id) {
		Session session = Connection.obterSessionFactory().openSession();
		Juridico usr = (Juridico) session
				.get(Juridico.class, id);
		session.close();
		return usr;
				
		
	}	


	


     }
	
