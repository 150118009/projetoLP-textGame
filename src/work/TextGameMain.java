package work;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner; 

public class TextGameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tree jogo = criarJogo();
		jogar(jogo);
		//System.out.println(jogo);
		
	}
	
	public static void jogar(Tree jogo) {
		//LinkedList<NoTree> jogoOrdenado = jogo.getOrdem();
		Scanner scan = new Scanner(System.in);
		int token = 0;
		boolean alive = true;
		
		System.out.println("Um latejar intenso vai-se apoderando da tua cabe�a conforme vais retomando a consci�ncia.\r\n "
				+ "Pouco a pouco recuperas os sentidos e voltas a sentir cada parte do teu corpo.\r\n "
				+ "E todo ele d�i. Sentes a boca seca com um ligeiro sabor a ferrugem. Confuso, abres os olhos com algum esfor�o.\r\n "
				+ "A luz do sol a bater-te nos olhos fez disparar o teu cora��o e provocou suores frios como se tivesses acordado de um pesadelo horrivel.\r\n "
				+ "Mas porqu�? Levas uma m�o � cabe�a e olhando em volta percebes que est�s numa esp�cie de floresta.\r\n");
		
		NoTree death = null;
		while(alive) {
		NoTree pai = jogo.procurar(token);
		ArrayList<NoTree> caminhos = pai.getChildren();
		if(caminhos.size()==0) {
			alive=false;
			death = pai;
			break;
		}
		System.out.println(pai.getInfo().getSituacao());
		System.out.println("Decides:");
		
		for(NoTree caminho : caminhos) {
		System.out.println(caminho.getValor() + " - " + caminho.getInfo().getDecisao());	
		}
		
		int resposta = scan.nextInt();
		if(resposta >= caminhos.get(0).getValor() && resposta <= caminhos.get(caminhos.size()-1).getValor()){
			token = resposta;
		} else {
			System.out.println("Resposta n�o permitida, por favor escolha novamente");
			int respostaNova = scan.nextInt();
			token = respostaNova;
			}
		}
		System.out.println(" "+death.getInfo().getSituacao() +"\n Pretendes jogar novamente?\n Responde de seguida com 1(sim) ou 0(n�o).");
		int newGame = scan.nextInt();
			
		if(newGame==1) {
			alive=true;
			jogar(jogo);
		} else if (newGame==0){
			System.out.println("FIM. Para explorar mais � s� correr o programa de novo.");
		}
	}
	
	public static Tree criarJogo() {
		
		Tree jogo = new Tree();
		System.out.println("");
		jogo.inserir(0,0, 0,"Raiz","- Por mais que te esforces n�o te consegues lembrar de nada.");
		
		jogo.inserir(1,0, 1,"Ficar � espera que venha algu�m;","- Olhas em volta e s� v�s �rvores e mato. Tornas a deitar-te � espera que venha algu�m.\r\n Mas depressa percebes que � in�til. Provavelmente ningu�m anda � tua procura.");//, jogo.procurar(0));
		jogo.inserir(2,0, 1,"Explorar a �rea;","- Ao te levantares sentes uma dor aguda na perna. Deve estar partida. Vai ser dif�cil sair daqui assim�");//, jogo.procurar(0));
		jogo.inserir(3,0, 1,"Procurar o telem�vel;","- Ao achares o tel�movel nos bolsos, a luz acende-se e de repente lembraste-te que ias a conduzir um carro.");//, jogo.procurar(0));
		
		jogo.inserir(4,1, 2,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(1)); //MORRESTE
		jogo.inserir(5,1, 2,"Explorar a �rea;","- Ao tentares levantar-te apercebes-te que tens a perna partida. Fazes uma tala uns paus e um cachecol e caminhas em frente. \r\n Achaste um carro.");//, jogo.procurar(1));
		jogo.inserir(6,1, 2,"Ligar a algu�m a pedir ajuda;","- Ao achares o tel�movel nos bolsos, a luz acende-se e de repente lembraste-te que ias a conduzir um carro.\r\nDesistes da ideia de ligar e tentas levantar-te. Apercebes-te que tens a perna partida e fazes uma tala com uns paus e um cachecol. Caminhas em frente. Achas um carro.");//, jogo.procurar(1));
		
		jogo.inserir(7,2, 2,"Gritar por ajuda.","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(2)); //MORRESTE
		jogo.inserir(8,2, 2,"Tratar da perna;","- Com uns paus e um cachecol improvisaste uma tala para a perna, firme o suficiente para andares melhor.\r\nCaminhas em frente. Achas um carro.");//, jogo.procurar(2));
		jogo.inserir(9,2, 2,"Ligar a algu�m a pedir ajuda;","- Ao achares o tel�movel nos bolsos, a luz acende-se e de repente lembraste-te que ias a conduzir um carro.\r\nDesistes da ideia de ligar e tentas levantar-te. Apercebes-te que tens a perna partida e fazes uma tala com uns paus e um cachecol. Caminhas em frente. Achas um carro.");//, jogo.procurar(2));

		jogo.inserir(10,3, 2,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres");//, jogo.procurar(3));
		jogo.inserir(11,3, 2,"Fazer um esfor�o para te lembrares do que se passou;","- Tentas concentrar-te para te lembrares do que se passou.\r\n Ap�s alguns minutos, o nevoeiro mental levantou-se e lembraste-te que atropelas-te algu�m. ");//, jogo.procurar(3));
		jogo.inserir(12,3, 2,"Ligar a algu�m a pedir ajuda;","- Ao achares o tel�movel nos bolsos, a luz acende-se e de repente lembraste-te que ias a conduzir um carro.\r\nDesistes da ideia de ligar e tentas levantar-te. Apercebes-te que tens a perna partida e fazes uma tala com uns paus e um cachecol. Caminhas em frente. Achas um carro.");//, jogo.procurar(3));
		
		
		jogo.inserir(13,5, 3,"Analisar o carro.","- Ao analisar o carro relembras-te de que atropelas-te algu�m mas n�o tens a certeza de quem era. Segues as marcas das rodas do carro.\r\nQuando chegas � estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(4)); //
		jogo.inserir(14,5, 3,"Seguir as marcas das rodas;","- Ao seguires as marcas das rodas, relembras-te que atropelas-te algu�m\r\n mas n�o te lembras de quem foi. Chegas a uma estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(4));
		jogo.inserir(15,5, 3,"Gritar por ajuda.","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(4)); //MORREST
		
		jogo.inserir(16,6, 3,"Analisar o carro;","- Ao analisar o carro relembras-te de que atropelas-te algu�m mas n�o tens a certeza de quem era.Segues as marcas das rodas do carro.\r\nQuando chegas � estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(5));
		jogo.inserir(17,6, 3,"Seguir as marcas das rodas;","- Ao seguires as marcas das rodas, relembras-te que atropelas-te algu�m\r\n mas n�o te lembras de quem foi. Chegas a uma estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(5));
		jogo.inserir(18,6, 3,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(5));//MORRESTE

		jogo.inserir(19,8, 3,"Analisar o carro;","- Ao analisar o carro relembras-te de que atropelas-te algu�m mas n�o tens a certeza de quem era.Segues as marcas das rodas do carro.\r\nQuando chegas � estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(6));
		jogo.inserir(20,8, 3,"Seguir as marcas das rodas;","- Ao seguires as marcas das rodas, relembras-te que atropelas-te algu�m\r\n mas n�o te lembras de quem foi. Chegas a uma estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(6));
		jogo.inserir(21,8, 3,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(6));//MORRESTE
		
		jogo.inserir(22,9, 3,"Analisar o carro;","- Ao analisar o carro relembras-te de que atropelas-te algu�m mas n�o tens a certeza de quem era.Segues as marcas das rodas do carro.\r\nQuando chegas � estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(7));
		jogo.inserir(23,9, 3,"Seguir as marcas das rodas;","- Ao seguires as marcas das rodas, relembras-te que atropelas-te algu�m\r\n mas n�o te lembras de quem foi. Chegas a uma estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(7));
		jogo.inserir(24,9, 3,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(7));
		
		jogo.inserir(25,11, 3,"Explorar a �rea;","- Ao tentares levantar-te apercebes-te que tens a perna partida. Fazes uma tala uns paus e um cachecol e caminhas em frente. \r\n Achaste um carro.");//, jogo.procurar(8));
		jogo.inserir(26,11, 3,"Desistir;","Sucumbes � tenebrosa floresta e acabas por morrer por uma ferida exposta.");//, jogo.procurar(8));//MORRESTE
		jogo.inserir(27,11, 3,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(8));//MORRESTE

		jogo.inserir(28,12, 3,"Analisar o carro;","- Ao analisar o carro relembras-te de que atropelas-te algu�m mas n�o tens a certeza de quem era.Segues as marcas das rodas do carro.\r\nQuando chegas � estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(9));
		jogo.inserir(29,12, 3,"Seguir as marcas das rodas;","- Ao seguires as marcas das rodas, relembras-te que atropelas-te algu�m\r\n mas n�o te lembras de quem foi. Chegas a uma estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");// jogo.procurar(9));
		jogo.inserir(30,12, 3,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(9));
		
		jogo.inserir(31,25, 3,"Analisar o carro;","- Ao analisar o carro relembras-te de que atropelas-te algu�m mas n�o tens a certeza de quem era.Segues as marcas das rodas do carro.\r\nQuando chegas � estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(10));
		jogo.inserir(32,25, 3,"Seguir as marcas das rodas;","- Ao seguires as marcas das rodas, relembras-te que atropelas-te algu�m\r\n mas n�o te lembras de quem foi. Chegas a uma estrada, olhas para a esquerda de depois para a direita, v�s um par de faro�s e por breves momentos consegues ver o condutor.\r\n O condutor �s tu.");//, jogo.procurar(10));
		jogo.inserir(33,25, 3,"Gritar por ajuda;","- Gritas o mais alto que consegues. Uma e outra vez. \r\n Come�as a ouvir algo a correr na tua dire��o. Tentas fugir mas �s apanhado por um lobo e morres.");//, jogo.procurar(10));
		return jogo;
	}
	
}
