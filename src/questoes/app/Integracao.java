package questoes.app;

import java.util.Scanner;

public class Integracao {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("Escolha uma op��o:");
            System.out.println("1 - Calcular IMC");
            System.out.println("2 - Calcular Metabolismo Basal");
            System.out.println("3 - Verificar se um n�mero � PAR ou �MPAR");
            System.out.println("0 - Sair");
            System.out.print("Op��o: ");
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
                    System.out.println("Saindo do programa. At� mais!");
                    break;
                default:
                    System.out.println("Op��o inv�lida! Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }
	
	public static void verificarParOuImpar(Scanner scanner) {
        System.out.print("Digite um n�mero: ");
        int numero = scanner.nextInt();

        if (numero % 2 == 0) {
            System.out.printf("O n�mero %d � PAR.%n", numero);
        } else {
            System.out.printf("O n�mero %d � �MPAR.%n", numero);
        }
    }
}
