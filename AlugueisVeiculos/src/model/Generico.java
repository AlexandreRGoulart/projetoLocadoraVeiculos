package model;

import java.util.ArrayList;

public class Generico <E> {
	
	E elemento;
	
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	
	public E getElemento() {
		return elemento;
	}
	
	public E inserirElemento(ArrayList<? extends Veiculo> lista) {
		
		return this.getElemento();
	}
	public static void main (String[] args) {
	Generico<Manutencao> g = new Generico<>();
	//g.setElemento("Elemento");
	g.getElemento();
	}

}
