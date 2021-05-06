package lista2;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
//Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.


public class raizPar {
	


		public static void main(String[] args) {
			
			
			//Locale.setDefault(locale.US); - Só para colocar pontos 
			Scanner leia = new Scanner(System.in);
			int numero;
			int raiz; 
			double quadrado = 0; 
			
			System.out.print("Digite um numero inteiro:  ");
			numero = leia.nextInt();
					
			//se 
			
			if (numero <0) {
				System.out.println("O numero é negativo!!!");
			}
			else if ((numero%2)==0) {
				
				raiz = (int) Math.sqrt(numero);
				System.out.println("O numero é par e a raiz quadrada é: " + raiz);
			}
			
			else if (numero==0) {
				System.out.println("O numero zero é neutro!!!");
			}
			
			
			else 
			{
				quadrado = numero * numero;
				System.out.println("O numero é impar e a potencia é: " + quadrado );
				
			}
			
			
		}
		
}