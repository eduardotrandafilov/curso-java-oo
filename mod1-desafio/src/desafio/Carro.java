package desafio;

public class Carro {
	String modelo;
	String cor;
	int ano;

	void exibirFichaTecnica() {
		System.out.println("Modelo " + modelo);
		System.out.println("Cor " + cor);
		System.out.println("Ano " + ano);
	}

	int calcularIdade() {
		return 2023 - ano;
	}

}
