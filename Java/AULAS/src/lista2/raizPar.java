package lista2;

import java.util.Locale;
import java.util.Scanner;

//Fa�a um programa em que permita a entrada de um n�mero qualquer e exiba se este n�mero � par ou �mpar. 
//Se for par exiba tamb�m a raiz quadrada do mesmo; se for �mpar exiba o n�mero elevado ao quadrado.


public class raizPar {
	


		public static void main(String[] args) {
			
			
			//Locale.setDefault(locale.US); - S� para colocar pontos 
			Scanner leia = new Scanner(System.in);
			int numero;
			int raiz; 
			double quadrado = 0; 
			
			System.out.print("Digite um numero inteiro:  ");
			numero = leia.nextInt();
					
			//se 
			
			if (numero <0) {
				System.out.println("O numero � negativo!!!");
			}
			else if ((numero%2)==0) {
				
				raiz = (int) Math.sqrt(numero);
				System.out.println("O numero � par e a raiz quadrada �: " + raiz);
			}
			
			else if (numero==0) {
				System.out.println("O numero zero � neutro!!!");
			}
			
			
			else 
			{
				quadrado = numero * numero;
				System.out.println("O numero � impar e a potencia �: " + quadrado );
				
			}
			
			
		}
		
}