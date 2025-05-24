import java.util.Scanner;

public class calculadora{

        public static void main (String[] args){


            //utilizei .equals pois é boa prática verificar a igualdade de Strings utilizando .equals, e não ==

                String opcao = "0";
                 while (opcao != "9"){
                    opcao = escolheOpcao();
        
                    if (opcao.equals("1")){
                        Adicao();
                } else if (opcao.equals("2")){
                        Subtracao();
                } else if (opcao.equals("3")){
                    Divisao();
                } else if (opcao.equals("4")){
                    Multiplicacao();
                } else if (opcao.equals("5")){
                    Modulo();
                } else if (opcao.equals("6")){
                    Exponenciacao(); 
                } else if (opcao.equals("9")){
                    System.out.println("Adeus...");
                        break;
                } else {
                    System.out.println("Opcão inválida...");
                }
            
           }
        }

    public static String escolheOpcao(){

        Scanner scan = new Scanner (System.in);

        System.out.println("\nQual operação deseja fazer?\n");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Divisão");
        System.out.println("4 - Multiplicação");
        System.out.println("5 - Módulo");
        System.out.println("6 - Exponenciação");
        System.out.println("\n9 - Sair");

        String operacao = scan.nextLine();

        return operacao;

    }

    public static int escolheNumero(){

        System.out.println("Digite um número");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();

        return num1;
        
    }
    
    public static void Adicao(){
        System.out.println("Informe-me dois números inteiros com os quais você gostaria de trabalhar. \nQual será o primeiro número?");
        Scanner scan = new Scanner(System.in);
        int num1 = scan.nextInt();
        System.out.println("E qual será o segundo número?");
        int num2 = scan.nextInt();
        System.out.println(num1 + num2);
    }

    public static void Subtracao(){
        int num1 = escolheNumero();
        System.out.println("E qual será o segundo número?");
        int num2 = escolheNumero();
        System.out.println(num1 - num2);
    }

    public static void Divisao(){
        int num1 = escolheNumero();
        System.out.println("E qual será o segundo número?");
        int num2 = escolheNumero();
        System.out.println(num1 / num2);
    }

    public static void Multiplicacao(){
        int num1 = escolheNumero();
        System.out.println("E qual será o segundo número?");
        int num2 = escolheNumero();
        System.out.println(num1 * num2);
    }

    public static void Modulo(){
        int num1 = escolheNumero();
        System.out.println("E qual será o segundo número?");
        int num2 = escolheNumero();
        System.out.println(num1 % num2);
    }

    public static void Exponenciacao(){
        int num1 = escolheNumero();
        System.out.println("E qual será o segundo número?");
        int num2 = escolheNumero();
        System.out.println(Math.pow(num1, num2));
    }


    }
