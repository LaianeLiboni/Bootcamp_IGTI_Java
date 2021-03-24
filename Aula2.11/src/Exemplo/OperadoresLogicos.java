package Exemplo;

public class OperadoresLogicos {

	public static void main(String[] args) {
		
		boolean ult3EmprestQuitadosPrazo, possuiRendaComprovada, clienteDezEstrelas, restricaoCredito;
		
		ult3EmprestQuitadosPrazo = false;
		possuiRendaComprovada = true;
		clienteDezEstrelas = false;
		restricaoCredito = false;
		
		boolean concederEmprestimo = (ult3EmprestQuitadosPrazo && possuiRendaComprovada || clienteDezEstrelas) && !restricaoCredito;
		System.out.printf("Empréstimo concedido? \n%b", concederEmprestimo);

	}

}
