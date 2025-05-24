/* ENUNCIADO
 Utilize o menu visto em aula para solicitar ao user qual
a opcao de operacao deseja fazer. Exemplo:
1 - Adicao
2 - Subtracao
3 - Multiplicacao
4 - Divisao
5 - Modulo (imprime qual o resto da divisão)
6 - Exponenciacao (primeiro num elevado ao segundo)
9 - Sair

Implemente cada uma das funções, e dentro delas solicite
que o usuário digite 2 números inteiros para que a operação possa 
ser realizada.
*/

import java.util.Scanner;

public class exemploDoExDeAula(){

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String opcao = "0";
        while (opcao != "9"){
            opcao = escolheOpcao();

            if (opcao.equals("1")){
                Adicao();
        }   else if (opcao.equals("2")){
                Subtracao();
        }   else if (opcao.equals("3")){
                Multiplicacao();
        }   else if (opcao.equals("4")){
                Divisao();
        }   else if (opcao.equals("5")){
                Modulo();
        }   else if (opcao.equals("6")){

        }   else if (opcao.equals("9")){
                System.out.println("Saindo do programa...");
                break;
        }   else {
            System.out.println("Opção inválida...");
        }

        }

        }


}


        public static String escolheOpcao{
            Scanner scan = new Scanner(System.in);
            System.out.println("Qual operação deseja realizar?\n");
            System.out.println("1 - Adição");
            System.out.println("2 - Subtração");
            System.out.println("3 - Divisão");
            System.out.println("4 - Multiplicacao");
            System.out.println("5 - Modulo (imprime qual o resto da divisão");
            System.out.println("6 - Exponenciacao (primeiro num elevado ao segundo");
            System.out.println("\n9 - Sair");

            String opcao = scan.nextLine();

            return opcao;


        }

        public static void Adicao(){
            System.out.println("Digite o primeiro número");
            int num1 = escolheNumero();
            System.out.println("Digite o segundo número");
            int num2 = escolheNumero();
            System.out.println("Soma: " (num1 + num2));
        }

        public static void Subtracao(){

        }

        public static void Divisao(){

        }

        public static void Multiplicacao(){

        }

        public static void Modulo(){

        }

        public static void Exponenciacao(){

        }

        public static int pedeNumeros(){

        }

        public static int escolheNumero();
        int num = scan.nextInt();

        return num

