package classes;

public abstract class Estudante {
	
	//atributos - com seguran�a 
	private int matricula;
	private String cpf;
	private double pontos;
	private boolean status;
	private String nome;
	
	
	
	// contrutores 
	public Estudante(int matricula, String cpf) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
	}

	// sobre carga de construtor = � um construtor igual s� que diferente  (incluiu o status)
	public Estudante(int matricula, String cpf, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.status = status;
	}

	public Estudante(int matricula, String cpf, double pontos, boolean status) {
		super();
		this.matricula = matricula;
		this.cpf = cpf;
		this.pontos = pontos;
		this.status = status;
	}

	// setter 
	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getPontos() {
		return pontos;
	}

	//public void setPontos(double pontos) {
		//this.pontos = pontos;
	//}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	

		
	// metodos
	
	public void adicionarNotas (double pontos) {
		this.pontos = this.pontos + pontos;
		
	}
	
	public void tirarNotas (double pontos) {
		this.pontos = this.pontos - pontos;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Estudante(String nome) {
		super();
		this.nome = nome;
	}
	
	
	
	
	//encapsulamento  - getters and setters 
	
	
	
	
	

}
