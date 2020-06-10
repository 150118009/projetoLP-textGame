package work;

import java.util.LinkedList;

public class Tree {
    
	private NoTree raiz;
	private LinkedList<NoTree> ordem = new LinkedList<NoTree>();
	int size;
	
	//M�todo que insere a raiz e no caso da raiz ser diferente de null chama o m�todo inserir com um
	//argumento adicional que ser� o n� pai
	
	public void inserir(int num,int token, int nivel, String situacao, String decisao) {
		
		if(raiz != null) {inserir(num, token, nivel, situacao, decisao, ordem.get(token));
		}else{
			raiz = new NoTree(num, situacao, decisao,token , nivel);
			ordem.add(raiz);
		}
	}
	
	//M�todo para inserir n�s na �rvore e na linkedList ordem
	public void inserir(int num, int token, int nivel, String situacao,String decisao, NoTree pai) {
		
			NoTree novoFilho = new NoTree(num,situacao,decisao,token,nivel);
			pai.addChild(novoFilho);
			ordem.add(novoFilho);
	}
	
	public NoTree procurar(int token) {
		return ordem.get(token);
	}
	
	
	@Override
	public String toString() {
		return raiz.toString();
	}

}