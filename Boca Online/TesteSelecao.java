

import java.util.Scanner;


public class TesteSelecao {

   
    public static void main(String[] args) {
        Scanner teclado =  new Scanner(System.in);
        
        int a,b,c,d, soma;
       
        System.out.println("Informe o valor para A: ");
        a = teclado.nextInt();
        
        System.out.println("Informe o valor para B: ");
        b = teclado.nextInt();
        
        System.out.println("Informe o valora para C: ");
        c = teclado.nextInt();
        
        System.out.println("Infotme o valor para D: ");
        d = teclado.nextInt();
        
        if (b>c && d >a && c+d> a+b && c>=0 && d>=0 && a %2 ==0 ) {
            System.out.println("Valores aceitos\n");
            
        }else 
            System.out.println("Valores não aceitos\n");
    }
    
}
