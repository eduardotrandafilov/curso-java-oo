package desafio;

public class Principal {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		pessoa.exibeMsg();
		
		Calculadora calc = new Calculadora();
		System.out.println(calc.retornaDobro(10));
		
		Musica musica = new Musica();
		musica.titulo =  "Hip hop";
		musica.artista = "Joao";
		musica.anoLancamento = 1990;
		
		musica.exibeFichaTecnica();
		musica.avaliar(10);
		musica.avaliar(20);
		System.out.println("Media avaliacao" +musica.calcularMediaAvaliacao());
			
		Carro carro = new Carro();
		carro.modelo = "ford";
		carro.cor = "azul";
		carro.ano = 1980;
		
		carro.exibirFichaTecnica();
	}
}
