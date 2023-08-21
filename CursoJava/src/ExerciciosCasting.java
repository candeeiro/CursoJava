
public class ExerciciosCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Operações básicas com variáveis
		int x, y;
		x = 8;
		y = x * 2;
		System.out.println(x);
		System.out.println(y);
		
		// Exemplo calculo de área de um trapézio
		double b, B, h, area;
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		System.out.print("A área do trapézio de base 6 x 8 e altura 5 é: ");
		System.out.println(area);
		
		// Casting para conversão explicita dos valores
		int a, c;
		double resultado;
		
		a = 5;
		c = 2;
		resultado = (double) a / c; // Faz com que o resultado da operação seja passado em double. Se não tiver, irá entregar em int
		System.out.println( "Operação com casting para float: " + (float) a / c );
		System.out.println( "Operação com casting para double: " + (double) a / c );
		System.out.println( "Operação sem casting: " + a / c);
		
		// convertendo de double para int com perda de valor da casa decimais
		double d;
		int e;
		d = 5.25;
		e = (int) d;
		System.out.println(e);
		
		
		
	}

}
