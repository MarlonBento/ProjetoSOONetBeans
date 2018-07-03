package br.unesp.rc.easytrip.dao;

import br.unesp.rc.easytrip.utils.Connection;
import org.hibernate.Session;



import br.unesp.rc.easytrip.model.Veiculo;

public class VeiculoDAO {


	public static Veiculo read(Integer id) {
		Session session = Connection.obterSessionFactory().openSession();
		Veiculo veic = (Veiculo) session
				.get(Veiculo.class, id);
		session.close();
		return veic;
				
		
	}	
	


}
