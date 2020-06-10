package work;

public class Info {

	private String decisao;
	private String situacao;
	private int token;
	private int nivel;
	
	public Info(String decisao, String situacao, int token, int nivel) {
		this.decisao = decisao;
		this.situacao = situacao;
		this.token = token;
		this.nivel = nivel;
	}

	public String getDecisao() {
		return decisao;
	}

	public void setDecisao(String decisao) {
		this.decisao = decisao;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	
	public int getNivel() {
		return nivel;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	public int getToken() {
		return token;
	}

	public void setToken(int token) {
		this.token = token;
	}
	
	@Override
	public String toString() {
		return String.format("[%d, %d , %s, %s]\n",  this.token, this.nivel, this.decisao, this.situacao);
	}
	
}
