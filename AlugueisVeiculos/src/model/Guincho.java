package model;

public class Guincho extends Servico{

	public Guincho(String data, String hora, double valor) {
		super(data, hora, valor);
	}

	@Override
	public double valorGastos() {
		return getValor();
	}

	@Override
	public String getTipo() {
		return "Guincho";
	}
}
