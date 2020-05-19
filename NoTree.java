import java.util.ArrayList;

public class NoTree {

	private int valor;
	private String decisao;
	private String situacao;
	private ArrayList<NoTree> children;

	public NoTree(int valor, String decisao, String situacao) {
		this.valor = valor;
		this.decisao = decisao;
		this.situacao = situacao;
		this.children = new ArrayList<>();
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

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	public ArrayList<NoTree> getChildren(){
		return children;
	}

	public void addChild(NoTree child) {
		children.add(child);
	}

	public void removeChild(NoTree child) {
		children.remove(child);
	}

	public void removeChild(int valor) {
		children.remove(valor);
	}
}
