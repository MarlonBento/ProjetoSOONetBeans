package projeto.hibernate.dao;


import projeto.hibernate.utils.Connection;
import java.util.List;


import org.hibernate.Session;




import projeto.hibernate.modelo.Usuario;
import projeto.hibernate.modelo.Viagem;
import static projeto.hibernate.utils.Connection.obterSessionFactory;


public class ViagemDAO {
	

	public static void create(Viagem viagem) {
                        
			Session session = obterSessionFactory().openSession();
			session.beginTransaction();
			session.save(viagem);
                        session.getTransaction().commit(); 
                        session.close();
                        
                        
}
		
		
		public static Viagem read(Integer id) {
			Session session = obterSessionFactory().openSession();
			Viagem viag = (Viagem) session
					.get(Viagem.class, id);
			session.close();
			return viag;
					
			
		}	
		
		
		public static void nUsr(Integer idV, Integer idU){
		Usuario usuario = UsuarioDAO.read(idU);
                Viagem viagem = ViagemDAO.read(idV);
		Session session = obterSessionFactory().openSession();
		session.beginTransaction();
		viagem.getUsuario().add(usuario);
		session.update(viagem);	
                session.update(usuario);
		session.getTransaction().commit(); 
		session.close();
		
	      }
		
	public static void list() {
		List<Viagem> list= null;
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		 list = session.createQuery ("select t from Viagem t").list();
               session.getTransaction().commit();
                
               for (Viagem viagem : list) {
                      System.out.println
                       ("Viagem id:"+ viagem.getId() + " Data " + viagem.getDataViagem() +" Origem: " + viagem.getOrigem() +" Destino:" +viagem.getDestino());
               }

     }
	
	


}
