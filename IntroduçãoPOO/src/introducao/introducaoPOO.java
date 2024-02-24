
package introducao;

import java.util.Scanner;

public class introducaoPOO {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
        int numero_1 = input.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        int numero_2 = input.nextInt();
        
        System.out.print("Digite o terceiro numero: ");
        int numero_3 = input.nextInt();
       
        if(numero_1 > numero_2 && numero_1 > numero_3 && numero_2 > numero_3){
            
            System.out.printf("Sequencia dos numeros: " + numero_1 +"," + numero_2 + "," + numero_3);
     
        } else if(numero_1 > numero_2 && numero_1 > numero_3 && numero_3 > numero_2){
            
            System.out.printf("Sequencia dos numeros: " + numero_1 +"," + numero_3 + "," + numero_2);
        
        } else if(numero_2 > numero_1 && numero_2 > numero_3 && numero_1 > numero_3){
            
            System.out.printf("Sequencia dos numeros: " + numero_2 +"," + numero_1 + "," + numero_3);
           
        } else if(numero_2 > numero_1 && numero_2 > numero_3 && numero_3 > numero_1){
           
            System.out.printf("Sequencia dos numeros: " + numero_2 +"," + numero_3 + "," + numero_1);
            
        } else if(numero_3 > numero_1 && numero_3 > numero_2 && numero_1 > numero_2){
            
            System.out.printf("Sequencia dos numeros: " + numero_3 +"," + numero_1 + "," + numero_2);
            
        } else if(numero_3 > numero_1 && numero_3 > numero_2 && numero_2 > numero_1){
            
            System.out.printf("Sequencia dos numeros: " + numero_3 +"," + numero_2 + "," + numero_1);
            
        }
    };
    
}
