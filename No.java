package arvoreAVL;


//Essa Classe cria os nós
public class No {
	public int valor;
	public No pai;
	public No esquerda;
	public No direita;
	public int altura; //pode ser removido

	
	//Construtores 

	
	public No(int x) { //valor
		pai = null;
		direita = null;
		esquerda = null;
		altura = 0;
		valor = x;
	}
}
