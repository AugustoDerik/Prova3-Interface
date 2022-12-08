package negocio;

import java.util.ArrayList;

public class Participante {

	private int id;
	private String nome;

	private String campeao;

	private Selecao S1Q;
	private Selecao S2Q;
	private Selecao S3Q;
	private Selecao S4Q;
	private Selecao S5Q;
	private Selecao S6Q;
	private Selecao S7Q;
	private Selecao S8Q;
	private Selecao S1S;
	private Selecao S2S;
	private Selecao S3S;
	private Selecao S4S;
	private Selecao S1F;
	private Selecao S2F;

	public ArrayList<String> SelecaoNomeQ = new ArrayList<String>();
	public ArrayList<Integer> SelecaoPlacarQ = new ArrayList<Integer>();

	public ArrayList<String> SelecaoNomeS = new ArrayList<String>();
	public ArrayList<Integer> SelecaoPlacarS = new ArrayList<Integer>();

	public ArrayList<String> SelecaoNomeF = new ArrayList<String>();
	public ArrayList<Integer> SelecaoPlacarF = new ArrayList<Integer>();

	public Selecao[] listaSQ = { S1Q, S2Q, S3Q, S4Q, S5Q, S6Q, S7Q, S8Q };
	public Selecao[] listaSS = { S1S, S2S, S3S, S4S };
	public Selecao[] listaSF = { S1F, S2F };

	public Selecao getS1Q() {
		return S1Q;
	}

	public void setS1Q(Selecao s1q) {
		S1Q = s1q;
	}

	public Selecao getS2Q() {
		return S2Q;
	}

	public void setS2Q(Selecao s2q) {
		S2Q = s2q;
	}

	public Selecao getS3Q() {
		return S3Q;
	}

	public void setS3Q(Selecao s3q) {
		S3Q = s3q;
	}

	public Selecao getS4Q() {
		return S4Q;
	}

	public void setS4Q(Selecao s4q) {
		S4Q = s4q;
	}

	public Selecao getS5Q() {
		return S5Q;
	}

	public void setS5Q(Selecao s5q) {
		S5Q = s5q;
	}

	public Selecao getS6Q() {
		return S6Q;
	}

	public void setS6Q(Selecao s6q) {
		S6Q = s6q;
	}

	public Selecao getS7Q() {
		return S7Q;
	}

	public void setS7Q(Selecao s7q) {
		S7Q = s7q;
	}

	public Selecao getS8Q() {
		return S8Q;
	}

	public void setS8Q(Selecao s8q) {
		S8Q = s8q;
	}

	public Selecao getS1S() {
		return S1S;
	}

	public void setS1S(Selecao s1s) {
		S1S = s1s;
	}

	public Selecao getS2S() {
		return S2S;
	}

	public void setS2S(Selecao s2s) {
		S2S = s2s;
	}

	public Selecao getS3S() {
		return S3S;
	}

	public void setS3S(Selecao s3s) {
		S3S = s3s;
	}

	public Selecao getS4S() {
		return S4S;
	}

	public void setS4S(Selecao s4s) {
		S4S = s4s;
	}

	public Selecao getS1F() {
		return S1F;
	}

	public void setS1F(Selecao s1f) {
		S1F = s1f;
	}

	public Selecao getS2F() {
		return S2F;
	}

	public void setS2F(Selecao s2f) {
		S2F = s2f;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCampeao() {
		return campeao;
	}

	public void setCampeao(String campeao) {
		this.campeao = campeao;
	}
}
