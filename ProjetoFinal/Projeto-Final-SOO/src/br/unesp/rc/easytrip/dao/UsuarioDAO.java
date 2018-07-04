/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.unesp.rc.easytrip.dao;

import br.unesp.rc.easytrip.model.Endereco;
import br.unesp.rc.easytrip.model.Usuario;
import br.unesp.rc.easytrip.utils.Connection;
import org.hibernate.Session;

/**
 *
 * @author Marlo
 */
public class UsuarioDAO {
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
        
        
        public static void delete(Integer idUsuario) {
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Usuario usr = read(idUsuario);
		session.delete(usr);		
		session.getTransaction().commit(); 
		session.close();	
		
	}
	
}
