package model;

public class Carro extends Automovel{
	private int lugares;
	private int portas;
	private boolean completo;

	public Carro() {
		super();
	}
	
	public Carro(String nome, double precoPorAluguel, String cor, String chassi, String placa, String modelo, int ano,
			double motor, int lugares, int portas) {
		super(nome, precoPorAluguel, cor, chassi, placa, modelo, ano, motor);
		this.lugares = lugares;
		this.portas = portas;
		this.completo = true;
	}


	public int getLugares() {
		return lugares;
	}

	public int getPortas() {
		return portas;
	}
	
	public void naoCompleto() {
		this.completo = false;
	}
	
	public void completo() {
		this.completo = true;
	}
	
	public boolean estaCompleto() {
		return this.completo;
	}
	
	@Override
	public double valorGastos() {
		return this.getPrecoPorAluguel() * 100;
	}
	
	@Override
	public String getTipo() {
		return "Carro";
	}

}
