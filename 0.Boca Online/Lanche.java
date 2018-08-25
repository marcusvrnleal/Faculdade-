

import java.util.Scanner;


public class Lanche {

    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       
       int x, y;
       double preco = 0;
       
        System.out.println("Informe o seu pedido: ");
        x = teclado.nextInt();
        y =  teclado.nextInt();
        
        if (x == 1) {
            preco = (double) (5.00*y);
            
        }else if (x == 2) {
            preco = (double)(4.50*y);
            
        }else if (x == 3) {
            preco = (double)(5.00*y);
            
        }else if (x == 4) {
            preco = (double)(2.00*y);
            
        }else if (x == 5) {
            preco = (double)(1.50*y);
            
        }
        System.out.printf("Total: R$ %.2f\n" , preco);
    }
    
    
}
