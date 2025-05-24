import java.util.Scanner;

public class exercicioAula03 {
public static void example() {
    double numExample1 = 4.5;
    System.out.println("exemplo de casting: " + (int) numExample1); // output 4
    System.out.println("numExample: " + numExample1); // output 4.5

    System.out.println("\n\n\n");

    double numExample2 = 4.5;
    // atribui novo valor à variável
    numExample2 = (int) numExample2;
    System.out.println("numExample: " + numExample2); // output 4


}

public static void main(String[] args) {
//example();

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número");
    double primeiroNumero = scan.nextInt();
    System.out.println("Digite outro número");
    double segundoNumero = scan.nextInt();

    /*
     * exemplo
     */

    double numExample = 4.5;
    System.out.println("exemplo de casting: " + (int) numExample);
    System.out.println("numExample: " + numExample);


    System.out.println("A soma destes dois números é igual a " + (primeiroNumero + segundoNumero));
    System.out.println("A substração destes dois números é igual a " + (primeiroNumero - segundoNumero));
    System.out.println("A multiplicação destes dois números é " + (primeiroNumero * segundoNumero));
    System.out.println("A divisão destes dois numeros é " + (primeiroNumero / segundoNumero));
    System.out.println("casting -> " + (int) primeiroNumero);
    // System.out.println("casting -> (int) segundoNumero)
    // System.out.println("A divisão inteira destes dois números é igual a " ((int) primeiroNumero / (int) segundoNumero);

    System.out.println("A divisão inteira destes dois números é " + ((int) primeiroNumero) / (int) segundoNumero);
    System.out.println("O resto da divisão inteira destes dois números é " + ((int) primeiroNumero) % (int) segundoNumero);
    System.out.println("A exponenciação destes dois números é " + (Math.pow(primeiroNumero, segundoNumero)));
    System.out.println("O maior valor entre estes dois números é " + Math.max (primeiroNumero, segundoNumero));
    System.out.println("O menor valor entre estes dois números é " + Math.min (primeiroNumero, segundoNumero));












    



}
}

/*
1. Implemente um programa que solicita dois números ao usuário e exibe na tela:
a) A soma destes dois números
b) A subtração destes dois números
c) A multiplicação destes dois números
d) A divisão destes dois números
e) A divisão inteira destes dois números
f) O resto da divisão inteira destes dois números
g) A exponenciação destes dois números
h) O maior destes dois números
i) O menor destes dois números
* */