package br.edu.eventocientifico.visaot.web;

import java.util.Date;
import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.edu.eventoCientifico.controle.EventoControle;
import br.edu.eventocientifico.modelo.Evento;

@Resource

public class EventoController {
	
	private EventoControle controle;
	private Result result;
	
	public EventoController(EventoControle controle, Result result){
		this.controle = controle;
		this.result = result;
		
	}
	
	public void listar(){
		List itens = controle.buscarTodos(Evento.class);
		result.include("Evento", itens);
	}
	
	//carrega a visao para adicionar item
	public void cadastrar(){
		
		
	}
	
	public void gravar(Evento evento, Date data){
				evento.setData(data);
		controle.gravar(evento);
		
	}

}
