package Exemplo;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
		int n1 = 0,n2 = 0, total = 0;
		n1 = 10;
		n2 = 20;
		total = n1 + n2;
		
		System.out.printf("O resultado de %d + %d = %d", n1, n2, total);
		System.out.println("");
		
		int n3 = 0, n4 = 0, total2 = 0; 
		n3 = 50;
		n4 = 80;
		total2 = n3 - n4;
		
		System.out.printf("O resultado de %d - %d = %d", n3, n4, total2);
		System.out.println("");
		
		double n5 = 0, n6 = 0, total3 = 0; 
		n5 = 83;
		n6 = 4;
		total3 = n5 % n6;
		
		System.out.printf("O número %.2f dividido por %.2f possui resto %.4f", n5, n6, total3);
		System.out.println("");
		
		int x = 0;
		System.out.printf("O valor de x: %d\n", x);
		x++;
		System.out.printf("O valor de x: %d\n", x);
		x++;
		System.out.printf("O valor de x: %d\n", x);
		x = x + 1;
		System.out.printf("O valor de x: %d\n", x);
		x = x + 2;
		System.out.printf("O valor de x: %d\n", x);
		
		System.out.println("");
		
		int x2 = 500;
		System.out.printf("O valor de x: %d\n", x2);
		x2 = x2 - 1;
		System.out.printf("O valor de x: %d\n", x2);
		x2--;
		System.out.printf("O valor de x: %d\n", x2);
		x2--;
		System.out.printf("O valor de x: %d\n", x2);
		x2 = x2 - 2;
		System.out.printf("O valor de x: %d\n", x2);
		
		System.out.println("");
		
		double a, b, c, d, resultado;
		
		a = 10;
		b = 20;
		c = 30; 
		d = 10;
		
		resultado = a + b * c / d;
		
		System.out.printf("Resultado: %.2f", resultado);
		
		System.out.println("");
		
		double e, f, g, h, resultado2;
		
		e = 10;
		f = 20;
		g = 30; 
		h = 10;
		
		resultado2 = (e + f) * g / h;
		
		System.out.printf("Resultado: %.2f", resultado2);

	}

}
