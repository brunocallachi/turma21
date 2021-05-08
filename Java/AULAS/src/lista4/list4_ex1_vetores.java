package lista4;

import java.util.Scanner;

public class list4_ex1_vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int A [] = {1,0,5,-2,-5,7};
		
		int soma = A[0]+A[1]+A[5];
		System.out.printf("A soma é: " + soma);
		
		A[4]=100;
		
		System.out.println();
							
		for(int x=0; x< A.length; x++)
		System.out.printf(" %d - Linha: %s \n",x+1,A[x]);
	
	}

}
