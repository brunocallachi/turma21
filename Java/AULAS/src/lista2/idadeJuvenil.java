package lista2;

import java.util.Scanner;



public class idadeJuvenil {
public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int idade;
		
		System.out.print("Qual � a sua idade? ");
		idade = leia.nextInt();
		
		
		
		if (idade >=10 && idade <=14)
		{
			System.out.print("Sua catogoria � infantil !!");
		}
		else if (idade >=15 && idade <=17)
		{
		System.out.print("Sua categoria � juvenil !!");
		}
		else if (idade >=18 && idade <=25)
		{
		System.out.print("Sua categoria � adulto !!");
		}
	}
}
		