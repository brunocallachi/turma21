package aulasGeneratiON;

import java.util.Scanner;

public class genero_nome_idade {
	public static void main(String[] args) {
		
		int anoNascimento=0;
		String nome="";
		char genero;
		int idade=0;
		
		Scanner leia= new Scanner(System.in);
		
		System.out.println("Digite o seu nome:");
		nome = leia.next();
		
		System.out.println("Digite o seu ano de nascimento:");
		anoNascimento = leia.nextInt();
		
		
		
		System.out.println("Como voc� identifica: M-masculino; F- Feminino; O-Outro");
		genero= leia.next().charAt(0);
		
		idade=2021-anoNascimento;
		
		System.out.printf("Nome: %s\n idade: %d\n genero: %c", nome,idade,genero);

		
	
			
	}

}



