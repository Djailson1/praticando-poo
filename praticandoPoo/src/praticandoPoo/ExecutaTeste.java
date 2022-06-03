package praticandoPoo;

public class ExecutaTeste {
	public static void main(String[] args) {
		
		Carro carro = new Carro();
		
		carro.setMarca("Picanto");
		carro.setCor("Vermelho");
		carro.setPlaca("kjk7336");
		carro.setAno(2008);
		
		Passageiros passageiros1 = new Passageiros();
		
		passageiros1.setQuantPassageiros(4);
		passageiros1.setDestino("Recife");
		passageiros1.setValorKmPercorrido(2.00);
		
		Passageiros passageiros2 = new Passageiros();
		
		passageiros2.setQuantPassageiros(3);
		passageiros2.setDestino("Jaboatão");
		passageiros2.setValorKmPercorrido(1.50);
		
		carro.getListaPassageiros().add(passageiros1);
		carro.getListaPassageiros().add(passageiros2);
		
		
		
		for (Passageiros  passageiros : carro.getListaPassageiros()) {
			
			System.out.println("Carros: " + carro );
			
		}
	}

}
