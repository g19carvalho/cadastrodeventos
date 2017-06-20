package br.edu.eventoCientifico.controle;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

import br.edu.eventocientifico.modelo.dao.HibernateDAO;;

/**
*<p>
*Controlador generico que agrupa as funções comuns de logicas, como gravar, buscar, etc
*</p>
*/

public abstract class Aevento {
	//gravar ou atualizar uma informaÃ§Ã£o em banco
		public void gravar(Object entidade){
			//estabelece a conexao
			Session sessao = HibernateDAO.getSessao();
			sessao.getTransaction().begin();
			sessao.saveOrUpdate(entidade);
			sessao.getTransaction().commit();

		}
		
		
		//busca todos os registros de uma determinada entidade(classe)
		public List buscarTodos(Class classe){
			//estalece a conexao
			Session sessao = HibernateDAO.getSessao();
			Criteria c = sessao.createCriteria(classe);
			return c.list();
		}
		//excluir entidades
		public void excluir(Object entidade){
			
		}
		/**
		 * <p>
		 * Converte um termo em numero, caso esteja em formato invalido retorna-se zero
		 * </p>
		 * */
		public int converteInteiro(String termo){
			try{
				return Integer.parseInt(termo);
				
			}catch(Exception e){
				return 0;
				
			}
		
		}
		
		/**
		 * <p>
		 * Converte um termo em numero com casa decimais, caso esteja em formato invalido retorna-se zero
		 * </p>
		 * */
		public float converteFlutuante(String termo){
			try{
				return Float.parseFloat(termo);
				
			}catch(Exception e){
				return 0;
				
			}
		}
}
