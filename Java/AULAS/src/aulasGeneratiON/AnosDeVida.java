package aulasGeneratiON;

import java.util.Scanner;

public class AnosDeVida {
	public static void main (String args[]) 
	{
		Scanner leia = new Scanner (System.in);
		int idade,meses=12,dias=30,idadeDias;
		final int anoAtual=2021;
		
		System.out.println("Informe sua idade: ");
		idade = leia.nextInt();
		
		idadeDias = idade*meses*dias;
		System.out.println("você ja viveu " + idadeDias + " dias da sua vida!!");
				
		
		
	}


}
