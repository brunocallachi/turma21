package aulasGeneratiON;

import java.util.Scanner;

public class while_repetição { 
  	public static void main(String args[]) {
  		
  		Scanner leia = new Scanner (System.in);
  		int idade;
  		
  		System.out.println("Entre com a sua idade: ");
  		idade = leia.nextInt();
  		
  		while (idade>=1)
  		{
  			System.out.printf("Sua idade: %d " , idade);
  			if (idade >=18)
  			{
  				System.out.printf("\nVocê é maior de idade");
  			}
  			
  			else
  			{
  				System.out.printf("\nVocê é menor de idade");
  			}
  			
  			System.out.printf("\nEntre com a sua idade: ");
  	  		idade = leia.nextInt();
  			
  		}
  				
  		
  		
	
  		
  		
	
	
  	}

	
	
	
	
	
	
	
	
	
}
