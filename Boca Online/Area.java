import java.util.Scanner;

public class Area {

   
    public static final double pi = 3.14159; 
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        double a, b, c, triangulo, circulo, trapezio, quadrado, retangulo;
        
        System.out.println("Digite o valor para A: ");
        a = teclado.nextDouble();
        
        System.out.println("Digite o valor para B: ");
        b = teclado.nextDouble();
        
        System.out.println("Digite o valor para C: ");
        c = teclado.nextDouble();
        
        System.out.printf("TRIANGULO: %.3f\n" , triangulo = (a*c)/2);
        
        System.out.printf("CIRCULO: %.3f\n" , circulo = pi*c*c);
        
        System.out.printf("TRAPEZIO: %.3f\n" , trapezio = ((a+b)/2)* c);
        
        System.out.printf("QUADRADO: %.3f\n" , quadrado = b*b);
        
        System.out.printf("RETANGULO: %.3f\n" , retangulo = a*b);
    }
    
}
