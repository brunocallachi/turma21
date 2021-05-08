package lista4;

import java.util.Scanner;

public class lista4_ex2_vetor6 {
	
	public static void main(String[] args) {
		//2- Faça um programa que receba 6 números inteiros e mostre: 
		//• Os números pares digitados;  
		//• A soma dos números pares digitados; 
		//• Os números ímpares digitados; 
		//• A quantidade de números ímpares digitados.
		Scanner leia = new Scanner(System.in);
		int numero[] = new int [6];
		int contadorPar=0;	
		int contadorImpar=0;
		int somaPar=0;
		int somaImpar=0;
		
				
		
		
		for (int x=0; x<numero.length; x++)
		{	
			System.out.printf("\n DIGITE UM NUMERO : " );
			numero[x] = leia.nextInt();
						

			if (numero[x]%2==0) 
			{
				
				contadorPar = contadorPar+1;
				somaPar = somaPar + numero[x];
				
							
			}
		
			else if ((numero[x]%2)==1) 
			{
				contadorImpar = contadorImpar+1;
				somaImpar = somaImpar + numero[x];
			}
			
		}
		
		System.out.printf("\nVezes de numeros pares digitados : %d" , contadorPar);
		System.out.printf("\nO total de numeros pares é: %d" , somaPar);
		
		
		System.out.printf("\nVezes de numeros pares digitados: %d" , contadorImpar );
		System.out.printf("\nO total de numeros impares é: %d" , somaImpar);
		
	}
	


		
		
	}
