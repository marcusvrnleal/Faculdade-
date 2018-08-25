import java.util.Scanner;

public class Bebidas {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int idade;
		String escolhaBebida = "";
		
		System.out.println("Informe a sua idade: ");
		idade = teclado.nextInt();

		if (idade <18) {
			System.out.println("Menor não pode comprar bebidas");
			
		}else if (idade >= 18) {
			System.out.println("Escolha uma bebida da Lista: \n-Cerveja \n-Whisky \n-Vodka \n-Caipirinha \n-Tequila");
			escolhaBebida = teclado.next();
		}
		
		if (escolhaBebida.equalsIgnoreCase("Cerveja")) {
			System.out.println("Você escolheu uma, " + escolhaBebida);
			
		}else if (escolhaBebida.equalsIgnoreCase("Whisky")) {
			System.out.println("Você escolheu uma " + escolhaBebida);
		
		}else if (escolhaBebida.equalsIgnoreCase("Vodka")) {
			System.out.println("Você escolheu uma, " + escolhaBebida);
		
		}else if (escolhaBebida.equalsIgnoreCase("Caipirinha")) {
			System.out.println("Você escolheu uma, " + escolhaBebida);
			
		}else if (escolhaBebida.equalsIgnoreCase("Tequila")) {
			System.out.println("Você escolheu uma, " + escolhaBebida);
			
		}else
		System.out.println("Não temos sua bebida!");
	}
}