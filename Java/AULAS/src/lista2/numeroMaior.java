package lista2;
//Fa�a um programa que receba tr�s inteiros e diga qual deles � o maior.

import java.util.Scanner;

public class numeroMaior {
	
public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int a=0;
		int b=0;
		int c=0;
			
		System.out.print("Digite o primeiro numero: ");
		a = leia.nextInt();
		
		System.out.print("Digite o segundo numero: ");
		b = leia.nextInt();
		
		System.out.print("Digite o terceiro numero: ");
		c = leia.nextInt();
		
		
		if (a>b && a>c) 
		{
			System.out.println("O maior n�mero �:  " +a);
		}
		
		if (b>a && b>c)
		{
			System.out.println("O maior n�mero �:  " +b);
		}
		
		if (c>a && c>a)
		{
			System.out.println("O maior n�mero �:  " +c);
		}
}	

}
