package classes;

public class Basico extends Estudante {

	private int diaAniversario;

	public Basico(int matricula, String cpf, boolean status, int diaAniversario) {
		super(matricula, cpf, status);
		this.diaAniversario = diaAniversario;
	}
	//sobrecarga 
	public Basico(int matricula, String cpf, double pontos, boolean status, int diaAniversario) {
		super(matricula, cpf, pontos, status);
		this.diaAniversario = diaAniversario;
	}
	
	//get 
	public int getDiaAniversario() {
		return diaAniversario;
	}
	
	//set
	public void setDiaAniversario(int diaAniversario) {
		this.diaAniversario = diaAniversario;
	}
	
	public void bonusAniversario (int dia) {
		if (diaAniversario == dia) {
			super.adicionarNotas((super.getPontos()*0.1));
		}
		
		
	}
	
	
	
	
	
	
	
	
}
