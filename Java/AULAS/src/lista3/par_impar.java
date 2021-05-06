package lista3;
import java.util.Scanner;

	public class par_impar {

		public static void main(String args[]) {
		Scanner leia = new Scanner (System.in);
		int numero=0;
		int contadorPar=0;
		int contadorimpar=0;
			
		//Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
		
	 		
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
		
		System.out.printf("\nO total de numeros pares é: %d" , contadorPar);
		
		
		System.out.printf("\nO total de numeros pares é: %d" , contadorimpar);
		
		
	}
	}
