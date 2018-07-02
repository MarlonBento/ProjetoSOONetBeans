package projeto.hibernate.dao;

import projeto.hibernate.utils.Connection;
import org.hibernate.Session;



import projeto.hibernate.modelo.Veiculo;

public class VeiculoDAO {


	public static Veiculo read(Integer id) {
		Session session = Connection.obterSessionFactory().openSession();
		Veiculo veic = (Veiculo) session
				.get(Veiculo.class, id);
		session.close();
		return veic;
				
		
	}	
	


}
