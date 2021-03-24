package exemplo;

public class OperadoresAritmeticos {

	public static void main(String[] args) {
	
		//x^2 + 12x - 13 = 0
		//2x^2 - 16x - 18 = 0
		
		double a, b, c;
		a = 1;
		b = 12;
		c = -13;
		
		double delta = 0;
		
		delta = (b * b) - (4 * a * c);
		System.out.printf("O valor de delta é: %.0f\n", delta);
		
		double x_linha = 0;
		x_linha = (-b + Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x' é: %.0f\n", x_linha);
		
		double x_duasLinhas = 0;
		x_duasLinhas = (-b - Math.sqrt(delta)) / (2*a);
		System.out.printf("O valor de x'' é: %.0f\n", x_duasLinhas);
		
		System.out.println("");
		double d, e, f;
		d = 2;
		e = -16;
		f = -18
				;
		
		double delta2 = 0;
		
		delta2 = (e * e) - (4 * d * f);
		System.out.printf("O valor de delta2 é: %.0f\n", delta2);
		
		double x_linha2 = 0;
		x_linha2 = (-e + Math.sqrt(delta2)) / (2*d);
		System.out.printf("O valor de x' é: %.0f\n", x_linha2);
		
		double x_duasLinhas2 = 0;
		x_duasLinhas2 = (-e - Math.sqrt(delta2)) / (2*d);
		System.out.printf("O valor de x'' é: %.0f\n", x_duasLinhas2);
	}

}
