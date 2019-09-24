package model;

public abstract class Automovel extends Veiculo{
	private String chassi;
	private String placa;
	private String modelo;
	private int ano;
	private double motor;
	
	public Automovel() {
	}
	
	public Automovel(String nome, double precoPorAluguel, String cor, String chassi, String placa, String modelo, int ano,
			double motor) {
		super(nome, precoPorAluguel, cor);
		this.chassi = chassi;
		this.placa = placa;
		this.modelo = modelo;
		this.ano = ano;
		this.motor = motor;
	}

	public String getChassi() {
		return chassi;
	}

	public String getPlaca() {
		return placa;
	}

	public String getModelo() {
		return modelo;
	}

	public int getAno() {
		return ano;
	}
	
	public double getMotor() {
		return motor;
	}
}
