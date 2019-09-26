package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;
/*<<<<<<< HEAD
	private List<Produto> produtos;
	
=======
*/
	private List<Produto> produtos;
	private List<Produto> produtos1;
	
	
	/*public <T> List<T> alugarProduto(List<T> produto) {
		IProduto p1 = (IProduto) produto;
		this.produtos.add(p1);
		return produto;
	}
>>>>>>> 1dd5286e86939f4f73a9fb52c6cb1826553f0587
	 */
	
	public Cliente(String nome, String cpf, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		this.produtos = new ArrayList<Produto>();
	}
	
		
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	@Override
	public String toString(){
		return "CLIENTE \nNome: " +nome+ "\nCPF: " +cpf+ "\nTelefone: " +telefone+ "\nEndereco: " +endereco;
	}
}
