import java.util.Scanner;

public class AproveitamentoTime {

	public static void main(String[] args) {
		
		//Declaração das variaveis
		String nome;
		int totalPontos=0, jogos=0, pontos=0, vitorias=0,empates=0, derrotas=0;
		double aproveitamento=0;

		//Solicitação de entrada de dados.
		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite o nome do seu Time:");
		nome = teclado.next();

		System.out.println("Digite o numero de vitorias do time:");
		vitorias = teclado.nextInt();

		System.out.println("Digite o numero de empates do time");
		empates = teclado.nextInt();

		System.out.println("Digite o numero de derrotas do time");
		derrotas = teclado.nextInt();

		//Processamento
		jogos = vitorias + empates + derrotas;
		totalPontos = jogos*3;
		pontos = (vitorias*3) + empates;
		aproveitamento = (pontos*100) /totalPontos;

		System.out.printf("O time %.15s teve %3d pontos e %8.2f%% de aproveitamento", nome, pontos, aproveitamento);
	}

}