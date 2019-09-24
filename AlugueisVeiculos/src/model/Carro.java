package model;

public class Carro extends Automovel{
	private int lugares;
	private int portas;
	private boolean completo;
	
	public Carro(int lugares, int portas, boolean completo) {
		this.lugares = lugares;
		this.portas = portas;
		this.completo = completo;
	}
}
