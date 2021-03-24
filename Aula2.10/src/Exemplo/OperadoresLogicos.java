package Exemplo;

public class OperadoresLogicos {
	
	public static void main(String[]args) {
		
		boolean p, q, s;
		p = false; q = false;
		s = p && q;
		System.out.printf("p: %b, q: %b; s: %b\n", p, q, s);
		
		p = true; q = false;
		s = p && q;
		System.out.printf("p: %b, q: %b; s: %b\n", p, q, s);
		
		p = false; q = true;
		s = p && q;
		System.out.printf("p: %b, q: %b; s: %b\n", p, q, s);
		
		p = true; q = true;
		s = p && q;
		System.out.printf("p: %b, q: %b; s: %b\n", p, q, s);
		System.out.println("");
		
		boolean a, b, c;
		a = false; b = false;
		c = a || b;
		System.out.printf("a: %b, b: %b; c: %b\n", a, b, c);
		
		a = true; b = false;
		c = a || b;
		System.out.printf("a: %b, b: %b; c: %b\n", a, b, c);
		
		a = false; b = true;
		c = a || b;
		System.out.printf("a: %b, b: %b; c: %b\n", a, b, c);
		
		a = true; b = true;
		c = a || b;
		System.out.printf("a: %b, b: %b; c: %b\n", a, b, c);
		
		System.out.println("");
		
		boolean d, e;
		d= true;
		e = !d;
		System.out.printf("d: %b, s: %b\n", d, e);
		
		d= false;
		e = !d;
		System.out.printf("d: %b, s: %b\n", d, e);
	}
}
