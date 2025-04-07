package screenmatchpoo;

public class Principal {
	public static void main(String[] args) {
		
		Filme meuFilme = new Filme();
		meuFilme.nome = "O poderoso chefão";
		meuFilme.anoDeLancamento = 1970;
		meuFilme.duracaoEmMinutos = 180;

		System.out.println(meuFilme.nome);
		System.out.println(meuFilme.anoDeLancamento);
		System.out.println(meuFilme.duracaoEmMinutos);
		
		meuFilme.exibeFichaTecnica();
		meuFilme.avalia(8);
		meuFilme.avalia(5);
		meuFilme.avalia(10);		
		
		System.out.println(meuFilme.somaDasAvaliacoes);
		System.out.println(meuFilme.totalDeAvaliacoes);
		System.out.println(meuFilme.pegaMedia());	
	}
}
