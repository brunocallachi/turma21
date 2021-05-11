package lista6;

public class Cachorro extends Animal {

	// Puxou da SuperClass...
	public Cachorro(String nome, int idade) {
		super(nome, idade);
		
	}
	
	
	@Override
	public void som () {
		System.out.println("AU AU AU AU AU AU UUUUU!!!!!! ");
	}
	
	
}	
	
	

