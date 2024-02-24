
package atividade3;

import java.util.Scanner;

/**
 *
 * @author unifrcosta
 */
public class atividade3 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Quantos integrantes tem na banda: ");
        int qtd = input.nextInt();
        
        int guitarra = 0;
        int bateria = 0;
        int violino = 0;
        int outros = 0;
        
        for (int cont = 0;cont < qtd;cont++){
            
            System.out.println("1-Guitarra\n2-bateria\n3-violino\n4-Outros Instrumentos");
            System.out.print("\nQual instrumento o musico toca?");
            
            int inst = input.nextInt();
            
            if (inst == 1){
                guitarra += 1;
            } else if (inst == 2){
                bateria += 1;
            } else if (inst == 3){
                violino += 1;
            } else if (inst == 4){
                outros += 1;
            } else {
                System.out.println("Opção incorreta");
                return;
            }
            
        System.out.printf("Guitarristas: %d\n" , guitarra);
        System.out.printf("Bateristas: %d\n" , bateria);
        System.out.printf("Violonistas: %d\n" , violino);
        System.out.printf("Outros instrumentos: %d\n" , outros);
        }
    }
}
