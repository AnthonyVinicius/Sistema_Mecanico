package sistema;

public class Servico {
	private String servico;
	private double valor;



	public Servico() {
		// TODO Auto-generated constructor stub
	}

	public Servico(String servico, double valor) {
		this.servico = servico;
		this.valor = valor;
	}

	public String getServico() {
		return servico;
	}

	public void setServico(String servico) {
		this.servico = servico;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}


}
