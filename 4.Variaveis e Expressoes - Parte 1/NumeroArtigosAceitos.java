import java.util.Scanner;

public class NumeroArtigosAceitos{

	public static void main(String[] args) {
	
	double taxaAceitacao;
	int numeroSubmetidos, totalAceitos, NUMERICO;

	Scanner teclado = new Scanner(System.in);		
	
	System.out.println("Digite o número de artigos submetidos");
	numeroSubmetidos = teclado.nextInt();
	
	System.out.println(" a taxa de aceitação desta conferência");
	taxaAceitacao = teclado.nextDouble();
	totalAceitos= (int)taxaAceitacao * numeroSubmetidos;

	System.out.println("O número de artigos é de " + totalAceitos);

	}

}