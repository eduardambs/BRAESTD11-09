import java.util.ArrayList;

public class Escalador {
	private String nome;
	private int idade;
	
	private ArrayList<Via> arrayVias;
	
	Escalador(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		arrayVias = new ArrayList<Via>();
	}
	
	public void adicionarVia(Via via) {
		arrayVias.add(via);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public ArrayList<Via> getArrayVias() {
		return arrayVias;
	}

	public void setArrayVias(ArrayList<Via> arrayVias) {
		this.arrayVias = arrayVias;
	}

	@Override
	public String toString() {
		return "Escalador [nome=" + nome + ", idade=" + idade + ", arrayVias=" + arrayVias + "]";
	}
	
	
	
	
	
}
