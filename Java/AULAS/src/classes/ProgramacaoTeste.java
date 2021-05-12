package classes;

import java.util.Scanner;

public class ProgramacaoTeste {
	
	public static void main(String[] args) {
		
			
		Scanner leia = new Scanner (System.in);
		
		System.out.print("Digite o nome do Aluno: ");
		String nome = leia.next().toUpperCase();
		
		System.out.print("Digite o numero da matricula: ");
		int matricula = leia.nextInt();
		
		System.out.print("Digite o CPF: ");
		String cpf = leia.next();
		
		System.out.print("Digite a nota inicial: ");
		double nota = leia.nextDouble();
		
		Graduacao graduacao1 = new Graduacao (matricula, cpf);
		graduacao1.adicionarNotas(10);
		

		char op= ' ';
		System.out.print("\nNota da graduacao1: " + graduacao1.getPontos());
		for (int x=1; x<=10; x++) {
			
			System.out.print("\nInforme o valor ");
			nota = leia.nextDouble();
			
			System.out.print("Digite 1 para adicionar ou 2 para debitar ");
			op = leia.next().charAt(0);
			
			if (op == '1') {
				graduacao1.adicionarNotas(nota);
			}
			
			else 
			{
				graduacao1.tirarNotas(nota);
			}
			
			System.out.println("\nValor atual do bonus " + graduacao1.getBonus());
			System.out.println("\nNovo saldo de nota de graduacao1 " + graduacao1.getPontos());
			
		}
								
		
	}
}
