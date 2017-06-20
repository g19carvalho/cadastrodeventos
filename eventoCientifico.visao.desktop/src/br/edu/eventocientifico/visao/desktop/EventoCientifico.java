package br.edu.eventocientifico.visao.desktop;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;


/*
 * <p>
 * Classe principal do projeto, contempla tela inicial
 *</p> 
 */
public class EventoCientifico extends JFrame{
	
	public EventoCientifico(){
		
		setTitle(":: Evento Cientifico ::");
		setSize(640,480);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		desenhaComponentes();
		// muda a aparencia da aplicação java
		try {
			UIManager.setLookAndFeel( new NimbusLookAndFeel());
		} catch (UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		setVisible(true);
	}
	
	private void desenhaComponentes() {
		
		// cria bara de menus
		JMenuBar menu = new JMenuBar();
		
		// cria o menu cadastro
		JMenu cadastro = new JMenu("Cadastro");
		menu.add(cadastro);
		
		// cria os sub-itens
		JMenuItem evento = new JMenuItem("Cadastrar Evento");
		
		
		//vincula ao menu cadastros
		cadastro.add(evento);
		
		
		//vincula as ações aos itens
		evento.addActionListener( new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				
				new FrmEvento(EventoCientifico.this);
				
			}
		});
		
				
		
		// adiciona o menu em tela
		setJMenuBar(menu);
		
	}

	public static void main(String[] args) {
		
		new EventoCientifico();
	}

}
