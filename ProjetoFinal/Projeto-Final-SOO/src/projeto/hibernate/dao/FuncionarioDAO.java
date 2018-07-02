package projeto.hibernate.dao;

import projeto.hibernate.utils.Connection;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;


import projeto.hibernate.modelo.Funcionario;

import projeto.hibernate.modelo.Veiculo;

public class FuncionarioDAO {
		
	
	

	public static Integer create (String nome, String cpf, double salario, Date dataAd, String contato) {
		Funcionario funcionario = new Funcionario(nome, cpf, salario, dataAd , contato);
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		session.save(funcionario);
		
		session.getTransaction().commit(); 
		session.close();
                return (funcionario.getId());
		
	}
	
	public static Funcionario read(Integer idFuncionario) {
		Session session = Connection.obterSessionFactory().openSession();
		Funcionario funcionario = (Funcionario) session
				.get(Funcionario.class, idFuncionario);
		session.close();
		return funcionario;
		
				
		
	}

	
	public static void update(Integer idFuncionario, String nome, String cpf, Double salario, Date dataAd, String contato) {
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Funcionario funcT = read(idFuncionario);
		
		if (cpf.equals("")) {}
		else {funcT.setCpf(cpf);}
		
		if (nome.equals("")) {}
		else {funcT.setNome(nome);}
		
		if (salario==null) {}
		else {funcT.setSalario(salario);}
		
		if (contato.equals("")) {}
		else {funcT.setContato(contato);}
                
                if(dataAd==null){}
                else{funcT.setDataAdmissao(dataAd) ;}


		session.update(funcT);
		
		session.getTransaction().commit(); 
		session.close();
		
	}
	
	public static void nCar(int id, Veiculo veic) {
		Funcionario funcionario = FuncionarioDAO.read(id);
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		
		funcionario.getVeiculos().add(veic);
		session.update(funcionario);
		session.save(veic);
		
		session.getTransaction().commit(); 
		session.close();
		
	}
	
	
	public static void delete(Integer idFuncionario) {
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		Funcionario funcD = read(idFuncionario);
		session.delete(funcD);		
		session.getTransaction().commit(); 
		session.close();	
		
	}
	
	public static void list() {
		List<Funcionario> list= null;
		Session session = Connection.obterSessionFactory().openSession();
		session.beginTransaction();
		 list = session.createQuery ("select t from Funcionario t").list();
               session.getTransaction().commit();
               for (Funcionario funcionario : list) {
                      System.out.println("ID: "+ funcionario.getId() +" Nome: "+ funcionario.getNome() +"  CPF: " + funcionario.getCpf());
               }

     }




}
