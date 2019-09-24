package model;

public class Relatorio {
	
	public double calcularGastos(Cliente c) {
		double gastos = 0;
		for (Produto p : c.getProdutos()) {
			gastos += p.valorGastos(); 
		}
		return gastos;
	}
	
	public String tipoProduto(Produto p) {
		return p.getTipo();
	}
	public double calcularGastos(Produto p) {
		return p.valorGastos();
	}
	
}
