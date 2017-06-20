package br.edu.eventoCientifico.controle;

import javax.swing.text.MaskFormatter;

import br.edu.eventocientifico.modelo.Evento;

/**
*<p>
*Classe de logica para a entidade evento
*</p>
**/
public class EventoControle extends Aevento {
	
	/**
	 * <p>
	 * Valida se os dados do evento estão corretos
	 * </p>
	 * 
	 * */
	public String validarEvento(Evento eve){
		if(eve != null){
			 if(eve.getDescricao() == null || eve.getDescricao().isEmpty()){
				return "Por favor, informe descrição:";
			}
						
		}else{
			return "Dados não informado";
		}
		
		return null;
	}
	
	public MaskFormatter Mascara(String Mascara){
		MaskFormatter F_Mascara = new MaskFormatter();
		try {
			F_Mascara.setMask(Mascara);
			F_Mascara.setPlaceholderCharacter(' ');
		} catch (Exception e) {
			e.printStackTrace();
		}
		return F_Mascara;
	}

}
