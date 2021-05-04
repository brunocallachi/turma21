package exemplos;

import java.util.Scanner;

public class OiMundo {
  

	public static void main(String[] args){
		
		Scanner leia = new Scanner (System.in);
		
		String nome; // cadeia 
		int numero1 = 10;
		int numero2 = 30;
		double salario = 1992.25; //
		char op = 'S'; //caracter
		
				
		//instancia = cria um teclado
		
		System.out.println("Digite o nome: ");
		nome = leia.next();
		
		System.out.println("Digite um numero 1:  ");
		numero1 = leia.nextInt();
		
		System.out.println("Digite o numero 2: ");
		numero2 = leia.nextInt();
		
		System.out.println("Digite o Salario: ");
		salario = leia.nextDouble();
					
		System.out.println(numero1+numero2);
		System.out.println("Soma: "+ (numero1+numero2));
		
		
		
		
		
		
	}
	
}
