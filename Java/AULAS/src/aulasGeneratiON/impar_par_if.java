package aulasGeneratiON;


import java.util.Locale;
import java.util.Scanner;

public class impar_par_if {

	public static void main(String[] args) {
		
		
		//Locale.setDefault(locale.US); - S� para colocar pontos 
		Scanner leia = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Digite um numero inteiro:  ");
		numero = leia.nextInt();
				
		//se 
		
		if (numero <0) {
			System.out.println("O numero � negativo!!!");
		}
		else if ((numero%2)==0) {
			System.out.println("O numero � par!!!");
		}
		
		else if (numero==0) {
			System.out.println("O numero zero � neutro!!!");
		}
		
		
		
		
		else {
			System.out.println("O numero � impar!!!");
			
		}
	}
	
}