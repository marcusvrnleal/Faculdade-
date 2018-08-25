import java.util.Scanner;

public class Temperaturas{
	public static void main(String[] args) {
		
		double temperatura;
		 Scanner teclado = new Scanner(System.in);

		 System.out.println("Informe a temperatura atual em Celsus:");
		temperatura = teclado.nextDouble();

		if (temperatura <0) {
			System.out.println("Brrr! EStá cogelando!");
		
		}else if (temperatura >= 0 && temperatura < 15) {
			System.out.println("Ainda está frio!");
			
		}else if (temperatura >= 15 && temperatura < 25) {
			System.out.println("Está esquentando!");
			
		}else if (temperatura >= 25)
			System.out.println("Tempo de ir para a praia!");
	}
}