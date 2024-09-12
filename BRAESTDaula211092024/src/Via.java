
public class Via {
	private String nome;
	private Integer distancia;
	private Montanha montanha;
	
	
		Via(String nome, Integer distancia){
			this.nome = nome;
			this.distancia = distancia;
			
		}


		public String getNome() {
			return nome;
		}


		public void setNome(String nome) {
			this.nome = nome;
		}


		public Integer getDistancia() {
			return distancia;
		}


		public void setDistancia(Integer distancia) {
			this.distancia = distancia;
		}


		public Montanha getMontanha() {
			return montanha;
		}


		public void setMontanha(Montanha montanha) {
			this.montanha = montanha;
		}


		@Override
		public String toString() {
			return "Via [nome=" + nome + ", distancia=" + distancia + ", montanha=" + montanha + "]";
		}
		
		
		
		
	
	
}
