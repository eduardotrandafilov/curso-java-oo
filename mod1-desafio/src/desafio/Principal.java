package desafio;

public class Principal {
	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		pessoa.saudacao();

		Calculadora calculadora = new Calculadora();
		int resultado = calculadora.dobrarNumero(10);
		System.out.println(resultado);

		Musica musica = new Musica();
		musica.titulo = "Hip hop";
		musica.artista = "Joao";
		musica.anoLancamento = 1990;

		musica.exibeFichaTecnica();
		
		musica.avalia(10);
		musica.avalia(20);
		
		double mediaAvaliacoes = musica.pegaMedia();
		System.out.println("Media avaliacao" + mediaAvaliacoes);

		Carro carro = new Carro();
		carro.modelo = "ford";
		carro.cor = "azul";
		carro.ano = 1980;

		carro.exibirFichaTecnica();
		int idade = carro.calcularIdade();
		System.out.println("Idade do carro"+idade);

		Aluno aluno = new Aluno();
		aluno.nome = "Eduardo";
		aluno.idade = 20;
		
		aluno.exibirInformações();
	}
}
