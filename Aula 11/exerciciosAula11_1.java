    /*  EX. 01
ENUNCIADO: Escreva um programa que leia a largura e a altura de um retângulo. 
Em seguida, crie um método chamado calculaArea que recebe ambos os valores como parâmetro, 
e retorna a área desse retângulo, a qual também deverá ser um número real.
*/

import java.util.Scanner;

public class exerciciosAula11_1{

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

//asoudhasjfhdjkfh

    double altura = 0;
    double largura = 0;
    
    System.out.println("Vamos calcular a área de um retângulo");
    System.out.println("Qual é a altura desse retângulo?");
    altura = scan.nextDouble();
    System.out.println("E qual é a largura deste retângulo?");
    largura = scan.nextDouble();

    double area = calculaArea(altura, largura);

    System.out.println("A área do retângulo é " + area);

}

public static double calculaArea(double altura, double largura){

    double areaRetangulo = 0;

    areaRetangulo = (altura * largura);

    return areaRetangulo;
}
    }