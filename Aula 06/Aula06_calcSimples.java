import java.util.Scanner;

/* ENUNCIADO: 
Sua função main deverá chamar 2 funções, sendo elas:
leTresInterios, que não recebe nenhum parâmetro e solitia que o usuário digite 3 valores inteiros e os guarda em 
três variáveis diferentes. Essa função deverá invocar uma outra função chamada calculadora() que recebe 4 parâmetros,
sendo eles os três valores lidos na função leTresInteiros() e um String contendo uma das 4 operações contendo 
uma das 4 operações ( + - * /). Seua função calculadora deverá então performar a operação passada como parâmetro e 
printar o resultado.
*/

//.equals é o método para comparar Strings.

public class Aula06_calcSimples{
    public static void main(String[] args){


}

public static void leTresInteiros(){
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número inteiro: ");
    int n1 = scan.nextInt();

    System.out.println("Digite mais um número inteiro: ");
    int n2 = scan.nextInt();

    System.out.println("Digite mais um número inteiro: ");
    int n3 = scan.nextInt();



calculadora();

}

public static void calculadora(int n1, int n2, int n3){


}

}

