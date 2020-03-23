package pilha;


public class Pilha {
	
	private int tamanhoPilha;
	private Peca[] pecas;
	private int indice;
	
	public Pilha(int tamanhoPilha, Peca[] pecas, int indice){
		this.tamanhoPilha = tamanhoPilha;
		this.pecas = pecas;
		this.indice = indice;
	}
	public int getTamanhoPilha() {
		return tamanhoPilha;
	}
	public void setTamanhoPilha(int tamanhoPilha) {
		this.tamanhoPilha = tamanhoPilha;
	}
	public Peca[] getPecas() {
		return pecas;
	}
	public void setPecas(Peca[] pecas) {
		this.pecas = pecas;
	}
	
	public void push(Peca peca) {
		if((indice+1) == tamanhoPilha-1) {
			System.out.println(indice);	
			System.out.println("Pilha cheia");
			duplicaArray();
		}
		System.out.println(indice);
		pecas[indice] = peca; 
		indice++;

	}
	
	
	public void duplicaArray() {
		Peca[] novoArray = new Peca[tamanhoPilha*2];
		for(int i = 0; i<tamanhoPilha; i++) {
			novoArray[i] = pecas[i];
		}
		tamanhoPilha = tamanhoPilha*2;
		pecas = novoArray;
		System.out.println("Pilha duplicada!!!");
	}
	
	public void pop() {
		pecas[indice] = null;
		indice--;
		System.out.println("Removido");
	}
	
	public void listar() {
		for(int i = 0 ; i<= tamanhoPilha-1; i++) {
			if(pecas[i] == null) {
				System.out.println("VAZIO");
			}
			else {
				System.out.println(pecas[i].getNumero());
			}
		}
	}
	
	
	public int getIndice() {
		return indice;
	}
	public void setIndice(int indice) {
		this.indice = indice;
	}
	
}
