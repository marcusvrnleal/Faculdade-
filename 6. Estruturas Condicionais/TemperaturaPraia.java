import java.util.Scanner;

public class TemperaturaPraia{
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        double tempAtual;

        System.out.println("Informe a Temperatura Atual: ");
        tempAtual =  teclado.nextDouble();
       
        if (tempAtual < 0) {
            System.out.println("Brrr! Está muito cogelando!");
            
        } else if (tempAtual >= 0 && tempAtual < 15) {
            System.out.println("Ainda está frio!");
        
        }else if (tempAtual >= 15 && tempAtual <= 25) {
            System.out.println("Está esquentando!");
            
        }else
            System.out.println("Tempo de ir para a praia!");
    }
}