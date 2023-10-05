package sistema;

public class Cliente extends Pessoa{
	private String tipoCliente;


	public Cliente() {
		// TODO Auto-generated constructor stub
	}


	public Cliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

}
