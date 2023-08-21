import java.util.Scanner;

public class Condicional {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int heure = 1;
		while (heure != 0) {
		System.out.println("\nQuelle heure est-il?");
		
		heure = sc.nextInt();
		
		if (heure < 12) {
			System.out.println("Bonjour");
		}
		else if ((heure <= 18) && (heure >= 12)) {
			System.out.println("Bon après-midi");
		} else {
			System.out.println("Bonne nuit");
		}
		}
		System.out.println("Il est minuit, c'est l'heure du coucher! \n"
				+ "Au revoir!");
		sc.close();

	}
	
}
