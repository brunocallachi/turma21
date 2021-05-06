package aulasGeneratiON;



	import java.util.Scanner;

	public class do_while {
	  	public static void main(String args[]) {
	  		
	  		Scanner leia = new Scanner (System.in);
	  		int idade;
	  		
	  		
	  		
	  		do
	  		{
	  			System.out.println("\nEntre com a sua idade: ");
		  		idade = leia.nextInt();
	  			
	  			System.out.printf("\nSua idade: %d " , idade);
	  			
	  			if (idade >=18)
	  			{
	  				System.out.printf("\nVocê é maior de idade");
	  			}
	  			
	  			else
	  			{
	  				System.out.printf("\nVocê é menor de idade");
	  			}
	  			
	  			
	  		}	
	  		
	  		while (idade>=1);
	  				
	  		
	  	}
	}		
	  		
	  		
		
		
	  
		