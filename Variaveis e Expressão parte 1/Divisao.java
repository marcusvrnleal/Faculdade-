import java.util.Scanner;

public class Divisao{
	public static void main(String[] args) {
		
		double dividendo, divisor, resto;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o numero para o dividendo: ");
		dividendo = teclado.nextDouble();

		System.out.println("Digite o numero para o divisor: ");
		divisor = teclado.nextDouble();
		resto=dividendo%divisor;

		System.out.println("O resto da divisao e: " + resto);
	}
}