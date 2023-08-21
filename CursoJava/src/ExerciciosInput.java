import java.util.Scanner;

public class ExerciciosInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Scanner sc = new Scanner(System.in);
		/* Texto
		System.out.println("Informe o texto para captura pelo System.in: \n");
		String texto;
		texto = sc.next();
		System.out.println("\n\nVocê digitou: "+texto);
		*/
		/*
		int numero;
		System.out.println("Informe um número inteiro para captura pelo System.in: \n");
		// Para float : sc.nextDouble();
		
		numero = sc.nextInt();
		System.out.println("\nO número digitado foi: " + numero);
		*/

		double numero;
		System.out.println("Informe um número para captura pelo System.in: \n");
		
		numero = sc.nextDouble();
		System.out.printf("\nO número digitado foi: %.2f%n", numero);
		char letra;
		System.out.println("Informe uma letra para captura pelo System.in: \n");
		letra = sc.next().charAt(0);
		System.out.println("\n\nVocê digitou: "+letra);
		
		
		sc.close();
	}

}
