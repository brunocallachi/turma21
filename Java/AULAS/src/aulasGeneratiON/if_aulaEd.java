package aulasGeneratiON;

import java.util.Scanner;

public class if_aulaEd {
	public static void main (String args[])
		{
			Scanner leia = new Scanner(System.in);
			int N; 
			
			
			//tudo é comando escreva
			System.out.println("Digite um numero: ");
			N = leia.nextInt();
			
			//final da leitura da variavel N
			
			if(N > 100)
			{
			System.out.println("O numero é: " + N);
			}
			
					
			
			if (N < 100)
			{
			System.out.println("O numero equivale a : " + (N=0));
			}
		}
}