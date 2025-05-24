/*1. Escreva um programa que leia a largura e a altura de um retângulo. Em seguida, crie um 
método chamado calculaArea que recebe ambos os valores como parâmetro, 
e retorna a área desse retângulo, a qual também deverá ser um número real. */

import java.util.Scanner;

public class Treino01{
    public static void main{
        Scanner scan = new Scanner(System.in);

        double largura = 0;
        double altura = 0;

        System.out.println("Vamos calcular a área de um retângulo");
        System.out.println("Digite a largura do seu retângulo");
        largura = scan.nextDouble();
        System.out.println("Digite a altura do seu retângulo");
        altura = scan.nextDouble();

        System.out.println("A área do seu retângulo é " + calculaArea(largura, altura));

    }

    public static double calculaArea(double largura, double altura){

        double area = 0;

        area = (largura * altura);

        return = area;

    }


}