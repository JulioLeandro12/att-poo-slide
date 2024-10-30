package questoes.app;

import java.util.Scanner;

public class Integracao {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Calcular Metabolismo Basal");
            System.out.println("3 - Verificar se um número é PAR ou ÍMPAR");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    quest1.calcularIMC(scanner);
                    break;
                case 2:
                    quest2.CalcularMetabolismoBasal(scanner);
                    break;
                case 3:
                    verificarParOuImpar(scanner);
                    break;
                case 0:
                    System.out.println("Saindo do programa. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
	
	public static void verificarParOuImpar(Scanner scanner) {
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O número %d é PAR.%n", numero);
        } else {
            System.out.printf("O número %d é ÍMPAR.%n", numero);
        }
    }
}
