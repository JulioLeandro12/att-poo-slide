package questoes.app;
import java.util.Scanner;

public class quest1 {
	 public static void calcularIMC(Scanner scanner) {
//	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Digite seu nome: ");
	        String nome = scanner.nextLine();

	        System.out.print("Digite seu peso em Kg: ");
	        double peso = scanner.nextDouble();

	        System.out.print("Digite sua altura em metros: ");
	        double altura = scanner.nextDouble();

	        double imc = peso / (altura * altura);
	        
	        if (imc < 19) {
	        	System.out.printf("Ol�, %s! Seu IMC �: %.2f%n e est� abaixo do peso", nome, imc);
	        }
	        else if (imc >= 19 && imc <= 25) {
	        	System.out.printf("Ol�, %s! Seu IMC �: %.2f%n e est� no peso normal", nome, imc);
	        }
	        else if (imc >= 25 && imc <= 30) {
	        	System.out.printf("Ol�, %s! Seu IMC �: %.2f%n e est� no sobrepeso", nome, imc);
	        }
	        else if (imc >= 30 && imc <= 40) {
	        	System.out.printf("Ol�, %s! Seu IMC �: %.2f%n e est� em obesidade do tipo 1", nome, imc);
	        }
	        else {
	        	System.out.printf("Ol�, %s! Seu IMC �: %.2f%n e est� em obesidade M�rbida", nome, imc);
	        }
	    }
}
