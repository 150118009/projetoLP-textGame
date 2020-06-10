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
		
		System.out.println("Este programa é um jogo de texto em que o utilizador decide um caminho ao escolher o número do caminho que pretende seguir");
		System.out.println("Acordas-te numa floresta sem qualquer memória do passado");
		
		while(alive) {
		NoTree pai = jogo.procurar(token);
		ArrayList<NoTree> caminhos = pai.getChildren();
		System.out.println(caminhos.size());
		if(caminhos.size()==0) {
			alive=false;
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
			System.out.println("Resposta não permitida, por favor escolha novamente");
			int respostaNova = scan.nextInt();
			token = respostaNova;
			}
		}
		System.out.println("Morreste devido a uma decisão incorretamente tomada.\n Pretendes jogar novamente?\n Responde de seguida com 1(sim) ou 0(não).");
		int newGame = scan.nextInt();
			
		if(newGame==1) {
			alive=true;
			jogar(jogo);
		} else if (newGame==0){
			System.out.println("Foi um bom jogo e quando quiseres voltar a jogar só precisas de correr o programa novamente.");
		}
	}
	
	public static Tree criarJogo() {
		
		Tree jogo = new Tree();
	
		jogo.inserir(0,0, 0,"Raiz","Raiz");
		
		jogo.inserir(1,0, 1,"2ºtoken","caminho1");//, jogo.procurar(0));
		jogo.inserir(2,0, 1,"2ºtoken","caminho2");//, jogo.procurar(0));
		jogo.inserir(3,0, 1,"2ºtoken","caminho3");//, jogo.procurar(0));
		
		jogo.inserir(4,1, 2,"Dead","O que fazer");//, jogo.procurar(1));
		jogo.inserir(5,1, 2,"Ola","Não sei o que fazer");//, jogo.procurar(1));
		jogo.inserir(6,1, 2,"Ok","Já sei o que fazer");//, jogo.procurar(1));
		
		jogo.inserir(7,2, 2,"2ºtoken","caminho1");//, jogo.procurar(2));
		jogo.inserir(8,2, 2,"2ºtoken","caminho2");//, jogo.procurar(2));
		jogo.inserir(9,2, 2,"2ºtoken","caminho3");//, jogo.procurar(2));

		jogo.inserir(10,3, 2,"3ºtoken","caminho1");//, jogo.procurar(3));
		jogo.inserir(11,3, 2,"3ºtoken","caminho2");//, jogo.procurar(3));
		jogo.inserir(12,3, 2,"3ºtoken","caminho3");//, jogo.procurar(3));
		
		jogo.inserir(13,4, 3,"Oi","O que fazer");//, jogo.procurar(4));
		jogo.inserir(14,4, 3,"Ola","Não sei o que fazer");//, jogo.procurar(4));
		jogo.inserir(15,4, 3,"Ok","Já sei o que fazer");//, jogo.procurar(4));
		
		jogo.inserir(16,5, 3,"Oi","O que fazer");//, jogo.procurar(5));
		jogo.inserir(17,5, 3,"Ola","Não sei o que fazer");//, jogo.procurar(5));
		jogo.inserir(18,5, 3,"Ok","Já sei o que fazer");//, jogo.procurar(5));

		jogo.inserir(19,6, 3,"Oi","O que fazer");//, jogo.procurar(6));
		jogo.inserir(20,6, 3,"Ola","Não sei o que fazer");//, jogo.procurar(6));
		jogo.inserir(21,6, 3,"Ok","Já sei o que fazer");//, jogo.procurar(6));
		
		jogo.inserir(22,7, 3,"Oi","O que fazer");//, jogo.procurar(7));
		jogo.inserir(23,7, 3,"Ola","Não sei o que fazer");//, jogo.procurar(7));
		jogo.inserir(24,7, 3,"Ok","Já sei o que fazer");//, jogo.procurar(7));
		
		jogo.inserir(25,8, 3,"Oi","O que fazer");//, jogo.procurar(8));
		jogo.inserir(26,8, 3,"Ola","Não sei o que fazer");//, jogo.procurar(8));
		jogo.inserir(27,8, 3,"Ok","Já sei o que fazer");//, jogo.procurar(8));

		jogo.inserir(28,9, 3,"Oi","O que fazer");//, jogo.procurar(9));
		jogo.inserir(29,9, 3,"Ola","Não sei o que fazer");//, jogo.procurar(9));
		jogo.inserir(30,9, 3,"Ok","Já sei o que fazer");//, jogo.procurar(9));
		
		jogo.inserir(31,10, 3,"Oi","O que fazer");//, jogo.procurar(10));
		jogo.inserir(32,10, 3,"Ola","Não sei o que fazer");//, jogo.procurar(10));
		jogo.inserir(33,10, 3,"Ok","Já sei o que fazer");//, jogo.procurar(10));
		
		jogo.inserir(34,11, 3,"Oi","O que fazer");//, jogo.procurar(11));
		jogo.inserir(35,11, 3,"Ola","Não sei o que fazer");//, jogo.procurar(11));
		jogo.inserir(36,11, 3,"Ok","Já sei o que fazer");//, jogo.procurar(11));

		jogo.inserir(37,12, 3,"Oi","O que fazer");//, jogo.procurar(12));
		jogo.inserir(38,12, 3,"Ola","Não sei o que fazer");//, jogo.procurar(12));
		jogo.inserir(39,12, 3,"Ok","Já sei o que fazer");//, jogo.procurar(12));		
		/*
		jogo.inserir(40,13, 4,"Oi","O que fazer");
		jogo.inserir(41,13, 4,"Ola","Não sei o que fazer");
		jogo.inserir(42,13, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(43,14, 4,"Oi","O que fazer");
		jogo.inserir(44,14, 4,"Ola","Não sei o que fazer");
		jogo.inserir(45,14, 4,"Ok","Já sei o que fazer");

		jogo.inserir(46,15, 4,"Oi","O que fazer");
		jogo.inserir(47,15, 4,"Ola","Não sei o que fazer");
		jogo.inserir(48,15, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(49,16, 4,"Oi","O que fazer");
		jogo.inserir(50,16, 4,"Ola","Não sei o que fazer");
		jogo.inserir(51,16, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(52,17, 4,"Oi","O que fazer");
		jogo.inserir(53,17, 4,"Ola","Não sei o que fazer");
		jogo.inserir(54,17, 4,"Ok","Já sei o que fazer");

		jogo.inserir(55,18, 4,"Oi","O que fazer");
		jogo.inserir(56,18, 4,"Ola","Não sei o que fazer");
		jogo.inserir(57,18, 4,"Ok","Já sei o que fazer");

		jogo.inserir(58,19, 4,"Oi","O que fazer");
		jogo.inserir(59,19, 4,"Ola","Não sei o que fazer");
		jogo.inserir(60,19, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(61,20, 4,"Oi","O que fazer");
		jogo.inserir(62,20, 4,"Ola","Não sei o que fazer");
		jogo.inserir(63,20, 4,"Ok","Já sei o que fazer");

		jogo.inserir(64,21, 4,"Oi","O que fazer");
		jogo.inserir(65,21, 4,"Ola","Não sei o que fazer");
		jogo.inserir(66,21, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(67,22, 4,"Oi","O que fazer");
		jogo.inserir(68,22, 4,"Ola","Não sei o que fazer");
		jogo.inserir(69,22, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(70,23, 4,"Oi","O que fazer");
		jogo.inserir(71,23, 4,"Ola","Não sei o que fazer");
		jogo.inserir(72,23, 4,"Ok","Já sei o que fazer");

		jogo.inserir(73,24, 4,"Oi","O que fazer");
		jogo.inserir(74,24, 4,"Ola","Não sei o que fazer");
		jogo.inserir(75,24, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(76,25, 4,"Oi","O que fazer");
		jogo.inserir(77,25, 4,"Ola","Não sei o que fazer");
		jogo.inserir(78,25, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(79,26, 4,"Oi","O que fazer");
		jogo.inserir(80,26, 4,"Ola","Não sei o que fazer");
		jogo.inserir(81,26, 4,"Ok","Já sei o que fazer");

		jogo.inserir(82,27, 4,"Oi","O que fazer");
		jogo.inserir(83,27, 4,"Ola","Não sei o que fazer");
		jogo.inserir(84,27, 4,"Ok","Já sei o que fazer");

		jogo.inserir(85,28, 4,"Oi","O que fazer");
		jogo.inserir(86,28, 4,"Ola","Não sei o que fazer");
		jogo.inserir(87,28, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(88,29, 4,"Oi","O que fazer");
		jogo.inserir(89,29, 4,"Ola","Não sei o que fazer");
		jogo.inserir(90,29, 4,"Ok","Já sei o que fazer");

		jogo.inserir(91,30, 4,"Oi","O que fazer");
		jogo.inserir(92,30, 4,"Ola","Não sei o que fazer");
		jogo.inserir(93,30, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(94,31, 4,"Oi","O que fazer");
		jogo.inserir(95,31, 4,"Ola","Não sei o que fazer");
		jogo.inserir(96,31, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(97,32, 4,"Oi","O que fazer");
		jogo.inserir(98,32, 4,"Ola","Não sei o que fazer");
		jogo.inserir(99,32, 4,"Ok","Já sei o que fazer");

		jogo.inserir(100,33, 4,"Oi","O que fazer");
		jogo.inserir(101,33, 4,"Ola","Não sei o que fazer");
		jogo.inserir(102,33, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(103,34, 4,"Oi","O que fazer");
		jogo.inserir(104,34, 4,"Ola","Não sei o que fazer");
		jogo.inserir(105,34, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(105,35, 4,"Oi","O que fazer");
		jogo.inserir(106,35, 4,"Ola","Não sei o que fazer");
		jogo.inserir(107,35, 4,"Ok","Já sei o que fazer");

		jogo.inserir(108,36, 4,"Oi","O que fazer");
		jogo.inserir(109,36, 4,"Ola","Não sei o que fazer");
		jogo.inserir(110,36, 4,"Ok","Já sei o que fazer");

		jogo.inserir(111,37, 4,"Oi","O que fazer");
		jogo.inserir(112,37, 4,"Ola","Não sei o que fazer");
		jogo.inserir(113,37, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(114,38, 4,"Oi","O que fazer");
		jogo.inserir(115,38, 4,"Ola","Não sei o que fazer");
		jogo.inserir(116,38, 4,"Ok","Já sei o que fazer");

		jogo.inserir(117,39, 4,"Oi","O que fazer");
		jogo.inserir(118,39, 4,"Ola","Não sei o que fazer");
		jogo.inserir(119,39, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(120,40, 4,"Oi","O que fazer");
		jogo.inserir(121,40, 4,"Ola","Não sei o que fazer");
		jogo.inserir(122,40, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(123,41, 4,"Oi","O que fazer");
		jogo.inserir(124,41, 4,"Ola","Não sei o que fazer");
		jogo.inserir(125,41, 4,"Ok","Já sei o que fazer");

		jogo.inserir(126,42, 4,"Oi","O que fazer");
		jogo.inserir(127,42, 4,"Ola","Não sei o que fazer");
		jogo.inserir(128,42, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(129,43, 4,"Oi","O que fazer");
		jogo.inserir(130,43, 4,"Ola","Não sei o que fazer");
		jogo.inserir(131,43, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(132,44, 4,"Oi","O que fazer");
		jogo.inserir(133,44, 4,"Ola","Não sei o que fazer");
		jogo.inserir(134,44, 4,"Ok","Já sei o que fazer");

		jogo.inserir(135,45, 4,"Oi","O que fazer");
		jogo.inserir(136,45, 4,"Ola","Não sei o que fazer");
		jogo.inserir(137,45, 4,"Ok","Já sei o que fazer");

		jogo.inserir(138,46, 4,"Oi","O que fazer");
		jogo.inserir(139,46, 4,"Ola","Não sei o que fazer");
		jogo.inserir(140,46, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(141,47, 4,"Oi","O que fazer");
		jogo.inserir(142,47, 4,"Ola","Não sei o que fazer");
		jogo.inserir(143,47, 4,"Ok","Já sei o que fazer");

		jogo.inserir(144,48, 4,"Oi","O que fazer");
		jogo.inserir(145,48, 4,"Ola","Não sei o que fazer");
		jogo.inserir(146,48, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(147,49, 4,"Oi","O que fazer");
		jogo.inserir(148,49, 4,"Ola","Não sei o que fazer");
		jogo.inserir(149,49, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(150,50, 4,"Oi","O que fazer");
		jogo.inserir(151,50, 4,"Ola","Não sei o que fazer");
		jogo.inserir(152,50, 4,"Ok","Já sei o que fazer");

		jogo.inserir(153,51, 4,"Oi","O que fazer");
		jogo.inserir(154,51, 4,"Ola","Não sei o que fazer");
		jogo.inserir(155,51, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(156,52, 4,"Oi","O que fazer");
		jogo.inserir(157,52, 4,"Ola","Não sei o que fazer");
		jogo.inserir(158,52, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(159,53, 4,"Oi","O que fazer");
		jogo.inserir(160,53, 4,"Ola","Não sei o que fazer");
		jogo.inserir(161,53, 4,"Ok","Já sei o que fazer");

		jogo.inserir(162,54, 4,"Oi","O que fazer");
		jogo.inserir(163,54, 4,"Ola","Não sei o que fazer");
		jogo.inserir(164,54, 4,"Ok","Já sei o que fazer");

		jogo.inserir(165,55, 4,"Oi","O que fazer");
		jogo.inserir(166,55, 4,"Ola","Não sei o que fazer");
		jogo.inserir(167,55, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(168,56, 4,"Oi","O que fazer");
		jogo.inserir(169,56, 4,"Ola","Não sei o que fazer");
		jogo.inserir(170,56, 4,"Ok","Já sei o que fazer");

		jogo.inserir(171,57, 4,"Oi","O que fazer");
		jogo.inserir(172,57, 4,"Ola","Não sei o que fazer");
		jogo.inserir(173,57, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(174,58, 4,"Oi","O que fazer");
		jogo.inserir(175,58, 4,"Ola","Não sei o que fazer");
		jogo.inserir(176,58, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(177,59, 4,"Oi","O que fazer");
		jogo.inserir(178,59, 4,"Ola","Não sei o que fazer");
		jogo.inserir(179,59, 4,"Ok","Já sei o que fazer");

		jogo.inserir(180,60, 4,"Oi","O que fazer");
		jogo.inserir(181,60, 4,"Ola","Não sei o que fazer");
		jogo.inserir(182,60, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(183,61, 4,"Oi","O que fazer");
		jogo.inserir(184,61, 4,"Ola","Não sei o que fazer");
		jogo.inserir(185,61, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(186,62, 4,"Oi","O que fazer");
		jogo.inserir(187,62, 4,"Ola","Não sei o que fazer");
		jogo.inserir(188,62, 4,"Ok","Já sei o que fazer");

		jogo.inserir(189,63, 4,"Oi","O que fazer");
		jogo.inserir(190,63, 4,"Ola","Não sei o que fazer");
		jogo.inserir(191,63, 4,"Ok","Já sei o que fazer");

		jogo.inserir(192,64, 4,"Oi","O que fazer");
		jogo.inserir(193,64, 4,"Ola","Não sei o que fazer");
		jogo.inserir(194,64, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(195,65, 4,"Oi","O que fazer");
		jogo.inserir(196,65, 4,"Ola","Não sei o que fazer");
		jogo.inserir(197,65, 4,"Ok","Já sei o que fazer");

		jogo.inserir(198,66, 4,"Oi","O que fazer");
		jogo.inserir(199,66, 4,"Ola","Não sei o que fazer");
		jogo.inserir(200,66, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(201,67, 4,"Oi","O que fazer");
		jogo.inserir(202,67, 4,"Ola","Não sei o que fazer");
		jogo.inserir(203,67, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(204,68, 4,"Oi","O que fazer");
		jogo.inserir(205,68, 4,"Ola","Não sei o que fazer");
		jogo.inserir(206,68, 4,"Ok","Já sei o que fazer");

		jogo.inserir(207,69, 4,"Oi","O que fazer");
		jogo.inserir(208,69, 4,"Ola","Não sei o que fazer");
		jogo.inserir(209,69, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(210,70, 4,"Oi","O que fazer");
		jogo.inserir(211,70, 4,"Ola","Não sei o que fazer");
		jogo.inserir(212,70, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(213,71, 4,"Oi","O que fazer");
		jogo.inserir(214,71, 4,"Ola","Não sei o que fazer");
		jogo.inserir(215,71, 4,"Ok","Já sei o que fazer");

		jogo.inserir(216,72, 4,"Oi","O que fazer");
		jogo.inserir(217,72, 4,"Ola","Não sei o que fazer");
		jogo.inserir(218,72, 4,"Ok","Já sei o que fazer");

		jogo.inserir(219,73, 4,"Oi","O que fazer");
		jogo.inserir(220,73, 4,"Ola","Não sei o que fazer");
		jogo.inserir(221,73, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(222,74, 4,"Oi","O que fazer");
		jogo.inserir(223,74, 4,"Ola","Não sei o que fazer");
		jogo.inserir(224,74, 4,"Ok","Já sei o que fazer");

		jogo.inserir(225,75, 4,"Oi","O que fazer");
		jogo.inserir(226,75, 4,"Ola","Não sei o que fazer");
		jogo.inserir(227,75, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(228,76, 4,"Oi","O que fazer");
		jogo.inserir(229,76, 4,"Ola","Não sei o que fazer");
		jogo.inserir(230,76, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(231,76, 4,"Oi","O que fazer");
		jogo.inserir(232,76, 4,"Ola","Não sei o que fazer");
		jogo.inserir(233,76, 4,"Ok","Já sei o que fazer");

		jogo.inserir(234,77, 4,"Oi","O que fazer");
		jogo.inserir(235,77, 4,"Ola","Não sei o que fazer");
		jogo.inserir(236,77, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(237,78, 4,"Oi","O que fazer");
		jogo.inserir(238,78, 4,"Ola","Não sei o que fazer");
		jogo.inserir(239,78, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(340,79, 4,"Oi","O que fazer");
		jogo.inserir(341,79, 4,"Ola","Não sei o que fazer");
		jogo.inserir(342,79, 4,"Ok","Já sei o que fazer");

		jogo.inserir(343,80, 4,"Oi","O que fazer");
		jogo.inserir(344,80, 4,"Ola","Não sei o que fazer");
		jogo.inserir(345,80, 4,"Ok","Já sei o que fazer");

		jogo.inserir(346,81, 4,"Oi","O que fazer");
		jogo.inserir(347,81, 4,"Ola","Não sei o que fazer");
		jogo.inserir(348,81, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(349,82, 4,"Oi","O que fazer");
		jogo.inserir(350,82, 4,"Ola","Não sei o que fazer");
		jogo.inserir(351,82, 4,"Ok","Já sei o que fazer");

		jogo.inserir(352,83, 4,"Oi","O que fazer");
		jogo.inserir(353,83, 4,"Ola","Não sei o que fazer");
		jogo.inserir(354,83, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(355,84, 4,"Oi","O que fazer");
		jogo.inserir(356,84, 4,"Ola","Não sei o que fazer");
		jogo.inserir(357,84, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(358,85, 4,"Oi","O que fazer");
		jogo.inserir(359,85, 4,"Ola","Não sei o que fazer");
		jogo.inserir(360,85, 4,"Ok","Já sei o que fazer");

		jogo.inserir(361,86, 4,"Oi","O que fazer");
		jogo.inserir(362,86, 4,"Ola","Não sei o que fazer");
		jogo.inserir(363,86, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(364,87, 4,"Oi","O que fazer");
		jogo.inserir(365,87, 4,"Ola","Não sei o que fazer");
		jogo.inserir(366,87, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(367,88, 4,"Oi","O que fazer");
		jogo.inserir(368,88, 4,"Ola","Não sei o que fazer");
		jogo.inserir(369,88, 4,"Ok","Já sei o que fazer");

		jogo.inserir(370,89, 4,"Oi","O que fazer");
		jogo.inserir(371,89, 4,"Ola","Não sei o que fazer");
		jogo.inserir(372,89, 4,"Ok","Já sei o que fazer");

		jogo.inserir(373,90, 4,"Oi","O que fazer");
		jogo.inserir(374,90, 4,"Ola","Não sei o que fazer");
		jogo.inserir(375,90, 4,"Ok","Já sei o que fazer");
		
		jogo.inserir(376,91, 4,"Oi","O que fazer");
		jogo.inserir(377,91, 4,"Ola","Não sei o que fazer");
		jogo.inserir(378,91, 4,"Ok","Já sei o que fazer");

		jogo.inserir(379,92, 4,"Oi","O que fazer");
		jogo.inserir(380,92, 4,"Ola","Não sei o que fazer");
		jogo.inserir(381,92, 4,"Ok","Já sei o que fazer");
		*/
		
		return jogo;
	}
	
}
