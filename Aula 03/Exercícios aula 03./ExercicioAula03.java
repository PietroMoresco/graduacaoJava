/*1. Implemente um programa que solicita dois números ao usuário e exibe na tela:
a) A soma destes dois números
b) A subtração destes dois números
c) A multiplicação destes dois números
d) A divisão destes dois números
e) A divisão inteira destes dois números
f) O resto da divisão inteira destes dois números
g) A exponenciação destes dois números
h) O maior destes dois números
i) O menor destes dois números

2. Solicite um número ao usuário. Sendo este número uma temperatura em graus Celsius, 
faça um programa que converte esta temperatura para graus Fahrenheit e exibe o resultado na tela. 
Fahrenheit = Celsius * 1.8 + 32

3. Solicite um número ao usuário. Sendo este número uma temperatura em graus Fahrenheit, 
faça um programa que converte esta temperatura em graus Celsius e exibe o resultado na tela. 
Celsius = (Fahrenheit - 32) / 1.8

4. Implemente um programa que solicita um número ao usuário. Sendo este número uma velocidade em km/h, 
faça um programa para converter esta velocidade em m/s e exiba o resultado na tela.

5. Implemente um programa que solicita ao usuário o preço de um calçado e o percentual de desconto.
Em seguida, calcule o valor do desconto e o valor final a ser pago pelo calçado, mostrando os valores na tela

6.
Desenvolva um programa que solicite ao usuário a altura e a largura de um retângulo e e
xiba o perímetro e a área deste retângulo na tela.

7. Desenvolva um programa que solicite ao usuário a base e a altura de um triângulo 
e exiba o valor da área deste triângulo na tela.

8. Desenvolva um programa que solicite dois números ao usuário e que exiba 
o resultado do primeiro número elevado ao segundo, ou seja, potência.

9. Desenvolva um programa que solicite dois números ao usuário. Estes números são os catetos de 
um triângulo retângulo. Sendo assim, apresente ao usuário:
a) Hipotenusa
b) Perímetro
c) Área*/

import java.util.Scanner;

public class ExercicioAula03 {
public static void main(String[] args) {

    //EXERCÍCIO 01.

    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número");
    double primeiroNumero = scan.nextInt();
    System.out.println("Digite outro número");
    double segundoNumero = scan.nextInt();

    System.out.println("A soma destes dois números é igual a " + (primeiroNumero + segundoNumero));
    System.out.println("A substração destes dois números é igual a " + (primeiroNumero - segundoNumero));
    System.out.println("A multiplicação destes dois números é " + (primeiroNumero * segundoNumero));
    System.out.println("A divisão destes dois numeros é " + (primeiroNumero / segundoNumero));
    System.out.println("casting -> " + (int) primeiroNumero);
    System.out.println("A divisão inteira destes dois números é " + ((int) primeiroNumero) / (int) segundoNumero);
    System.out.println("O resto da divisão inteira destes dois números é " + ((int) primeiroNumero) % (int) segundoNumero);
    System.out.println("A exponenciação destes dois números é " + (Math.pow(primeiroNumero, segundoNumero)));
    System.out.println("O maior valor entre estes dois números é " + Math.max (primeiroNumero, segundoNumero));
    System.out.println("O menor valor entre estes dois números é " + Math.min (primeiroNumero, segundoNumero));

    // EXERCÍCIO 02.

    System.out.println("Em graus Celsius, qual a temperatura da sua cidade agora?");
    double temperaturaCelsius = scan.nextDouble();
    System.out.println("Esta temperatura em Farenheit é " + ((temperaturaCelsius * 1.8) + 32));

    // EXERCÍCIO 03.

    System.out.println("Em Farenheit, qual a temperatura da sua cidade agora?");
    double temperaturaFarenheit = scan.nextDouble();
    System.out.println("casting -> " + (int) temperaturaFarenheit);
    System.out.println("Essa temperatura em graus Celsius é " + ((((int) temperaturaFarenheit - 32) / 9) * 5));

    // EXERCÍCIO 04.

    System.out.println("Forneça-me uma velocidade em quilômetros por hora");
   double velocidade = scan.nextDouble();
   System.out.println("Essa velocidade em metros por segundo é " + (velocidade / 3.6));

   // EXERCÍCIO 05.

    System.out.println("Qual o preço do último calçado que você comprou?");
    double preçoCalcado = scan.nextDouble();
    System.out.println("E qual foi o percentual de desconto que você conseguiu?");
    double descontoCalcado = scan.nextDouble();
    System.out.println("O valor do desconto que vocês conseguiu foi de " + ((descontoCalcado * preçoCalcado) / 100) + (", portanto o valor final do calçado foi de ") + (preçoCalcado - ((descontoCalcado * preçoCalcado) / 100)));
    
    //EXERCÍCIO 06.

    System.out.println("Digamos que você tenha um retângulo. Qual a altura do seu retângulo?");
    double alturaRetangulo = scan.nextDouble();
    System.out.println("E qual é a largura da base desse retângulo?");
    double larguraDaBase = scan.nextDouble();
    System.out.println("O perímetro deste retângulo é " + ((alturaRetangulo * 2) + (larguraDaBase * 2)));
    System.out.println("A área deste retângulo é " + (larguraDaBase * alturaRetangulo));

    //EXERCÍCIO 07.

    System.out.println("Digamos que você tenha um triângulo. Qual é base desse triângulo?");
    double baseTriangulo = scan.nextDouble();
    System.out.println("E qual é a altura desse triângulo?");
    double alturaTriangulo = scan.nextDouble();
    System.out.println("A área desse triângulo é " + ((baseTriangulo * alturaTriangulo)/2));

    //EXERCÍCIO 08.

    System.out.println("Me dê um número inteiro");
    int primeiroNum = scan.nextInt();
    System.out.println("Agora me dê outro número");
    int segundoNum = scan.nextInt();
    System.out.println("O resultado de " + primeiroNum + " elevado a potência de " + segundoNum + " é igual a " + (Math.pow(primeiroNum, segundoNum)));

    //EXERCÍCIO 09.
    System.out.println("Digamos que você tem um triângulo-retângulo.");
    System.out.println("Qual é o valor do primeiro cateto?");
    double cateto01 = scan.nextDouble();
    System.out.println("Qual é o valor do segundo cateto?");
    double cateto02 = scan.nextDouble();
    System.out.println("A hipotenusa do seu triângulo-retângulo é " + (((cateto01 * cateto01) + (cateto02 * cateto02)) / ((cateto01 * cateto01) + (cateto02 * cateto02))));
    double hipotenusa = (((cateto01 * cateto01) + (cateto02 * cateto02)) / ((cateto01 * cateto01) + (cateto02 * cateto02)));
    System.out.println("O perímetro do seu triângulo-retângulo é " + (cateto01 + cateto02) + hipotenusa);
    System.out.println("A área do seu triângulo-retângulo é " + ((cateto01 * cateto02) * hipotenusa));

     //newEXERCÍCIO 09.
     System.out.println("Digamos que você tem um triângulo-retângulo.");
     System.out.println("Qual é o valor do primeiro cateto?");
     double newCateto01 = scan.nextDouble();
     System.out.println("Qual é o valor do segundo cateto?");
     double newCateto02 = scan.nextDouble();
     double cateto01Pow = (newCateto01 * newCateto01);
     double cateto02Pow = (newCateto02 * newCateto02);
     System.out.println("A hipotenusa do seu triângulo-retângulo é " + (cateto01Pow + cateto02Pow));
     System.out.println("O perímetro do seu triângulo-retângulo é " + (newCateto01 + newCateto02) + hipotenusa);
     System.out.println("A área do seu triângulo-retângulo é " + ((newCateto01 * newCateto02) * hipotenusa));


}
}

