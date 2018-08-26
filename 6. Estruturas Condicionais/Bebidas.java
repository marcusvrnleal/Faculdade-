import java.util.Scanner;

public class Bebidas {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int idade;
        String bebida = " ";

        System.out.println("Informe sua idade: ");
        idade = teclado.nextInt();

        if (idade >= 18) {
            System.out.println("Escolhe a sua bebida na Lista:\n-Cerveja \n-Whisky \n-Vodka \n-Caipirinha \n-Tequila");
            bebida = teclado.next();   
       
        }else if (idade < 18) {
            System.out.println("Menor não pode comprar bebida alcoólica");
        }
        
        if (bebida.equalsIgnoreCase("Cerveja")) {
            System.out.println("Sua escolha foi uma, " + bebida);

        }else if (bebida.equalsIgnoreCase("Whisky")) {
                System.out.println("Sua escolha foi um, " + bebida);
       
        }else if (bebida.equalsIgnoreCase("Vodka")) {
            System.out.println("Sua escolha foi uma, "+ bebida);
       
        }else if (bebida.equalsIgnoreCase("Caipirinha")) {
            System.out.println("Sua escolha foi uma, " + bebida);
            
        }else if (bebida.equalsIgnoreCase("Tequila")) {
            System.out.println("Sua escolha foi uma, " + bebida);
            
        }else if (bebida.equalsIgnoreCase("Bebida Invalida!")) {
            System.out.println("Desculpe não temos sua bebida!");
            
        }
    }

}