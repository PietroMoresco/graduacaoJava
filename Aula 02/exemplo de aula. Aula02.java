import java.util.Scanner;

public class Aula02 {
    
    // Comentário de uma linha: a função maine abaixo é a sua porta de entrada. Necessária a todo programa Java.
    /* Apenas uma função maine é permitida por projeto. Mesmo que seja um Windows. 
     * boto muita fé
       quantas linhas 
       eu 
       quiser*/ 
    public static void main(String[] args) {
        //CRIANDO VARIÁVEIS: para criar variáveis, usamos a seguinte sintaxe TIPO NOME_VAR = VALOR;
        int minhaIdade = 34;
        double valorPi = 3.14;
        char inicialDoMeuNome = 'D';
        boolean alunosLegais = true;
        String meuSobrenome = "Goldoni";
        //NOMEANDO VARIÁVEIS: var só pode iniciar com letras ou com _
        /* Todo nome de variável deve fazer sentido com o seu conteúdo
           Letras maiúsculas e minúsculas são consideradas variáveis diferentes, logo: int meunome é diferente de int meuNome
           Por boa prática, em Java usamos camelCase para escrever variáveis longas -- spara-se palavras com letras maiúsculas*/
        String _meuNome = "Diogenes";
        
        /* OUTPUT DE DADOS
           Para imprimirmos algo em tela, usamos System.out.println("Algo")*/
           
           System.out.println("Fala mano!");
           
           System.out.println("Seja bem-vindo" + _meuNome + "!");
           
        /*INPUT DE DADOS
           Para habilitarmos o input de dados, precisamos:
           1. importar o pacote Java responsável por isso
               import java.util.Scanner
            2. Criar uma variável do tipo Scanner
               Scanner nomeDaVariavel = new scanner (System.in);
            3. impimir na tela o que desejamos que o usuário digite
                System.out.println("Digite seu nome": ")
            4. Usar o método de leitura apropriado
                nome.DoScanner .nextLine(); --> para ler Strings
                nome.DoScanner .nextInt(); --> para ler inteiros
                nome.DoScanner .nextDouble(); --> para ler números racionais
                nome.DoScanner .nextBooleans(); --> para ler um booleano
            */
        
           Scanner scan = new Scanner(System.in); 
           System.out.println("Digite aqui o nome do seu curso: ");
           String curso = scan.nextLine();
           System.out.println("Legal! Sempre quis fazer o curso de " + curso);
           
           /*FORMATANDO OUTPUT DE DADOS 
            *
           System.out.println("Digite aqui sua altura: ");
              double altura = scan.NextDouble();*/
              
        System.out.println("Digite aqui sua altura: ");
        double altura = scan.NextDouble();
        
        System.out.println("Digite seu semestre na faculdade: ");
        int semestre = scan.nextInt();
        
        System.out.println("Você possui " + altura + "m de altura e está no " + semestre + " da faculdade");
        
        System.out.println("Número original "+ númeroLouco);
        System.out.println(String.format("Número com 2 casas decimais: %.1f", numeroLouco);