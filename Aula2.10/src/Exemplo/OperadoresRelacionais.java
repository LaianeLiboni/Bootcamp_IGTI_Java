package Exemplo;

public class OperadoresRelacionais {
	
	public static void main(String[]args) {
		
	int var1 = 10, var2 = 20;
	boolean resultado;
	
	resultado = (var1 == var2);
	
	System.out.printf("As variaveis s�o iguais? \nResposta: %b", resultado);
	System.out.println("");
	
	int var3 = 20, var4 = 20;
	boolean resultado2;
	
	resultado2 = (var3 == var4);
	
	System.out.printf("As variaveis s�o iguais? \nResposta: %b", resultado2);
	System.out.println("");
	
	int var5 = 20, var6 = 20;
	boolean resultado3;
	
	resultado3 = (var5 != var6);
	
	System.out.printf("As variaveis s�o diferentes? \nResposta: %b", resultado3);
	System.out.println("");
	
	int var7 = 40, var8 = 20;
	boolean resultado4;
	
	resultado4 = (var7 > var8);
	
	System.out.printf("A vari�vel var7 � maior que a var8? \nResposta: %b", resultado4);
	System.out.println("");
	
	int var9 = 4, var10 = 20;
	boolean resultado5;
	
	resultado5 = (var9 < var10);
	
	System.out.printf("A vari�vel var9 � menor que a var10? \nResposta: %b", resultado5);


	}
}
