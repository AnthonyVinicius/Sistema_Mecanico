package sistema;

import java.util.ArrayList;
import java.util.List;

public class AppPrincipal {
	public static void main(String[] args) {

		//______________________________________________________________________________
		Veiculo veiculo = new Veiculo();
		veiculo.setMarca("BMW");
		veiculo.setModelo("BMW");
		veiculo.setNumPlaca("15234");

		Funcionario paulo = new Funcionario();
		paulo.nome ="Paulo";
		paulo.rg = "13123";
		paulo.setDataAdmissao("13/12/2003");
		paulo.setEspecialidade("Mecânico");


		//______________________________________________________________________________
		Servico servico1 = new Servico();
		servico1.setServico("Oleo de motor");
		servico1.setValor(280.00);

		Servico servico2 = new Servico();
		servico2.setServico(" filtro de ar");
		servico2.setValor(320.00);

		Servico servico3 = new Servico();
		servico3.setServico("filtro de oléo");
		servico3.setValor(4000.00);

		List <Servico> listaDeServico1 = new ArrayList<Servico>();
		listaDeServico1.add(servico1);
		listaDeServico1.add(servico2);
		listaDeServico1.add(servico3);

		OrdemServico ordemServico1 = new OrdemServico();
		ordemServico1.setDataExp("25/09/2023");
		ordemServico1.setDataConclusao("26/09/2023");
		ordemServico1.setNumOs("151616");
		ordemServico1.setFuncionario(paulo);
		ordemServico1.setServico(listaDeServico1);

		//_____________________________________________________________________________
		Servico servico4 = new Servico();
		servico4.setServico("Oleo de motor");
		servico4.setValor(280.00);

		Servico servico5 = new Servico();
		servico5.setServico(" filtro de ar");
		servico5.setValor(320.00);

		Servico servico6 = new Servico();
		servico6.setServico("filtro de oléo");
		servico6.setValor(4000.00);

		List <Servico> listaDeServico2 = new ArrayList<Servico>();
		listaDeServico1.add(servico4);
		listaDeServico1.add(servico5);
		listaDeServico1.add(servico6);

		OrdemServico ordemServico2 = new OrdemServico();
		ordemServico2.setDataExp("25/09/2023");
		ordemServico2.setDataConclusao("26/09/2023");
		ordemServico2.setNumOs("12132");
		ordemServico2.setFuncionario(paulo);
		ordemServico2.setServico(listaDeServico2);

		List <OrdemServico> ordensServico = new ArrayList<OrdemServico>();
		ordensServico.add(ordemServico1);
		ordensServico.add(ordemServico2);

		//_____________________________________________________________________________
		Cliente cliente = new Cliente();
		cliente.nome = "Leo";
		cliente.rg = "1312";
		cliente.setTipoCliente("Fisica");
		cliente.setVeiculo(veiculo);
		cliente.veiculo.setOrdemServico(ordensServico);


		for (OrdemServico ordemServico : cliente.getVeiculo().getOrdemServico()) {
			System.out.println(cliente.getNome());
			System.out.println(cliente.getVeiculo().getModelo());
			System.out.println(ordemServico.getNumOs());
			System.out.println(ordemServico.getFuncionario().getNome());

			for (Servico ordemServico3 : ordemServico.getServico()){
				System.out.println(ordemServico3.getServico());
				System.out.println(ordemServico3.getValor());

			}
		}

	}
}
