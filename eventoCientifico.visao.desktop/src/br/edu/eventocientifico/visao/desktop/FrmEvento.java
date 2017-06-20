package br.edu.eventocientifico.visao.desktop;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import br.edu.eventoCientifico.controle.EventoControle;
import br.edu.eventocientifico.modelo.Evento;
import br.edu.eventoCientifico.controle.*;

/**
 * <p>
 * Classe que representa a view para gerir eventos
 * </p>
 * @author Joseane Carvalho
 *
 */
public class FrmEvento extends JFrame{
	
	private EventoCientifico telaPrincipal;

	public FrmEvento( EventoCientifico telaPrincipal ) {
		
		this.telaPrincipal = telaPrincipal;
		setTitle(":: Evento Cientifico -> Evento ::");
		setSize(320, 240);
		setLocationRelativeTo(telaPrincipal);
		desenhaComponentes();
		setVisible(true);
		
	}

	private void desenhaComponentes() {

		EventoControle controle = new EventoControle();
		
		JLabel lblData = new JLabel("Data: ");
		JLabel lblDescricao = new JLabel("Descricao: ");
		JFormattedTextField txtData = new JFormattedTextField(controle.Mascara("##/##/####"));
		JTextField txtDescricao = new JTextField(30);
		JButton btnGravar = new JButton("Gravar");
		
		setLayout( new FlowLayout(FlowLayout.LEFT));
		
		btnGravar.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				
				//pegar os dados da tela
				Evento e = new Evento();
				
				SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
				Date d;
				try {
					d = formato.parse(txtData.getText());
					e.setData(d);
				} catch (ParseException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				e.setDescricao(txtDescricao.getText());
			
				
				//valida os dados
				String erro = controle.validarEvento(e);
				if(erro == null){
					//nenhum erro criado
							
					//realiza a gravaçao
					controle.gravar(e);
					JOptionPane.showMessageDialog(null, "Gravado!");

				}else{
					JOptionPane.showMessageDialog(null, erro, "Validação", JOptionPane.WARNING_MESSAGE);

				}
			}
		});
		
		// adiciona os componentes em tela
		add(lblData);
		add(txtData);
		add(lblDescricao);
		add(txtDescricao);
		add(btnGravar);
		
	}
	

}
