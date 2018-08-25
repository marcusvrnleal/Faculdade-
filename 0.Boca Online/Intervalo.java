
import java.util.Scanner;

public class Intervalo {

    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double intervalo;
        
        System.out.println("Digita um valoir para intervalo: ");
        intervalo = teclado.nextDouble();
        
        if (intervalo >= 0 && intervalo < 25) {
            System.out.printf("Intervalo [0,25]\n");
            
        }else if (intervalo >= 25 && intervalo < 50) {
            System.out.printf("Intervalo (25,50]\n");
        
        } else if (intervalo >= 50 && intervalo < 75) {
            System.out.printf("Intervalo (50,75]\n");
            
        
        }else if (intervalo >= 75 && intervalo <= 100) {
            System.out.printf("Intervalo (75,100]\n");
            
        
        }else {
            System.out.printf("Fora de Intervalo\n");
        }
                
    }
    
}
