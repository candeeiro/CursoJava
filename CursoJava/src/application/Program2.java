package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;


public class Program2 {

	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		//Calculator calc = new Calculator();
		
		System.out.println("Informe o raio: ");
		double radius = sc.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circunferência: %.2f%n", c) ;
		System.out.printf("Volume: %.2f%n", v) ;
		System.out.printf("Valor de 𝝅: %.2f%n", Calculator.PI) ;
		
		sc.close();
	}
	
	
}
