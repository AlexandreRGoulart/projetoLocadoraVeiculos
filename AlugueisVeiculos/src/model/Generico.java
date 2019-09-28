package model;

import java.util.ArrayList;

public class Generico <E extends Veiculo> {
	
	private E elemento;
	
	
	/*Construtor*/
	public Generico(E e) {
		this.elemento = e;
	}
	/*Set*/
	public void setElemento(E elemento) {
		this.elemento = elemento;
	}
	/*Get*/
	public E getElemento() {
		return elemento;
	}
	
	/*AJUDA AQUI 
	public E inserirElemento(ArrayList<? extends Veiculo> lista) {
		
		return this.getElemento();
	}
	
	!!!!!!!!!!!*/
	
	
	/*
	public static void main (String[] args) {
	Generico<Manutencao> g = new Generico<>();
	//g.setElemento("Elemento");
	g.getElemento();
	}
	 */
}
