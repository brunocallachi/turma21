package lista3;
import java.util.Scanner;

	public class par_impar {

		public static void main(String args[]) {
		Scanner leia = new Scanner (System.in);
		int numero=0;
		int contadorPar=0;
		int contadorimpar=0;
			
		//Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)
		
	 		
		for (int x=1; x<=10; x++)
		{	
			System.out.printf("\n DIGITE UM NUMERO : " );
			numero = leia.nextInt();
						

			if ((x%2)==0) 
			{
				
				contadorPar = contadorPar+1;
				
			}
		
			if ((x%2)==1) 
			{
				contadorimpar= contadorimpar+1;
			}
			
		}
		
		System.out.printf("\nO total de numeros pares �: %d" , contadorPar);
		
		
		System.out.printf("\nO total de numeros pares �: %d" , contadorimpar);
		
		
	}
	}
