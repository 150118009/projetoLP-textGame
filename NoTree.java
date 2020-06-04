package work;
import java.util.ArrayList;

public class NoTree {
<<<<<<< HEAD

	private int valor;
	private String decisao;
	private String situacao;
	private int token;
	private int nivel;
	private ArrayList<NoTree> children;

	public NoTree(int valor, String decisao, String situacao, int nivel) {
		this.valor = valor;
		this.decisao = decisao;
		this.situacao = situacao;
		this.nivel = nivel;
		this.children = new ArrayList<>();
	}

	public NoTree(int valor, String decisao, String situacao,int token, int nivel) {
		this.valor = valor;
		this.decisao = decisao;
		this.situacao = situacao;
		this.token = token;
		this.nivel = nivel;
		this.children = new ArrayList<>();
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

	@Override
	public String toString() {
		return String.format("[%d, %d, %d , %s, %s, %s ]\n",  this.valor, this.token, this.nivel, this.decisao, this.situacao, this.children);
	}

}
=======
    private int valor;
    private String decisao;
    private String situacao;
    private int token;
    private int nivel;
    private ArrayList<NoTree> children;

    public NoTree(int valor, String decisao, String situacao) {
    public NoTree(int valor, String decisao, String situacao, int nivel) {
        this.valor = valor;
        this.decisao = decisao;
        this.situacao = situacao;
        this.nivel = nivel;
        this.children = new ArrayList<>();
    }

    public NoTree(int valor, String decisao, String situacao,int token, int nivel) {
        this.valor = valor;
        this.decisao = decisao;
        this.situacao = situacao;
        this.token = token;
        this.nivel = nivel;
        this.children = new ArrayList<>();
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

    public String getDecisao() {
        return decisao;
    }
    public void removeChild(int valor) {
        children.remove(valor);
    }

    @Override
    public String toString() {
        return String.format("[%d, %d, %d , %s, %s, %s ]\n",  this.valor, this.token, this.nivel, this.decisao, this.situacao, this.children);
    }

}
>>>>>>> 2e0d7a95430f125b8cec1958eef05883d68fe052
