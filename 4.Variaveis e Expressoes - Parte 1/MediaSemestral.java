import java.util.Scanner;

public class MediaSemestral {

	public static void main(String[] args) {
		double p1, p2, p3, mp, tp, a1, mf;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Digite a nota da Primeira Prova: ");
		p1 = teclado.nextDouble();

		System.out.println("Digite a nota da Segunda Prova: ");
		p2 = teclado.nextDouble();

		System.out.println("Digite a nota da Terceira Prova: ");
		p3 = teclado.nextDouble();
		mp = (2 * p1 + 2 * p2 + 3 * p3) / 7;

		System.out.println("Digite a nota do Trabalho Partico");
		tp = teclado.nextDouble();

		System.out.println("Digite a nota da Atividade 1");
		a1 = teclado.nextDouble();

		mf = 0.6 * mp + 0.2 * tp + 0.2 * a1;
		System.out.println("O calculo da media semestral eh: \n" + mf);
	} 
}