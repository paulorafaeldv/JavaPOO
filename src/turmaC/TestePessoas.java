package turmaC;

public class TestePessoas {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		Pessoa p2 = new Pessoa();
		
		p1.nome = "Paulo";
		p1.idade = 26;
		
		p2.nome = "Ana";
		p2.idade = 19;
		
		p1.comer("Pipoca");
		p2.comer("Milho cozido");

	}

}
