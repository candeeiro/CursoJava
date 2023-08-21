import java.util.Scanner;
import java.util.Locale;

public class ExercicioCondicional {
		public static void main(String[] args) {
				
			Locale.setDefault(Locale.US);
			Scanner sc = new Scanner(System.in);
			//int var = 0;
			
			//System.out.println("\nInforme um número?");
			
			//var = sc.nextInt();
			
			/*
			 if (var < 0) {
			 
				System.out.println("NEGATIVO");
			}
			else {  
				System.out.println("NÃO É NEGATIVO");
			}

			if (( var % 2 == 0) || (var == 0)){
				System.out.println("É par");
			}
			else {
				System.out.println("É ímpar");
			}
			*/
			//Scanner sc = new Scanner(System.in);

			double x = sc.nextDouble();
			double y = sc.nextDouble();
			
			if (x == 0.0 && y == 0.0) {
				System.out.println("Origem");
			}
			else if (x == 0.0) {
				System.out.println("Eixo Y");
			}
			else if (y == 0.0) {
				System.out.println("Eixo X");
			}
			else if (x > 0.0 && y > 0.0) {
				System.out.println("Q1");
			}
			else if (x < 0.0 && y > 0.0) {
				System.out.println("Q2");
			}
			else if (x < 0.0 && y < 0.0) {
				System.out.println("Q3");
			}
			else {
				System.out.println("Q4");
			}
			
			sc.close();
			
		}
		
	}