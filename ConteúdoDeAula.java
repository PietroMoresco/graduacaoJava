import java.util.Scanner;

public class ConteúdoDeAula{
    public static void main(String[] args){

/*Legenda:
    ( \n ) pula uma linha.
    ( \t ) dá um tab.
*/

/* Bug por ponto flutuante ou vírgula:

Terminal diz: Exception in thread "main" java.util.InputMismatchException.
A exceção InputMismatchException é lançada pela instância do Scanner quando o token recuperado não corresponde 
ao tipo esperado. InputMismatchException se estende da classe NoSuchElementException, que é usada para indicar que 
o elemento solicitado não existe.
Isso acontece porque o separador decimal do teu sistema é representado por uma vírgula e não um ponto. 
Trocá-lo pela vírgula resolve o teu problema de forma parcial, se você executar o teu código em um sistema onde 
o separador decimal é um ponto, o problema volta a ocorrer.
*/

/* FUNÇÃO 'MAIN'
A função main acima é necessária em todo programa Java. É sua porta de entrada.
Apenas uma função main é permitida por projeto. */
    
/*CRIANDO VARIÁVEIS 
Para criar variáveis, usamos a seguinte sintaxe: TIPO NOME_VAR = VALOR; */

/* NOMEANDO VARIÁVEIS
         * Para nomear variáveis, devemos iniciar com uma letra ou com _
         * Todo nome de variável deve fazer sentido em relação ao seu conteúdo
         * Letras maiúsculas e minúsculas são caracteres diferentes, logo:
         * "int meunome" e "int meuNome" são variáveis diferentes
         * Por boa prática, em Java usamos camelCase para escrever variáveis longas */
        
        int minhaIdadeNesteAno = 34;
        double valorPi = 3.14;
        char inicialDoMeuNome = 'D';
        boolean alunosLegais = false;
        String meuSobrenome = "Goldoni";
        

        String _meuNome = "Diógines";
        
/*OUTPUT DE DADOS
Para imprimirmos algo em tela, usamos System.out.println("Algo"); */

        System.out.println("Seja bem-vindo, " + _meuNome + "!");
        System.out.println("Ouvi falar que você tem " + minhaIdadeNesteAno + " anos de vida");
        
/* INPUT DE DADOS
        Para habilitarmos o input de dados, precisamos:
        1: Importar o pacote Java responsável por isso no topo da página, fora da classe --> import java.util.Scanner
        2: Criar uma variável do tipo Scanner --> Scanner scan = new Scanner(System.in);
        3: Imprimir em tela o que desejamos que o usuário digite --> System.out.println("Digite seu nome aqui: ");
        4: Usar o método de leitura apropriado:
        nomeDoScanner.nextLine(); --> para ler Strings
        nomeDoScanner.nextInt(); --> para ler inteiros
        nomeDoScanner.nextDouble(); --> para ler números racionais
        nomeDoScanner.nextBoolean(); --> para ler um booleano
        
        EX: */
        Scanner scan = new Scanner(System.in);
        //System.out.println("Digite aqui o nome do seu curso: ");
        //String curso = scan.nextLine();
        //System.out.println("Legal! Sempre quis fazer o curso de " + curso);
        
/* FORMATANDO OUTPUT DE DADOS */
        System.out.println("Digite um número com 4 casas decimais: ");
        double numeroLouco = scan.nextDouble();
        
        System.out.println("Número original: " + numeroLouco);
        System.out.println(String.format("Número com 2 casas decimais: %.2f", numeroLouco));  

/*OPERADORES ARITMÉTICOS:
    Adição: +
    Subtração: -
    Multiplicação: *
    Divisão: /
    Divisão, retorna resto: % (mod ou módulo)
*/

        System.out.println("ARITMÉTICA BÁSICA\nVamos calcular a Aritmética Básica de 2 números!!!\n\n");
     
        System.out.println("Digite o primeiro número: ");
        int num1 = scan.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scan.nextInt();
        
        System.out.println(String.format("A soma de %d + %d = %d", num1, num2, (num1 + num2)));
        System.out.println(String.format("A subtração de %d - %d = %d", num1, num2, (num1 - num2)));
        System.out.println(String.format("A multiplicação de %d * %d = %d", num1, num2, (num1 * num2)));
        System.out.println(String.format("A divisão de %d / %d = %d", num1, num2, (num1 / num2)));
        System.out.println(String.format("O resto da divisão de %d mod %d = %d", num1, num2, (num1 % num2)));
        
/* OPERADORES DE ATRIBUIÇÃO:
    Atribuição: =
        -- atribuição simples.
    Atribuição somada: +=
        -- atribui o valor de X + o valor a que se está atribindo.
        EX: X += Y é (X = X + Y).
    Atribuição subtraída: -=
        -- atribui o valor de X + o valor a que se está atribindo.
        EX: X += Y é (X = X - Y).
    Atribuição multiplicada: *=
        -- atribui o valor que já estava dentro de X multiplicado por Y.
        EX: X *= Y é (X = X * Y)
    Atribuição divisível: /= 
        --
         EX: X /= Y é (X = X / Y)
    Atribuição mod: %= 
        -- atribui a X o resto da divisão inteira em questão.
        EX: X = X % Y

    EXERCÍCIOS:
*/
        int num = 0;
        System.out.println("Valor original " + num);
        num += 5;
        System.out.println("Valor de num: " + num);
        num *= 4;
        System.out.println("Valor de num: " + num);
        num /= 3;
        System.out.println("Valor de num: " + num);
        num %= 2;
        System.out.println("Valor de num: " + num);
        System.out.println("Valor de num: " + (double)num);


        double pi = 3.14;
        pi -= 1.07;
        pi -= 1.07;
        System.out.println(String.format("%.2f", pi));
        pi += 10.99;
         System.out.println(String.format("%.2f", pi));
         pi /= 0.69;
         System.out.println(String.format("%.2f", pi));
         pi *= 14;
         System.out.println(String.format("%.2f", pi));
         
/* FUNÇÕES MATEMÁTICAS:
    Math.abs();
        -- retorna o valor absoluto de um valor x. 
    Math.ceil();
        -- arredonda pra cima o valor de x.
    Math.floor();
        -- arredonda pra baixo o valor de x.
    MAth.round();
        -- arredonda o valor de x.
   Math.max();
        -- compara e retorna o valor máximo entre dois valores
    passados.
    Math.min();
        -- compara e retorna o valor menor entre dois valores
    passados.
    Math.pow();
        -- potenciação.
    Math.sqrt();
        -- retorna a raiz quadrada de x.
    Math.hypoy();
        -- retorna a hipotenusa - adiciona-se os catetos assim: (x, y).
    Math.sin();
        -- retorna o seno de um ângulo
    Constante PI:           Math.PI;
    Constante e:            Math.E;

    EX:
*/
        double numGrande = 9.9999;
        double numPequenino = 0.3109;
        System.out.println("Valor absoluto de -3:\t\t\t" + Math.abs(-3));
        System.out.println("Valor máximo entre 9.9999 e 0.3109:\t" + Math.max(numGrande, numPequenino));
        System.out.println("Valor mínimo entre 9.9999 e 0.3109:\t" + Math.min(numGrande, numPequenino));
        System.out.println("2 elevado a 5:\t\t\t\t" + Math.pow(2, 5));
        System.out.println("Valor de 0.3109 arredondado para cima:\t" + Math.ceil(numPequenino));
        System.out.println("Valor de 9.9999 arredondado para baixo:\t" + Math.floor(numGrande));
        System.out.println("Valor de 9.9999 arredondado:\t\t" + Math.round(numGrande));
        System.out.println("Pi:\t\t\t\t\t" + Math.PI);
        System.out.println("e:\t\t\t\t\t" + Math.E);
         
/* CASTING OU CONVERSÃO DE TIPOS
    int x = 14;
    (double) x ---> Converterá x de inteiro para double
    double y = 3.14;
    (int) y ---> TENTARÁ converter y de double para inteiro
    int x = 14;
    System.out.println((double) x); 
*/
        int intCasting = 14;
        System.out.println("O int 14 convertido para double é " + (double)intCasting);
        double doubleCasting = 15.2;
        System.out.println("O double 15.2 convertido para int é " + (int)doubleCasting);

         double y = 3.99;
         System.out.println((int) y);
         
         //Exercício:
         double nota1 = 10;
         double nota2 = 8.3;
         double nota3 = 9.7;
         int qtAlunos = 3;
         double notaMedia = (nota1 + nota2 + nota3) / (double) qtAlunos;
         System.out.println(String.format("A nota média da turma foi de: %.2f", notaMedia));
         
         //Calculando porcentagem
        
         int maximoPontos = 500;
         int pontuacaoPlayer = 423;
         System.out.println((((double) pontuacaoPlayer / maximoPontos) * 100) + "%");

/*
    OPERADORES DE COMPARAÇÃO
        ==  --> Verifica se o valor da esquerda é igual ao da direita
        !=  --> Verifica se o valor da esquerda é diferente do da direita
        >   --> Verifica se o valor da esquerda é maior que o da direita
        <   -->  Verifica se o valor da esquerda é menor que o da direita
        >=  -->  Verifica se o valor da esquerda é maior ou igual ao da direita
        <=  -->  Verifica se o valor da esquerda é menor ou igual ao da direita
*/
        int x = 10;
        int y2 = 15;
        System.out.println("10 == 15: " + (x == y2));
        System.out.println("10 != 15: " + (x != y2));
        System.out.println("10 > 15: " + (x > y2));
        System.out.println("10 < 15: " + (x < y2));
        System.out.println("10 >= 15: " + (x >= y2));
        System.out.println("10 <= 15: " + (x <= y2));
        
/*       OPERADORES LÓGICOS
         * && --> Equivale au "e" lógico. Ambos lados da equação precisam ser verdadeiros
         * || --> Equivale ao "ou" lógico. Ao menos um lado da equação precisa ser verdadeiro. Lê-se tbm
        "alguma dessas duas". 
         * !  --> Equivale ou "¬" ou "~". Inverte o valor lógico atual.
*/
         System.out.println("Digite sua primeira nota: ");
         int Nota1 = scan.nextInt();
         
         System.out.println("Digite sua segunda nota: ");
         int Nota2 = scan.nextInt();
         
         System.out.println("Nota1 e Nota2 >= 6: " + (Nota1 >= 6 && Nota2 >= 6));
         System.out.println("Nota1 ou Nota2 == 10: " + (Nota1 == 10 || Nota2 == 10));
         System.out.println("¬false " + !false);
         System.out.println("¬true " + !true);

         //EX:
         int testeOL = 10;
         int testeOL2 = 12;

         System.out.println("OL é igual a 9? " + (testeOL == 9));
         System.out.println("OL e OL2: " + (testeOL >= 6 && testeOL2 >= 6));
         System.out.println("OL e OL2 são, ambos, iguais a 10? " + (testeOL == 10 && testeOL2 == 10));
         System.out.println("OL e OL2 são, algum dos dois, iguais a 10? " + (testeOL == 10 || testeOL2 == 10));
         System.out.println(!false);
        
         /* ESTRUTURA DE SELEÇÃO - IF/ELSE (equação booleana)
            Lê-se "Se alguma coisa é verdadeira, então faço algo. Se outra coisa é verdadeira, 
            faço outro algo. Senão, faça outro coisa"
            
            Os blocos else if() e else são opcionais.
          
          * A sintaxe é:
          * if (equação booleana) {
          *     bloco de código
          * } else if (outra equação booleana) { // opcional
          *     bloco de código
          * } else { // opcional
          *     bloco de código
          * }
          }
          }
          }
*/
          int adivinhaNumero = 2;
          System.out.println("Qual número eu estou pensando? ");
          
          int tentativa = scan.nextInt();
          if (tentativa == adivinhaNumero) {
              System.out.println("Acertô mizerávi.");
          } else if (tentativa == 3 || tentativa == 1) {
             System.out.println("Tá quente.");
          } else {
              System.out.println("Errou!");
          }
          
         System.out.println("Digite sua idade: "); 
         int idade = scan.nextInt();
         if (idade <= 0) {
             System.out.println("Você não existe.");
         } else if (idade < 18) {
             System.out.println("Você ainda não pode dirigir...");
         } else if (idade >= 18 && idade <= 64) {
             System.out.println("Dirija com cuidado");
         } else {
             System.out.println("Cai fora da estrada, ancião!");
         }
         
         /* ESTRUTURA DE SELEÇÃO - SWITCH
          * A partir do valor de uma variável ou equação, itera sobre possibilidades.
          * Sintaxe é:
          * switch (equação ou variável) {
          *     case valor:
          *          bloco de código
          *          break;
          *     case outro valor:
          *          bloco de código
          *          break;
          *     case algum outro valor:
          *          bloco de código
          *          break;
          *     default: // O default é igual ao else 
          *          bloco de código
          * }
         */
          System.out.println("Digite o valor numérico de um dia da semana: ");
          int diaDaSemana = scan.nextInt();
       /*   switch (diaDaSemana) { // Itere sobre as possibilidades abaixo com base no valor de diaDaSemana
             case 1:
                 System.out.println("Domingo");
                 break;
             case 2:
                 System.out.println("Segunda");
                 break;
             case 3:
                 System.out.println("Terça");
                 break;
             case 4:
                 System.out.println("Quarta");
                 break;
             case 5:
                 System.out.println("Quinta");
                 break;
             case 6:
                 System.out.println("Sexta");
                 break;
             case 7:
                 System.out.println("Sábado graças a deus");
                 break;
             default:
                 System.out.println("Dia inválido"); */


    /**
         * ESTRUTURA DE REPETIÇÃO (Loop) - FOR
         Serve para repetirmos um bloco de código um número específico de vezes.
         Normalmente, faz uso de uma variável contadora, que se encarrega de 
         contar o número de execuções do loop for. Essa variável contadora costuma
         se chamar i, e ser incrementada a cada iteração.

         * A sintaxe de um loop for simples é:
               for (int i = 0; i < algumNumero; i++) {
                   // Seu bloco de código aqui
               }
               
*/
         // Imprime de 0 a 10
         for (int i = 0; i <= 10; i++) {
            System.out.print(i + " -> ");
        }
        System.out.println("\n");
        
        // Imprime de 0 a 100, em incrementos de 10
        for (int i = 0; i <= 100; i += 10 ) {
            System.out.print(i + " -> ");
        }
        System.out.println("\n");
        
        // Imprime de 100 a 0, em decrementos de 25
        for (int i = 100; i >= 0; i -= 25) {
            System.out.print(i);
            if (i >= 25) {
                System.out.print(" -> ");
           }
        }

        // Solicita um número para o usuário, e retorna a tabuada deste número
        System.out.println("\nDigite um valor para calcular sua tabuada: ");
        int tabuada = scan.nextInt();
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println(tabuada + " x " + i + " = " + (tabuada * i));
        }

        //Narração de um jogo
        System.out.println("\n");
        System.out.println("NARRAÇÃO DE UM JOGO");
        System.out.println("Pelé fez um gol 1 vez");
        for (int i = 2; i <= 10; i++){
        System.out.println("Pelé fez um gol " + i + " vezes!");
        }
        
        // Imprime de 1 a 10, com exceção do valor 3, usando if
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            if (i != 3) {
                System.out.print(i + " -> ");
            }
        }
        
        // Execução encadeada de for (for dentro de for)
        /*
        System.out.println("\n");
        for (int i = 1; i <= 10; i++) {
            System.out.println("Valor de i: " + i);
            for (int j = 1; j <= 5; j++) {
                System.out.println("\tValor de j: " + j);    
            }
        }*/
        
        /**
         * ESTRUTURA DE REPETIÇÃO - WHILE
         * Serve para repetirmos um bloco de código enquanto uma condição for
         * verdadeira (ou falsa, dependendo da implementação).
         * Também permitirá, assim como um FOR, a execução de um bloco de código
         * por um número específico de vezes, fazendo uso de uma variável contadora,
         * normalmente denotado por i. 
         * Sua sintaxe é:
         *     while (algumaCondição) {
         *         //bloco de código
         *     }
        */
        
        // Imprimir de 0 a 10 utilizando while
        System.out.println("\n");
        int i = 0;
        while (i <= 10) {
            System.out.print(i + " -> ");
            i++;
        }
        
        // Imprimir de 100 a 0 utilizando while, com exceção do 70
        System.out.println("\n");
        i = 100;
        while (i >= 0) {
            if (i != 70) {
                System.out.print(i + " -> ");
            }
            
            i -= 10;
        }
        
        // Imprimir de 100 a 0 utilizando while, com exceção do 70, e o break
        System.out.println("\n");
        i = 100;
        while (i >= 0) {
            if (i == 70) {
                break;
            }
            System.out.print(i + " -> ");
            i -= 10;
        }
        
        // Jogo bobo de adivinha
        int numImaginado = 42;
        System.out.println("\nQual número estou pensando, entre 1 e 100? ");
       int tentativa2 = scan.nextInt();
        
        while (tentativa != numImaginado) {
            System.out.println("Erro, otário. Tenta de novo: ");
            tentativa = scan.nextInt();
        }

        System.out.println("Acertô mizarávi.");

/*     MENU
        Exibe uma lista de opções, normalmente numeradas.
        Usa uma variável para armazenar a opção escolhida pelo usuário.
        Possui um laço para permanecer no programa enquanto o user não optar por sair.
        Usa uma estrutura de seleção p/ identificar a escolha informada pelo user.
        Para cada escolha possível, invocamos uma função distinta.

        Para criar um Menu, use loop while, if else e funções.
        Exemplo abaixo.
*/

        /*FUNÇÕES
         Uma função nada mais é do que um >>bloco de código<< ao qual damos um nome,
         e que poderá ser invocado em diferentes partes do nosso código, evitando
         que tenhamos que reescrever esse bloco de código toda vez que o usarmos.

            FUNÇÕES SEM PARÂMETRO E SEM RETORNO
                A sintaxe de uma função sem parâmetro e sem retorno é: 
                tipo_de_acesso static void nome_da_funcao() {
              // Seu bloco de código
            }
                EX:
 */
                cumprimentaUsuario();
                //é apenas um bloco de código que será rodado naquele ponto.
        
/*          FUNÇÕES COM PARÂMETRO E SEM RETORNO
                Uma função pode receber dados por parâmetro. Esses parâmetros devem ser
                passados para a função quando ela é invocada, adicionando eles dentro dos
                parenteses. 
     
                A sintaxe para criar uma função com parâmetro e sem retorno é: 
                tipo_de_acesso static void nome_da_funcao(tipo_dado param1, tipo_dado param2...){
                }

               A sintaxe para invocar uma função com parâmetro e sem retorno é: 
               tipo_de_acesso static void nome_da_funcao(param1, param2) {
     }
               EX:
 */
                int n = 13;
                verificaSeEhPar(n);
                verificaSeEhPar(198);
                verificaSeEhPar(315);
                System.out.println("Digite um numero p/ eu verificar se eh par ou impar: ");
                verificaSeEhPar(scan.nextInt());
    
/*          FUNÇÕES COM PARÂMETRO E COM RETORNO
            Caso queiramos que nossa função, após invocada e processada, nos retorne algum valor processado, 
            precisamos definar qual o tipo de retorno dessa função, e também utilizar dentro da função a cláusula return.
            
            A sintaxe para criar uma função com parâmetro e com retorno é:
            tipo_de_acesso static tipo_de_retorno nome_da_funcao(){
            }

            EX:
*/
                double valoresSomados = somaDoubles(1.18, 3.15, 9.161);
                System.out.println(valoresSomados);
    
                int valoresSubtraidos = subtraiInts(-98, 15);
                System.out.println(valoresSubtraidos);
            }




public static void cumprimentaUsuario() {
    Scanner scanUsuario = new Scanner(System.in);
    System.out.println("Boa noite, qual seu nome?");
    String nomeUsuario = scanUsuario.nextLine();
    System.out.println("Prazer em conhece-lo, " + nomeUsuario);
}

public static void verificaSeEhPar(int num) {
    if (num % 2 == 0) {
        System.out.println(num + " é par!");
    } else {
        System.out.println(num + " é ímpar...");
    }
}

public static double somaDoubles(double n1, double n2, double n3) {
    double soma = n1 + n2 + n3;
    return soma;
}

public static int subtraiInts(int n1, int n2) {
    return n1 - n2;
}

    /**
         * ARRAYS:
         * Um array nada mais é do que dar UM NOME SÓ para múltiplos endereços de memória
         * contendo dados do mesmo tipo.
         * 
         * Sintaxe:
         * tipo_de_dado[] nome_do_array = {valor1, valor2, valor3}; // Cria um array de 3 posições
         * 
         * Sintaxe para acesso às informações via índice
         * IMPORTANTE: Índices de arrays e matrizes sempre iniciam em 0 e vão até tamanho - 1
         * nome_do_array[índice];
        */
       
       // DECLARAÇÃO E INSTANCIAÇÃO DIRETA DE ARRAYS
       String[] alunosGA =    {"Deniam", "Michael", "Marina", "Pietro"}; // Array de strings de 4 posições
       double[] notasGA =   {10.0, 10.0, 0.0, 10.0}; // Array de doubles de 4 posições
       char[] conceitosGA = {'A', 'A', 'D', 'A'}; // Array de chars de 4 posições
       int[] faltasGA =     {0, 0, 5, 0}; // Array de ints de 4 posições
       
       // IMPRIMINDO INFORMAÇÕES CONTIDAS NOS ARRAYS UTILIZANDO SEUS ÍNDICES
       System.out.println("Aluno no índice 3: " + alunosGA[3]);
       System.out.println("Nota no índice 2: " + notasGA[2]);
       System.out.println("Conceito no índice 0: " + conceitosGA[0]);
       System.out.println("Falta no índice 3: " + faltasGA[3]);
       //System.out.println("Tenta buscar aluno no índice 6: " + alunos[6]); // Irá dar erro, pois estou acessando a posição 7 de 3
       
       // DECLARAÇÃO COM INSTANCIAÇÃO SUBSEQUENTE
       String[] alunosGB = new String[4]; 
       double[] notasGB = new double[4]; // Cria um array de doubles de 4 posições sem valor atribuído
       char[] conceitosGB = new char[4]; // Cria um array de chars de 4 posições sem valor atribuído
       int[] faltasGB = new int[4]; // Cria um array de ints de 4 posições sem valor atribuído
       System.out.println("O valor padrão de um String é: " + alunosGB[0]);
       System.out.println("O valor padrão de um double é: " + notasGB[0]);
       System.out.println("O valor padrão de um char é: " + conceitosGB[0]);
       System.out.println("O valor padrão de um int é: " + faltasGB[0]);
       
       // ITERA SOBRE TODO O ARRAY COM UM FOR
       for (int i = 0; i < alunosGA.length; i++) {
           System.out.println("Aluno[" + i + "] = " + alunosGA[i]);
       }
       
       // ITERA SOBRE TODO O ARRAY E DESCOBRE QUEM É O MAIS VELHO
       int[] idade = {34, 40, 26, 18, 17};
       int maisVelho = 0;
       int maisNovo = 999;
       for (int i = 0; i < idade.length; i++) {
           if (idade[i] > maisVelho)
               maisVelho = idade[i];
            
           if (idade[i] < maisNovo)
               maisNovo = idade[i];
       }
       System.out.println("A maior idade contida no array é: " + maisVelho);
       System.out.println("A menor idade contida no array é: " + maisNovo);
       
       // ATRIBUÍ NOVOS VALORES A UM ARRAY EXISTENTE
       Scanner scan = new Scanner(System.in);
       for (int i = 0; i < notasGB.length; i++) {
           System.out.println("Digite o nome do aluno no índice " + i);
           alunosGB[i] = scan.next();
           System.out.println("Digite a nota do aluno no índice " + i);
           notasGB[i] = scan.nextDouble();
       }
       
       // Imprime nome e nota dos alunos do GB
       for (int i = 0; i < notasGB.length; i++) {
           System.out.print("O aluno no índice " + i + " se chama " + alunosGB[i]);
           System.out.print(" e sua nota no GB foi " + notasGB[i]);
           System.out.println();
       }
       
       // Calcula a média do GB dos alunos 
       double media = 0;
       double soma = 0;
       int qtAlunos = notasGB.length;
       for (int i = 0; i < notasGB.length; i++) {
           soma += notasGB[i];
       }
       
       media = soma / qtAlunos;
       System.out.println("A média final do GB é de: " + media);
    }
}
    

    }
