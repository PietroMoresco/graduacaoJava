import java.util.Scanner;

public class Hello{
    public static void main(String [] args){

        System.out.println("Hello");
        Scanner scan = new Scanner(System.in);

        //Questão 1.

        double largura = 0;
        double altura = 0;

        System.out.println("Vamos calcular a área de um retângulo");
        System.out.println("Digite a largura do seu retângulo");
        largura = scan.nextDouble();
        System.out.println("Digite a altura do seu retângulo");
        altura = scan.nextDouble();

        System.out.println("A área do seu retângulo é " + calculaArea(largura, altura));

        //Questão 3.

        System.out.println("Ótimo, agora vamos calcular o seu IMC");

        double alturaPessoa = 0;
        double pesoPessoa = 0;

        System.out.println("Digite a sua altura");
        alturaPessoa = scan.nextDouble();
        System.out.println("Agora digite o seu peso");
        pesoPessoa = scan.nextDouble();

        System.out.println("Seu IMC é de " + calculaIMC(alturaPessoa, pesoPessoa));
        System.out.println("\n");
        System.out.println("Legal, agora você aprendeu a calcular e está fazendo programas. Tenho muito orgulho de você");
        System.out.println("\n");

        /*Questão 2. 
        Crie um programa, chamada ehMultiplo, que leia dois números inteiros e verifique 
        se o primeiro é múltiplo do segundo.
        Crie um método que receba os dois números como parâmetros e retorne true se 
        o primeiro for múltiplo do segundo, ou false caso contrário.

        Exemplo do que sua função main deve solicitar:
        Digite o primeiro número: 12
        Digite o segundo número: 4 */

        System.out.println("Me diga dois números inteiros e te direi se o primiero é múltiplo do segundo");
        System.out.println("Qual será o primeiro número?");
        int primeiroNumero = scan.nextInt();
        System.out.println("E qual será o segundo número?");
        int segundoNumero = scan.nextInt();

        if (ehMultiplo(primeiroNumero, segundoNumero)== true) {
            System.out.println("O número é múltiplo!");
        }
        else {
            System.out.println("O número não é múltiplo");
        }

        //Questão 4

        //Questão 5
        /*Escreva um programa que leia um valor inteiro N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.
         * Entrada: O arquivo de entrada contém um número interio positivo N
         * Saída: Imprima a saída conforme o exemplo fornecido
         */



    }

        public static double calculaArea(double largura, double altura){

        double area = 0;

        area = (largura * altura);

        return area;
        }

        public static double calculaIMC(double alturaPessoa, double pesoPessoa){

            double IMC = 0;

            IMC = (pesoPessoa * (Math.pow(alturaPessoa, 2)));

            return IMC;


        }

        public static boolean ehMultiplo(int primeiroNumero, int segundoNumero){
            // return (n1 % n2) == 0;

            // OU

            // if (n1 % n2) == 0
            //    return true;
            // else
            //        return false;
        
        boolean ehMultiplo = false;

        if (primeiroNumero % segundoNumero == 0) {
            ehMultiplo = true;
        } else {
            ehMultiplo = false;
        }
        
       return ehMultiplo;

    }


}