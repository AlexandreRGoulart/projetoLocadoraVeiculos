package model;

public class Manutencao extends Servico {

	public Manutencao(String data, String hora, double valor) {
		super(data, hora, valor);
	}

	@Override
	public double valorGastos() {
		return getValor();
	}

	@Override
	public String getTipo() {
		return "Manutençao";
	}

}
