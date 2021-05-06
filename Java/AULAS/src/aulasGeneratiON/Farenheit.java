package aulasGeneratiON;

import java.util.Scanner;


public class Farenheit {
	public static void main(String[] args) 
	{
		
		//instanciar = criar teclado 
				Scanner leia = new Scanner(System.in);
				//variaveis 
				double farenheit, grausResultado;
				String nome;
				
				//entrada
				System.out.printf("Informe a temperatura da sua cidade em Farenheit: ");
				farenheit = leia.nextDouble();
				
				System.out.printf("Informe seu nome: ");
				nome = leia.next();
				
				//processamento
				grausResultado = (farenheit - 32) / 1.8;
				
				//saida
				System.out.println(nome+"\nA conversão do valor da temperatura de Farenheit para Celsius é: "+Math.round(grausResultado)+ "°C");
				
				leia.close();
				
			}
			
		}

	





