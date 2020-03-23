package pilha;

import java.util.*;




public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Programa da pilha iniciado! \n ");
		System.out.println("Digite o tamanho da sua pilha!");
		int tamanhoPilha = input.nextInt();
		Peca[] pecas = new Peca[tamanhoPilha];
		Pilha pilha = new Pilha(tamanhoPilha, pecas, 0);
		
		pilha.setIndice(0);
		while(true) {
			System.out.println("Digite a função que deseja realizar! \n");
			System.out.println("Digite [1] para realizar a inclusão");
			System.out.println("Digite [2] para realizar a retirada");		
			System.out.println("Digite [3] para realizar a listagem");

			int entrada = input.nextInt();

			if(entrada == 1) {
				System.out.println("Digite o valor da peça!");
				int valor = input.nextInt();
				Peca peca = new Peca();
				peca.setNumero(valor);
				pilha.push(peca);
				System.out.println(pilha.getIndice());
			}
			
			if(entrada == 2) {
				pilha.pop();
			}
			if(entrada == 3) {
				pilha.listar();
			}
		}
	}

}
