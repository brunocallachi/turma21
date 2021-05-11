package exemplos;

import java.util.Scanner;

import metodos.pessoa;

public class clienteOrientacao {
	public static void main(String[] args) {
		Scanner leia=new Scanner(System.in);
		pessoa cliente=new pessoa();
		char respostaVivo=' ';
		
		
		System.out.println("Digite o seu nome:");
		cliente.nome=leia.next();
		System.out.println("Digite o seu ano de nascimento:");
		cliente.anonascimento=leia.nextInt();
		System.out.println("Digite o seu genero(M/F/O)");
		cliente.genero=leia.next().toUpperCase().charAt(0);
		System.out.println("Você está vivo ou morto?(V/M");
		respostaVivo=leia.next().toUpperCase().charAt(respostaVivo);
		
		
	}
}	