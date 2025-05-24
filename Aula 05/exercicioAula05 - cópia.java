/* ENUNCIADO:
 * Conjectura de Collatz:
1) Peça do usuário um número inteiro.
2) Aplique as fórmulas da conjectura até que o número seja 1.
Se o número for par, divida por 2
Se o número for ímpar, multiplique-o por 3 e some 1
Imprima todos os passos
Só pare o programa quando o resultado der 1 */

import java.util.Scanner;

public class exercicioAula05{
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);

        System.out.println("Digite um número inteiro para ser calculado pelo diagrama de Collatz: ");
        int i = scan.nextInt();
        System.out.println("\n");

        while (i !=1) 
        if (i % 2 == 0){
        System.out.print((i / 2) + " --> ");
        i = (i / 2);
        } else if (true) {
        System.out.print(((i * 3) + 1) + " --> ");
        i = ((i * 3) + 1);
        
        } 
        
    }
}
