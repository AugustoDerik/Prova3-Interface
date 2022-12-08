package negocio;

import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameFuncionalidades extends JFrame {

	public FrameFuncionalidades(Participante p) {
		setTitle("Funcionalidades do Bolão");
		setSize(300,300);
	    setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	    setLayout(new GridBagLayout());
	    int i = 0;
	    while( i < 3) {
			JButton b = new JButton(i+"");
			i++;
			add(b);
	    }
//	    pack();
	    setVisible(true);
	}

}
