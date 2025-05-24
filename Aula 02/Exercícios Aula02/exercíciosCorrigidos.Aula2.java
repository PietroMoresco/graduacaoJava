import java.util.Scanner;

public class Aua02_exe {

    public static void main(String[] args) {
        // 1) Solicite ao usuário o dia, mês e ano do seu nascimento, 
        //    e depois imprima em tela a data no formato dd/mm/aaaa.
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o dia do seu nascimento: ");
        int dia = scan.nextInt();
        
        System.out.println("Digite o mês do seu nascimento: ");
        int mes = scan.nextInt();
        
        System.out.println("Digite o ano do seu nascimento: ");
        int ano = scan.nextInt();
        
        System.out.println("Resposta exe1: " + dia + "/" + mes + "/" + ano);
        System.out.println("--------------------------------------------------\n\n");
    
        // 2) Solicite ao usuário que informe um número fracionário e o imprima como um número inteiro 
        //     (sem ponto decimal).
        System.out.println("Digite um número fracionário e o tornarei um número inteiro!");
        double numFrac = scan.nextDouble();
        System.out.println(String.format("O número inteiro correspondente é %.0f", numFrac));
    }
}