import java.util.ArrayList;

public class NoTree {

	private int valor;
	private ArrayList<NoTree> children;

	public NoTree(int valor) {
		this.valor = valor;
		this.children = new ArrayList<>();
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
