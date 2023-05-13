package calculadora;
import java.util.Scanner;

public class CalculadoraMenu {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao = 0;
        int num1 = 0;
        int num2 = 0;
        
        do {
            System.out.println("---- CALCULADORA MENU ----");
            System.out.println("Digite o primeiro número: ");
            num1 = input.nextInt();
            System.out.println("Digite o segundo número: ");
            num2 = input.nextInt();
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Soma");
            System.out.println("2 - Subtração");
            System.out.println("3 - Multiplicação");
            System.out.println("4 - Divisão");
            System.out.println("5 - Trocar valores");
            System.out.println("6 - Sair");
            opcao = input.nextInt();
            
            switch (opcao) {
                case 1:
                    int resultadoSoma = soma(num1, num2);
                    System.out.println("Resultado da soma: " + resultadoSoma);
                    break;
                case 2:
                    int resultadoSubtracao = subtracao(num1, num2);
                    System.out.println("Resultado da subtração: " + resultadoSubtracao);
                    break;
                case 3:
                    int resultadoMultiplicacao = multiplicacao(num1, num2);
                    System.out.println("Resultado da multiplicação: " + resultadoMultiplicacao);
                    break;
                case 4:
                    double resultadoDivisao = divisao(num1, num2);
                    System.out.println("Resultado da divisão: " + resultadoDivisao);
                    break;
                case 5:
                    int temp = num1;
                    num1 = num2;
                    num2 = temp;
                    System.out.println("Valores trocados com sucesso!");
                    break;
                case 6:
                    System.out.println("Encerrando a calculadora...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
        
        input.close();
    }
    
    public static int soma(int a, int b) {
        return a + b;
    }
    
    public static int subtracao(int a, int b) {
        return a - b;
    }
    
    public static int multiplicacao(int a, int b) {
        return a * b;
    }
    
    public static double divisao(int a, int b) {
        return (double) a / b;
    }
    
}