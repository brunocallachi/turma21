package aulasGeneratiON;

import java.util.Scanner;

public class diasDeVida {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int ano=12,diasVividos,mes=30;
		
		
		System.out.println("Quantos dias de vida você tem:  ");
		diasVividos = leia.nextInt();
		
		diasVividos = (diasVividos/mes)/ano;
		
		System.out.println("Você tem: " + diasVividos + " ano(s) de idade!! ");
	}
	
}