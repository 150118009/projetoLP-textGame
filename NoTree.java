package work;
import java.util.ArrayList;

public class NoTree {
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