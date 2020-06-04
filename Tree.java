package work;

import java.util.ArrayList;
import java.util.LinkedList;

public class Tree {

	private NoTree raiz;
	private LinkedList<NoTree> ordem = new LinkedList<NoTree>();
	int size;

	public void inserir(int num,int token, int nivel, String situacao, String decisao) {

		if(raiz != null) {inserir(num, token, nivel, situacao, decisao, ordem.get(token));
		}else{
			raiz = new NoTree(num, situacao, decisao, nivel);
			ordem.add(raiz);
		}
	}

	public void inserir(int num, int token, int nivel, String situacao,String decisao, NoTree pai) {

			NoTree novoFilho = new NoTree(num,situacao,decisao,token,nivel);
			pai.addChild(novoFilho);
			ordem.add(novoFilho);
		/*
		else {
		ArrayList<NoTree> filhos = pai.getChildren();

		if(filhos.size()<=2) {
			NoTree novoFilho = new NoTree(num,situacao,decisao,token,nivel);
			pai.addChild(novoFilho);
			}
		}

		/*
		if(filhos.size()==1)size++;
		} else {
			//if(pai.getValor()==token)
			for(int i=0; i<filhos.size(); i++) {
				if(pai==raiz) {
					inserir(num, token, nivel, situacao, decisao, pai.getChildren().get(i));
				}
				//else if(pai.getValor() == token && filhos.get(i).getNivel() + 1 == nivel && pai!=raiz) {
				//	inserir(num, token, nivel, situacao, decisao, pai.getChildren().get(i));
				//}
				else if(pai.getValor() == token && pai!=raiz) {
					inserir(num, token, nivel, situacao, decisao, pai.getChildren().get(i));
				}

			}
		}
		//return novoFilho;
		 */
	}

	public NoTree procurar(int token) {
		//NoTree found = new
		if(raiz.getValor() == token) {return raiz;}
		else {return procurar(raiz,token);}
	}

	public NoTree procurar(NoTree pai, int token) {
		//if(pai.getChildren().isEmpty()) {
			if(pai.getValor()== token) {
				return pai;
			} else if(!pai.getChildren().isEmpty()) {
			ArrayList<NoTree> filhos = pai.getChildren();

			for(int i=0; i<filhos.size(); i++) {
				if(filhos.get(i).getValor() == token) {
					return pai.getChildren().get(i);
				} else {
					pai = procurar(pai.getChildren().get(i), token);
				}
			}
		}

		return null;
	}

	public LinkedList<NoTree> getOrdem() {
		return ordem;
	}

	@Override
	public String toString() {
		return raiz.toString();
		//return String.format("[%d , %s, %s, %d ]\n",  this.valor, this.decisao, this.situacao, this.token, this.children);
	}

}
