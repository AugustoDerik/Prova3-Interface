package negocio;

import javax.swing.ImageIcon;

public class Selecao {

	private String nome;
	private int placar;
	private ImageIcon bandeira;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getPlacar() {
		return placar;
	}

	public void setPlacar(int placar) {
		this.placar = placar;
	}

	public ImageIcon getBandeira() {
		return bandeira;
	}

	public void setBandeira(ImageIcon bandeira) {
		this.bandeira = bandeira;
	}

}
