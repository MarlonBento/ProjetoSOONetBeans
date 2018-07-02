package projeto.hibernate.dao;


import projeto.hibernate.utils.Connection;
import java.util.List;

import org.hibernate.Session;

import projeto.hibernate.modelo.Endereco;
import projeto.hibernate.modelo.Usuario;


public class UsuarioDAO {
		public static Integer create (String nome, Integer idade, String ec,  String cpf, String contato) {
		Usuario usuario = new Usuario(nome, idade, ec, cpf, contato);	
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		session.save(usuario);
		session.getTransaction().commit(); 
		session.close();
                return usuario.getId();
}

		
	
	public static void delete(Integer idUsuario) {
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Usuario usr = read(idUsuario);
		session.delete(usr);		
		session.getTransaction().commit(); 
		session.close();	
		
	}
	

	public static void update(Integer idUsr, String nome, Integer idade, String estadoCivil,  String cpf, String contato) {

    	
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Usuario usr = read(idUsr);

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
	


	public static void nEnd(int id, Endereco end) {
		Usuario usuario = UsuarioDAO.read(id);
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		usuario.getEnderecos().add(end);
		session.update(usuario);
		session.getTransaction().commit(); 
		session.close();
		
	}
	public static Usuario read(Integer id) {
		Session session = Connection.obterSessionFactory().openSession();
		Usuario usr = (Usuario) session
				.get(Usuario.class, id);
		session.close();
		return usr;
				
		
	}	
	
	public static void list() {
		List<Usuario> list= null;
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		 list = session.createQuery ("select t from Usuario t").list();
               session.getTransaction().commit();
                
               for (Usuario usuario : list) {

                      System.out.println
                       ("ID: "+ usuario.getId() +" Nome: "+ usuario.getNome() +" Idade: " + usuario.getIdade() + " CPF: " + usuario.getCpf());
               }

     }
	


	
}
