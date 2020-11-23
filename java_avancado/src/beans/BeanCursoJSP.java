package beans;

public class BeanCursoJSP {

	private String nome;
	private String ano;
	private String sexo;

	public BeanCursoJSP() {
		super();
	}

	public BeanCursoJSP(String nome, String ano, String sexo) {
		super();
		this.nome = nome;
		this.ano = ano;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public int calcula(int numero) {
		return numero * 100;
	}
}
