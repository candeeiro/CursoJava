import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantos numeros serão digitados? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		for (int i=0; i< n; i++) {
			System.out.println("Digite um numero:");
			vetor[i] = sc.nextInt();
		}
		System.out.println("Numeros negativos: ");
		for (int i=0; i< n; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		
		
		sc.close();
		
	}

}
