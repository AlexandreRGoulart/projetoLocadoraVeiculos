package model;

public class Limpeza extends Servico{

	public Limpeza(String data, String hora, double valor) {
		super(data, hora, valor);
	}

	@Override
	public double valorGastos() {
		return getValor();
	}

	@Override
	public String getTipo() {
		return "Limpeza";
	}
}
