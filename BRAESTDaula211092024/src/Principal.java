
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Montanha paodeacucar = new Montanha("Pão de açucar", "Rio de Janeiro");
		Montanha morroDaUrca = new Montanha("Morro da Urca", "Rio de Janeiro");
		
		
		Via viaItalianos = new Via("Italianos", 200);
		Via saoBento	 = new Via("São Bento", 320);
		Via corDeBurroQuandoFoge = new Via("corDeBurroQuandoFoge", 80);
		Via vermelho	= new Via ("Vermelho", 120);
		
		
		Escalador flavioDaflon = new Escalador("Flavio Daflon", 50);
		
		
		flavioDaflon.adicionarVia(viaItalianos);
		flavioDaflon.adicionarVia(saoBento);
		flavioDaflon.adicionarVia(vermelho);
		
		saoBento.setMontanha(paodeacucar);
		viaItalianos.setMontanha(paodeacucar);
		
		System.out.println(flavioDaflon);
		
		
		
		
	}

}
