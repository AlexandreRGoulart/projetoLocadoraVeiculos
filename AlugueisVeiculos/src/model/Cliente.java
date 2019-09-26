package model;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	private String nome;
	private String cpf;
	private String telefone;
	private String endereco;

	private List<Produto> produtos;
	/*
	-------------------------------
	private List<IProduto> produtos;
	private List<IProduto> produtos1;
	
	
	public <T> List<T> alugarProduto(List<T> produto) {
		IProduto p1 = (IProduto) produto;
		this.produtos.add(p1);
		return produto;
	}
*/	
	Generico<Veiculo> v1 = new Generico<>();
	
	public Cliente(String nome, String cpf, String telefone, String endereco) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.endereco = endereco;
		//this.produtos = new ArrayList<Produto>();
		
	}
	/*
	public void setProduto(ArrayList<? extends Veiculo> lista) {
		for
		this.produtos = ?;
		
	}*/
	
	
	
	/*Parte desse codigo vai pra classe "Funcionario" daqui...(até a linha 71+-)*/
	public void addCarro(String nome, double precoPorAluguel, String cor, String chassi, String placa, String modelo, int ano,
			double motor, int lugares, int portas) {
		Carro carro = new Carro(nome, precoPorAluguel, cor, chassi, placa, modelo, ano, motor, lugares, portas);
		this.getProdutos().add(carro);
	}

	public void addMoto(String nome, double precoPorAluguel, String cor, String chassi, String placa, String modelo, int ano,
			double motor, int cilindradas) {
		Moto moto = new Moto(nome, precoPorAluguel, cor, chassi, placa, modelo, ano, motor, cilindradas);
		this.getProdutos().add(moto);
	}

	public void addBicicleta(String nome, double precoPorAluguel, String cor, int marchas) {
		Bicicleta bicicleta = new Bicicleta(nome, precoPorAluguel, cor, marchas);
		this.getProdutos().add(bicicleta);
	}
	
	public void addManutencao(String data, String hora, double valor) {
		Manutencao manutencao = new Manutencao(data, hora, valor);
		this.getProdutos().add(manutencao);
	}
	
	public void addLimpeza(String data, String hora, double valor) {
		Limpeza limpeza = new Limpeza(data, hora, valor);
		this.getProdutos().add(limpeza);
	}

	public void addGuincho(String data, String hora, double valor) {
		Guincho guincho = new Guincho(data, hora, valor);
		this.getProdutos().add(guincho);
	}
	
	/*...até aqui*/
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
	
	public void  setProdutos(List<? extends Veiculo> produtos) {
	
		this.produtos = (List<Produto>) produtos;
		
		
	}	
	
	public List<Produto> getProdutos() {
		return produtos;
	}
	
	@Override
	public String toString(){
		return "CLIENTE \nNome: " +nome+ "\nCPF: " +cpf+ "\nTelefone: " +telefone+ "\nEndereco: " +endereco;
	}
}
