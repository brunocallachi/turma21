package aulasGeneratiON;

import java.util.Scanner;

public class lacoPara_for {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner (System.in);
		int numero=1, somatorio=0, media=0, totalValoresLidos=0, qtdVezes=0;
		
			
		while (numero != 0)
			{
					System.out.println("Informe um numero positivo: ");
					numero = leia.nextInt();

					somatorio = somatorio + numero;

					if (numero>0)
					{
						totalValoresLidos++;
					}
					
					else {
						break;	
					}

				media = somatorio / totalValoresLidos;
				
				}

				System.out.printf("\nA soma dos valores informados � de: %d", somatorio);
				System.out.printf ("\nA quantidade de vezes que foram informados numeros !=0 foi de: %d ",totalValoresLidos, " vezes");
				System.out.printf("\nA m�dia dos numeros informados �: %d", media);
				 
			}
		}
