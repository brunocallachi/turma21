package lista2;

import java.util.Scanner;

//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.
public class numeroInteiroMaior {

public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int a=0, b=0, c=0;
		
		System.out.print("Digite o 1� numero: ");
		a = leia.nextInt();
		
		System.out.print("Digite o 2� numero: ");
		b = leia.nextInt();
				
		System.out.print("Digite o 3� numero: ");
		c = leia.nextInt();
		
		
			if (a>=b && a>=c && b>=c )
			{
			System.out.println("A ordem decrescente �:  " +a+ "/" +b+ "/" +c);
			}
			
			else if(a>=b && a>=c && c>=b)
			{
				System.out.println("A ordem decrescente �:  " +a+ "/" +c+ "/" +b);
			}
			else if(b>=a && b>=c && a>=c)
			{
				System.out.println("A ordem decrescente �:  " +b+ "/" +a+ "/" +c);
			}
			else if(b>=a && b>=c && c>=a) 
			{
				System.out.println("A ordem decrescente �:  " +b+ "/" +c+ "/" +a);
			}
			else if(c>=a && c>=b && a>=b) 
			{
				System.out.println("A ordem decrescente �:  " +c+ "/" +a+ "/" +b);
			}
			else if(c>=a && c>=b && b>=a) 
			{
				System.out.println("A ordem decrescente �:  " +c+ "/" +b+ "/" +a);
			}
			
	}
}