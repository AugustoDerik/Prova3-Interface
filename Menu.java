package apresentacao;

import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import negocio.FrameEscreverNome;
import negocio.FrameFuncionalidades;
import negocio.FrameQuartas;
import negocio.Participante;

public class Menu extends JFrame {

	Participante p = new Participante();

	public Menu() {

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		organizarLayout();
		setLocationRelativeTo(null);
		setVisible(true);
	}

	public void organizarLayout() {
		setLayout(new GridLayout(5, 1));

		add(new JLabel("Funcionalidades do bolão",(int) CENTER_ALIGNMENT));

		JButton b1 = new JButton("Cadastrar novo bolão");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FrameEscreverNome escreverNome = new FrameEscreverNome(p);
				setVisible(false);
			}
		});
		b1.setBackground(Color.lightGray);
		add(b1);
		
		JButton b2 = new JButton("Mostrar bolões cadastrados");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		b2.setBackground(Color.lightGray);
		add(b2);
		
		JButton b3 = new JButton("Importar bolões");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		b3.setBackground(Color.lightGray);
		add(b3);
		
		JButton b4 = new JButton("Exportar bolões");
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		b4.setBackground(Color.lightGray);
		add(b4);
	}
}
