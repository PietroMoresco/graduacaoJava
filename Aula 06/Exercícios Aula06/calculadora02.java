import java.util.Scanner;

public class calculadora02(){


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

        public static String escolheOpcao(){
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
        Scanner scan = new Scanner(System.in);
                System.out.println("Digite o primeiro número");
                int num1 = escolheNumero();
                System.out.println("Digite o segundo número");
                int num2 = escolheNumero();
                System.out.println("Soma: " + (num1 + num2));
        }

        public static void Subtracao(){
        Scanner scan = new Scanner(System.in);
                System.out.println("Digite o primeiro número");
                int num1 = escolheNumero();
                System.out.println("Digite o segundo número");
                int num2 = escolheNumero();
                System.out.println("Substração: " + (num1 - num2));

        }

        public static void Divisao(){
        Scanner scan = new Scanner(System.in);
                System.out.println("Digite o primeiro número");
                int num1 = escolheNumero();
                System.out.println("Digite o segundo número");
                int num2 = escolheNumero();
                System.out.println("Divisão: " + (num1 / num2));

        }

        public static void Multiplicacao(){
        Scanner scan = new Scanner(System.in);
                System.out.println("Digite o primeiro número");
                int num1 = escolheNumero();
                System.out.println("Digite o segundo número");
                int num2 = escolheNumero();
                System.out.println("Multiplicação: " + (num1 * num2));

        }

        public static void Modulo(){
        Scanner scan = new Scanner(System.in);
                System.out.println("Digite o primeiro número");
                int num1 = escolheNumero();
                System.out.println("Digite o segundo número");
                int num2 = escolheNumero();
                System.out.println("Multiplicação: " + (num1 * num2));

        }

        public static void Exponenciacao(){
        Scanner scan = new Scanner(System.in);
                System.out.println("Digite o primeiro número");
                int num1 = escolheNumero();
                System.out.println("Digite o segundo número");
                int num2 = escolheNumero();
                System.out.println("Multiplicação: " + (num1 * num2));

        }


        public static int escolheNumero(){
 Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        return num; 

        }
       
}



 



