package lista4;

import java.util.Scanner;

public class lista4_ex2_vetor6 {
	
	public static void main(String[] args) {
		//2- Fa�a um programa que receba 6 n�meros inteiros e mostre: 
		//� Os n�meros pares digitados;  
		//� A soma dos n�meros pares digitados; 
		//� Os n�meros �mpares digitados; 
		//� A quantidade de n�meros �mpares digitados.
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
		System.out.printf("\nO total de numeros pares �: %d" , somaPar);
		
		
		System.out.printf("\nVezes de numeros pares digitados: %d" , contadorImpar );
		System.out.printf("\nO total de numeros impares �: %d" , somaImpar);
		
	}
	


		
		
	}
