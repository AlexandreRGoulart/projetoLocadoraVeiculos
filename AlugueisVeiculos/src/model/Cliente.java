package model;

import java.util.List;

public class Cliente {
	private int IdCliente;
	private String nome;
	private int cpf;
	private int numeroTel;
	private String endereco;
	private List<IProduto> produtos;
	private List<IProduto> produtos1;
	
	
	public <T> List<T> alugarProduto(List<T> produto) {
		IProduto p1 = (IProduto) produto;
		this.produtos.add(p1);
		return produto;
	}
	

}
