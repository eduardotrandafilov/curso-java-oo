package desafio;

public class Musica {
	String titulo;
	String artista;
	int anoLancamento;
	double avaliacao;
	int numAvaliacoes;
	
	void exibeFichaTecnica() {
		System.out.println("Titulo "+titulo);
		System.out.println("Artista "+artista);
		System.out.println("AnoLancamento "+anoLancamento);
	}

	void avaliar(double nota) {
		avaliacao += nota;
		numAvaliacoes++;
	}
	
	double calcularMediaAvaliacao() {
		return avaliacao/numAvaliacoes;
	}
}
