package aulasGeneratiON;

import java.util.*;
public class lacoCondicional {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int idade;
		String nome;
		
		System.out.printf("\nEntre com a sua idade:  ");
		idade = ler.nextInt();
		ler.nextLine();
		System.out.printf("\nEntre com o seu nome:  ");
		nome = ler.nextLine();
		

		System.out.printf("\nSeu nome:  %s", nome);
		System.out.printf("\nSua idade:  %d", idade);
		
		
		if (idade >= 18) 
		{
			System.out.print("\nVoc? ? maior de idade");
		}
		
		else if (idade >=1 && idade<18)
		{
			System.out.print("\nVoc? ? menor de idade");
		}
		
		else 
		{
			System.out.print("\nVoc? entrou com uma idade invalida");
		}
		}

}
