package work;
import java.util.ArrayList;

public class NoTree {

	private int valor;
	private Info info;
	private ArrayList<NoTree> children;
	
	public NoTree(int valor, String decisao, String situacao,int token, int nivel) {
		this.info = new Info(decisao,situacao, token, nivel);
		this.valor = valor;
		this.children = new ArrayList<>();
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
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
	
	@Override
	public String toString() {
		return String.format("[%s , %s ]\n", this.info, this.children);
	}
	
}