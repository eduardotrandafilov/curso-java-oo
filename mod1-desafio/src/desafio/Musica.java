package desafio;

public class Musica {
	String titulo;
	String artista;
	int anoLancamento;
	double somaDasAvaliacoes;
	int numAvaliacoes;

	void exibeFichaTecnica() {
		System.out.println("Titulo " + titulo);
		System.out.println("Artista " + artista);
		System.out.println("AnoLancamento " + anoLancamento);
	}

	void avalia(double nota) {
		somaDasAvaliacoes += nota;
		numAvaliacoes++;
	}

	double pegaMedia() {
		return somaDasAvaliacoes / numAvaliacoes;
	}
}
