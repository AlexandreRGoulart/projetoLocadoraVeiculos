package teste;
import java.util.ArrayList;
import java.util.List;

import model.Bicicleta;
import model.Carro;
import model.Cliente;
import model.Generico;
import model.Moto;
import model.Produto;
import model.Relatorio;
import model.Veiculo;

public class Teste1 {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
// Carro(nome, precoPorAluguel, cor, chassi, placa, modelo, ano, motor, lugares, portas)
// Moto(nome, precoPorAluguel, cor, chassi, placa, modelo, ano, motor, cilindradas)
// Bicicleta(nome, precoPorAluguel, cor, marchas)			
		
		System.out.println("Testando...");
		Cliente c = new Cliente("Fulano", "111.222.333-44", "987654321", "Rua1");
		
		
		/*c.addCarro("carro", 1000, "branco", "2145896", "POO-2019", "CARRO" , 2019, 1, 5, 4);*/
		
		/*	
		c.addMoto("moto", 100, "azul", "458965", "PPP-2019", "MOTO" , 2019, 1, 600);
		c.addBicicleta("bicicleta", 10, "vermelha", 4);
		c.addManutencao("12/02/2000", "13:00", 200);
		c.addLimpeza("12/02/2000", "13:00", 50);
		c.addGuincho("12/02/2000", "13:00", 100);
*/
		System.out.println(c.toString());
		System.out.println("_____________________________________\n");
		
		Generico<Produto> g = new Generico<>(new Carro("carro", 1000, "branco", "2145896", "POO-2019", "CARRO" , 2019, 1, 5, 4));
		/*public Carro(String nome, double precoPorAluguel, String cor, String chassi, String placa, String modelo, int ano,
			double motor, int lugares, int portas) {*/
		Carro ca1 = (Carro) g.getElemento();
		System.out.println(ca1.getNome());
		
		
		
		/*Dado<Pessoa> d = new Dado<>(new Pessoa(“Ze”,20));
		Pessoa x = d.getDado();*/
		Produto p2 = c.getProdutos().get(1);
		Produto p3 = c.getProdutos().get(2);
		Produto p4 = c.getProdutos().get(3);
		Produto p5 = c.getProdutos().get(4);
		Produto p6 = c.getProdutos().get(5);
		 	
		System.out.println(c.getProdutos().size());

		System.out.println("Gerando relatorio...");

		Relatorio r = new Relatorio();
		//System.out.println(r.tipoProduto(p1) + ": " + r.calcularGastos(p1));
		System.out.println(r.tipoProduto(p2) + ": " + r.calcularGastos(p2));
		System.out.println(r.tipoProduto(p3) + ": " + r.calcularGastos(p3));
		System.out.println(r.tipoProduto(p4) + ": " + r.calcularGastos(p4));
		System.out.println(r.tipoProduto(p5) + ": " + r.calcularGastos(p5));
		System.out.println(r.tipoProduto(p6) + ": " + r.calcularGastos(p6));
		
		System.out.println("_____________________________________\n");

		System.out.println("Outra forma de gerar relatorio...");
		System.out.println(new Relatorio().calcularGastos(c));

		List<Produto> prods = new ArrayList<Produto>();
		for (Produto prod : c.getProdutos()) {
			if (prod instanceof Carro) {
				Carro novoCarro = (Carro) prod;
				prods.add(novoCarro);
			} else if (prod instanceof Moto) {
				Moto novaMoto = (Moto) prod;
				prods.add(novaMoto);
			} else if (prod instanceof Bicicleta) {
				Bicicleta novaBicicleta = (Bicicleta) prod;
				prods.add(novaBicicleta);
			}
		}
	}	
}