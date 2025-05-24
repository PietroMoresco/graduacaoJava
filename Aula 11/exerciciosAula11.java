/*Escreva um programa que leia o peso (em kg, ou seja, double) e a altura (em metros, ou seja, double também)
de uma pessoa, calcule o Índice de Massa Corporal (IMC) numa função chamada calculaIMC e retorne esse valor.
Exemplo do que sua função main deve solicitar:
Digite seu peso (kg): 70
Digite sua altura (m): 1.75*/

import java.util.Scanner;

public class exerciciosAula11{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

    double altura = 0;
    double peso = 0;

    System.out.println("Vamos calcular o seu IMC");
    System.out.println("Quantos quilos você pesa?");
    peso = scan.nextDouble();
    System.out.println("Qual é a sua altura?");
    altura = scan.nextDouble();

    System.out.println("O seu IMC é " + calculaIMC(altura, peso));

}
    public static double calculaIMC(double altura, double peso){

        double IMC = 0;

        IMC = (peso / (altura * altura));

        return IMC;

    }

}