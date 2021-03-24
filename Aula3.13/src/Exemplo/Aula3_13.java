package Exemplo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Aula3_13 {

	public static void main(String[] args) {
		
			try {
			FileReader arquivo = new FileReader("C:\\Users\\laiane\\arquivoDados.txt");
			BufferedReader lerArquivo = new BufferedReader(arquivo);
			
			String linha;
			linha = lerArquivo.readLine();
			
			while (linha != null) {
				String[] dadosCliente = new String[5];
				dadosCliente = linha.split(";");
				
				System.out.printf("Código do cliente: %s\n" +
				"Nome do cliente: %s.\n" +
						"Endereço: %s.\n" + "Estado: %s.\n" + "Estado Civil: %s.\n", 
						dadosCliente[0], dadosCliente[1], dadosCliente[2], 
						dadosCliente[3], dadosCliente[4]);
				
				
				linha = lerArquivo.readLine();
				System.out.println(" ");
			}
			arquivo.close();
			lerArquivo.close();
			
		}catch(IOException e) {
			System.out.println("Erro lendo dados: " + e.getMessage());
		}
	}

}
