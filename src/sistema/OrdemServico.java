package sistema;

import java.util.List;

public class OrdemServico {
	private String numOs;
	private String dataExo;
	private String dataConclusao;
	private Funcionario funcionario;
	private List <Servico> servico;

	public OrdemServico() {
		// TODO Auto-generated constructor stub
	}

	public OrdemServico(String numOs, String dataExp, String dataConclusao, Funcionario funcionario,
			List<Servico> servico) {
		this.numOs = numOs;
		this.dataExo = dataExp;
		this.dataConclusao = dataConclusao;
		this.funcionario = funcionario;
		this.servico = servico;

	}
	public String getNumOs() {
		return numOs;
	}
	public void setNumOs(String numOs) {
		this.numOs = numOs;
	}
	public String getDataExp() {
		return dataExo;
	}
	public void setDataExp(String dataExp) {
		this.dataExo = dataExp;
	}
	public String getDataConclusao() {
		return dataConclusao;
	}
	public void setDataConclusao(String dataConclusao) {
		this.dataConclusao = dataConclusao;
	}
	public Funcionario getFuncionario() {
		return funcionario;
	}
	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}
	public List<Servico> getServico() {
		return servico;
	}
	public void setServico(List<Servico> servico) {
		this.servico = servico;
	}


}
