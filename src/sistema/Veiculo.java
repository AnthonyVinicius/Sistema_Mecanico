package sistema;

import java.util.List;

public class Veiculo {
	private String numPlaca;
	private String marca;
	private String modelo;
	private List <OrdemServico> ordemServico;


	public Veiculo() {
		// TODO Auto-generated constructor stub
	}

	public Veiculo(String numPlaca, String marca, String modelo, List<OrdemServico> ordemServico) {
		this.numPlaca = numPlaca;
		this.marca = marca;
		this.modelo = modelo;
		this.ordemServico = ordemServico;
	}

	public String getNumPlaca() {
		return numPlaca;
	}
	public void setNumPlaca(String numPlaca) {
		this.numPlaca = numPlaca;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public List<OrdemServico> getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(List<OrdemServico> ordemServico) {
		this.ordemServico = ordemServico;
	}

}

