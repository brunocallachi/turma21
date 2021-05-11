package lista6;

public class lista6_Pets_Teste {
	
	public static void main (String[] args) {
		
		Cachorro cachorro1 = new Cachorro("Silva", 4);
		Cavalo cavalo1 = new Cavalo ("Silver", 5);
		Preguica preguica1 = new Preguica ("Maria" , 8);
		
		
		System.out.println("\nNOME DO CACHORRO: " + cachorro1.getNome());
		System.out.println("IDADE DO CACHORRO: " + cachorro1.getIdade());
		cachorro1.som();
		
		System.out.println("\nNOME DO CAVALO: " + cavalo1.getNome());
		System.out.println("IDADE DO CAVALO: " + cavalo1.getIdade());
		cavalo1.som();
		
		System.out.println("\nNOME DA PREGUIÇA: " + preguica1.getNome());
		System.out.println("IDADE DA PREGUIÇA: " + preguica1.getIdade());
		preguica1.som();
		
				
		
		
		
		
	}
	
	
	

}
