package negocio;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameCampeao extends JFrame {

	public Participante p;
	public String aux[];
	public JLabel label;

	public FrameCampeao(Participante p, String vencedorF[]) {

		this.p = p;
		aux = vencedorF;
		setTitle("Seleção Campeã segundo o palpite do participante");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 600);
		setLocationRelativeTo(null);
		label = new JLabel();
		bandeira();
		add(label);
		setVisible(true);

	}

	public void bandeira() {
		if (aux[0].equals("BRA")) {
			label.setIcon(new ImageIcon("brasil.png"));
		}

	}
}
