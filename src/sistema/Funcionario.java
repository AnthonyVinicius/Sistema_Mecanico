package sistema;

public class Funcionario extends Pessoa {
	private String especialidade;
	private String dataAdmissao;

	public Funcionario(String especialidade, String dataAdmissao) {
		this.especialidade = especialidade;
		this.dataAdmissao = dataAdmissao;
	}

	public Funcionario() {
		// TODO Auto-generated constructor stub
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public String getDataAdmissao() {
		return dataAdmissao;
	}

	public void setDataAdmissao(String dataAdmissao) {
		this.dataAdmissao = dataAdmissao;
	}


}

