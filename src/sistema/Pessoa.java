package sistema;

public class Pessoa {
	protected String nome;
	protected String rg;
	protected Veiculo veiculo;


	public Pessoa() {
		// TODO Auto-generated constructor stub
	}

	public Pessoa(String nome, String rg, Veiculo veiculo) {
		this.nome = nome;
		this.rg = rg;
		this.veiculo = veiculo;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Veiculo getVeiculo() {
		return veiculo;
	}
	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

}
