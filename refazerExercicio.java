/*3. ENINCUADO:
Escreva um programa que leia o peso (em kg, ou seja, double) e a altura (em metros, 
ou seja, double também) de uma pessoa, calcule o Índice de Massa Corporal (IMC) numa função 
chamada calculaIMC e retorne esse valor.

Exemplo do que sua função main deve solicitar:
Digite seu peso (kg): 70
Digite sua altura (m): 1.75*/

import java.util.Scanner;

public class refazerExercicio{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double altura = 0;
        double peso = 0;

        System.out.println("Vamos calcular o IMC da sua mãe");
        System.out.println("Digite a altura");
        altura = scan.nextDouble();
        System.out.println("Digite o peso");
        peso = scan.nextDouble();

        System.out.println("O IMC da sua mãe é de " + calculaIMC(altura, peso));

        System.out.println("Agora vamos mudar um pouco as coisas, apenas porque eu gosto de calcular coisas");
        System.out.println("Digamos que você tenha um retângulo tridimensional, qual será a área desse retângulo?");

        double alturaRetangulo = 0;
        double larguraRetangulo = 0;

        System.out.println("Digite a altura desse retângulo");
        alturaRetangulo = scan.nextDouble();
        System.out.println("Digite a largura desse retângulo");
        larguraRetangulo = scan.nextDouble();

        System.out.println("A área deste retângulo é de " + calculaArea(alturaRetangulo, larguraRetangulo));

        
    }

        public static Double calculaIMC(double altura, double peso){

            double IMC = 0;

            IMC = (peso / (altura * altura));

            return IMC;

        }

        public static Double calculaArea(double altura, double largura){

            double area = 0;

            area = (altura * largura);
    
            return area;

        }

      
}