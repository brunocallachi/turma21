package aulasGeneratiON;


import java.util.Locale;
import java.util.Scanner;

public class impar_par_if {

	public static void main(String[] args) {
		
		
		//Locale.setDefault(locale.US); - Só para colocar pontos 
		Scanner leia = new Scanner(System.in);
		int numero;
		
		
		System.out.print("Digite um numero inteiro:  ");
		numero = leia.nextInt();
				
		//se 
		
		if (numero <0) {
			System.out.println("O numero é negativo!!!");
		}
		else if ((numero%2)==0) {
			System.out.println("O numero é par!!!");
		}
		
		else if (numero==0) {
			System.out.println("O numero zero é neutro!!!");
		}
		
		
		
		
		else {
			System.out.println("O numero é impar!!!");
			
		}
	}
	
}