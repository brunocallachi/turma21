package sessao1;


import java.util.Scanner;

public class horasSegundos {
public static void main (String args[]) {
		
		Scanner leia = new Scanner (System.in);
		int segundo=3600,horas=1,minutos=60;
		
		
		System.out.println("Quantos segundos tem o evento:   ");
		horas = leia.nextInt();
		
		horas = (segundo/horas);
		minutos = (horas*60);
		
		
		System.out.print(" O evento tem " + horas + " de hora(s)!! " + minutos + " minutos e "+ segundo + " segundos" );
		
	
		
		}
}



