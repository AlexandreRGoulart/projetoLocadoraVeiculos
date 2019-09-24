package model;

public abstract class Servico implements Produto{
	private String data;
	private String hora;
	private double valor;
	
	public Servico(String data, String hora, double valor) {
		this.data = data;
		this.hora = hora;
		this.valor = valor;
	}

	public String getData() {
		return data;
	}

	public String getHora() {
		return hora;
	}

	public double getValor() {
		return valor;
	}
}
