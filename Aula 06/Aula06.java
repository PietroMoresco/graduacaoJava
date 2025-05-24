import java.util.Scanner;

public class Aula06{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

    //TAREFA: verificar break e continue no while loop.

    /* FUNÇÕES SEM PARÂMETRO E SEM RETORNO

        int n = scan.nextInt();
     
     */

     int n = scan.nextInt();
     if (n % 2 == 0) {
        System.out.print("Par")}
    else if (n % 2 == 0){
        System.out.print("Ímpar")}

    cumprimentaUsuario();

/*
    FUNÇÕES COM PARÂMETRO E COM RETORNO
*/
     

    }

    public static void cumprimentaUsuario(){
        Scanner scanUsuario = new Scanner (System.in);
        System.out.println("Boa noite! Qual seu nome?");
        String nomeUsuario = Scan.nextLine();
        System.out.print("Prazer em conhece-lo, " + nomeUsuario);
    }

    public static void verificaSeEPar (int num){
        if (num % 2 == 0){
            System.out.print("");
        }

    }

}

