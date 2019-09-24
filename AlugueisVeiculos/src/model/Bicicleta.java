package model;

public class Bicicleta extends Veiculo {
	private int marchas;

	public Bicicleta() {
		super();
	}
	
	public Bicicleta(String nome, double precoPorAluguel, String cor, int marchas) {
		super(nome, precoPorAluguel, cor);
		this.marchas = marchas;
	}

	public int getMarchas() {
		return marchas;
	}
	
	@Override
	public double valorGastos() {
		return this.getPrecoPorAluguel() * 100;
	}

	@Override
	public String getTipo() {
		return "Bicicleta";
	}
}
