package curso.alura;

public class Principal {
	public static void main(String[] args) {

		 Venda venda1 = new Venda();
		venda1.produto = "Camiseta";
		venda1.quantidade = 2;
		venda1.valorUnitario = 25.50;

		System.out.println("Valor total da venda: " + venda1.quantidade * venda1.valorUnitario);

		
		Pessoa pessoa1 = new Pessoa();
		
		pessoa1.nome = "Anna";
		pessoa1.idade = 20;
		
		System.out.println(pessoa1.nome +" tem "+pessoa1.idade + " anos");
		
		pessoa1.fazAniversario();
		System.out.println("A idade agora é: " +pessoa1.idade);
		
		Pessoa pessoa2 = new Pessoa();

		pessoa2.nome = "Carlos";
		pessoa2.idade = 20;

		System.out.println(pessoa2.nome + " tem " + pessoa2.idade + " anos");

		pessoa2.fazAniversario();

		System.out.println("A idade agora é: " +pessoa2.idade);
		
		
		
	}
}
