package metodos;

public class Calculadora {
	public static void main(String[] args) {
		CalcularMetodos teste1 = new CalcularMetodos();
		System.out.println(teste1.somar(1, 3));
		System.out.println(teste1.somar(1, 2, 3));
		System.out.println(teste1.subtrair(1, 2));
		System.out.println(teste1.mult(1, 2));
		System.out.println(teste1.dividir(1, 2));
	}

}
