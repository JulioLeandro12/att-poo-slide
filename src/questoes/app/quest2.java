package questoes.app;
import java.util.Scanner;

public class quest2 {
	public static void CalcularMetabolismoBasal(Scanner scanner) {
//        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite seu peso em Kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Digite seu gênero (M para masculino, F para feminino): ");
        char genero = scanner.next().toUpperCase().charAt(0);

        System.out.print("Digite sua idade em anos: ");
        int idade = scanner.nextInt();

        //--------------------- calculando metabolismo basal (MB) -----------------
        double mb = 0;
        if (genero == 'M') {
        	if (idade < 0) {
        		System.out.println("Ponha sua idade verdadeira, seu cabra!");
        	}
        	else if (idade > 18 && idade < 30) {
        		mb = 679 + (15.057 * peso);
        	}
        	else if (idade > 30 && idade < 60) {
        		mb = 879 + (11.6 * peso);
        	}
        	else {
        		mb = 487 + (13.5 * peso);
        	}
         }
        
        else if (genero == 'F') {
        	if (idade < 0) {
        		System.out.println("Ponha sua idade verdadeira, sua moça!");
        	}
        	else if (idade > 18 && idade < 30) {
        		mb = 489 + (14.7 * peso);
        	}
        	else if (idade > 30 && idade < 60) {
        		mb = 829 + (8.7 * peso);
        	}
        	else {
        		mb = 596 + (10.5 * peso);
        	}
        } 
        
        else {
            System.out.println("Gênero inválido!");
            scanner.close();
            return;
        }

        System.out.printf("Olá, %s! Seu metabolismo basal é: %.2f Kcal%n", nome, mb);
    }
}
