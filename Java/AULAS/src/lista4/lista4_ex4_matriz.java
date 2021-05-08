package lista4;

import java.util.Scanner;

public class lista4_ex4_matriz {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		
		double matriz1 [][] = new double[2][2];
		double matriz2 [][] = new double[2][2];
		double matrizSoma [][] = new double[2][2];
		char op;
		double auxConstante = 0;
		
		for(int linha=0; linha<matriz1.length; linha++ ) {
			for (int coluna=0; coluna<2; coluna++ ) {
				System.out.printf("Valor da Matraiz1 na posição %d - %d: ", linha , coluna);
				matriz1[linha][coluna]=leia.nextDouble();
				System.out.printf("Valor da Matraiz2 na posição %d - %d: ", linha , coluna);
				matriz2[linha][coluna]=leia.nextDouble();
				coluna=0; coluna<2; coluna++;
									
			}
		}
		
		do {
			System.out.println("\n(1)  somar as duas matrizes /n(2)subtrair a primeira matriz da segunda \n(3)adicionar uma constante as duas matrizes \n(3) imprimir as matrizes");
			System.out.println("Digite o numero da sua escolha ");
			
			op=leia.next().charAt(0);
			switch (op)
			{
				case 1:
				{
					for (int linha=0; linha<2; linha++ );{
						for (coluna=0; coluna<2; coluna++);
							matrizSoma[linha][coluna]= matriz1[linha][coluna]+matriz2[linha][coluna];
					}
				}
				break ;
				case 2:
				break;
				case 3:
				break;
				case 4:
				break;
				
				defult 
			}
		}
		
			
		System.out.println("fim do programa !!!");
			
		
		
	}

}
