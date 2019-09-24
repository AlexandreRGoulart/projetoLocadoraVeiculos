package model;

public class Moto extends Automovel{
	private int cilindradas;


	public Moto() {
		super();
	}

	public Moto(String nome, double precoPorAluguel, String cor, String chassi, String placa, String modelo, int ano,
			double motor, int cilindradas) {
		super(nome, precoPorAluguel, cor, chassi, placa, modelo, ano, motor);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	@Override
	public double valorGastos() {
		return this.getPrecoPorAluguel() * 100;
	}

	@Override
	public String getTipo() {
		return "Moto";
	}

}
