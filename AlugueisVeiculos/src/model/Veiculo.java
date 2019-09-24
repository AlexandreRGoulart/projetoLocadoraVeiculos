package model;

public abstract class Veiculo implements Produto{
	private String nome;
	private double precoPorAluguel;
	private String cor;
	private boolean situacao;
	
	public Veiculo() {
	}
	
	public Veiculo(String nome, double precoPorAluguel, String cor) {
		this.nome = nome;
		this.precoPorAluguel = precoPorAluguel;
		this.cor = cor;
		this.situacao = false;
	}
	
	public void disponibilizar() {
		this.situacao = false;
	}

	public void alugar() {
		this.situacao = true;
	}
	
	public boolean estaAlugado() {
		return this.situacao;
	}

	public String getCor() {
		return cor;
	}

	public String getNome() {
		return nome;
	}

	public double getPrecoPorAluguel() {
		return precoPorAluguel;
	}
}
