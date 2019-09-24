package teste;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cliente;
import model.OpcoesProdutos;
import model.Produto;
import model.Relatorio;

public class Teste2 {
	public static void main(String[] args) {	
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("INSERIR CLIENTE");
		System.out.println("Nome");
		String novoNome = entrada.nextLine();
		System.out.println("CPF");
		String novoCpf = entrada.nextLine();
		System.out.println("Telefone");
		String novoTelefone = entrada.nextLine();
		System.out.println("Endereco");
		String novoEndereco = entrada.nextLine();
		Cliente c = new Cliente(novoNome, novoCpf, novoTelefone, novoEndereco);
		
		System.out.println(c.toString());
		
		System.out.println("_____________________________________\n");

		System.out.println("INSERIR PRODUTO");
		
		System.out.println("Tipos de produto");
		for (OpcoesProdutos op : OpcoesProdutos.values()) {
		      System.out.println(op.getOpcao());
		}
		
		System.out.println("INSERIR CARRO");
		System.out.println("Nome");
		String novoNomeVeiculo1 = entrada.nextLine();
		
		System.out.println("Preço por aluguel");
		double novoPrecoPorAluguel1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Cor");
		String novaCor1 = entrada.nextLine();
		
		System.out.println("Chassi");
		String novoChassi1 = entrada.nextLine();
		
		System.out.println("Placa");
		String novaPlaca1 = entrada.nextLine();
		
		System.out.println("Modelo");
		String novoModelo1 = entrada.nextLine();
		
		System.out.println("Ano");
		int novoAno1 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Motor");
		double novoMotor1 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Quantidade Lugares");
		int novoLugares = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Quantidade Portas");
		int novoPortas = entrada.nextInt();
		entrada.nextLine();

		c.addCarro(novoNomeVeiculo1, novoPrecoPorAluguel1, novaCor1, novoChassi1, novaPlaca1, novoModelo1, novoAno1, novoMotor1,
				novoLugares, novoPortas);
		
		System.out.println("_____________________________________\n");

		System.out.println("INSERIR MOTO");
		System.out.println("Nome");
		String novoNomeVeiculo2 = entrada.nextLine();
		
		System.out.println("Preço por aluguel");
		double novoPrecoPorAluguel2 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Cor");
		String novaCor2 = entrada.nextLine();
		
		System.out.println("Chassi");
		String novoChassi2 = entrada.nextLine();
		
		System.out.println("Placa");
		String novaPlaca2 = entrada.nextLine();
		
		System.out.println("Modelo");
		String novoModelo2 = entrada.nextLine();
		
		System.out.println("Ano");
		int novoAno2 = entrada.nextInt();
		entrada.nextLine();
		
		System.out.println("Motor");
		double novoMotor2 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Cilindradas");
		int novaCilindradas = entrada.nextInt();
		entrada.nextLine();

		c.addMoto(novoNomeVeiculo2, novoPrecoPorAluguel2, novaCor2, novoChassi2, novaPlaca2, novoModelo2, novoAno2, novoMotor2,
				novaCilindradas);

		System.out.println("_____________________________________\n");

		System.out.println("INSERIR BICICLETA");
		System.out.println("Nome");
		String novoNomeVeiculo3 = entrada.nextLine();
		
		System.out.println("Preço por aluguel");
		double novoPrecoPorAluguel3 = entrada.nextDouble();
		entrada.nextLine();
		
		System.out.println("Cor");
		String novaCor3 = entrada.nextLine();
		
		System.out.println("Marchas");
		int novoMarchas = entrada.nextInt();
		entrada.nextLine();
		
		c.addBicicleta(novoNomeVeiculo3, novoPrecoPorAluguel3, novaCor3, novoMarchas);

		System.out.println("_____________________________________\n");
		System.out.println("_____________________________________\n");

		System.out.println("INSERIR SERVICO");
		System.out.println("INSERIR MANUTENCAO");
		System.out.println("Data");
		String novaData1 = entrada.nextLine();
		
		System.out.println("Hora");
		String novaHora1 = entrada.nextLine();
		
		System.out.println("Valor");
		double novoValor1 = entrada.nextDouble();
		entrada.nextLine();

		c.addManutencao(novaData1, novaHora1, novoValor1);
		
		System.out.println("_____________________________________\n");

		System.out.println("INSERIR LIMPEZA");
		System.out.println("Data");
		String novaData2 = entrada.nextLine();
		
		System.out.println("Hora");
		String novaHora2 = entrada.nextLine();
		
		System.out.println("Valor");
		double novoValor2 = entrada.nextDouble();
		entrada.nextLine();

		c.addLimpeza(novaData2, novaHora2, novoValor2);
		
		System.out.println("_____________________________________\n");

		System.out.println("INSERIR MANUTENCAO");
		System.out.println("Data");
		String novaData3 = entrada.nextLine();
		
		System.out.println("Hora");
		String novaHora3 = entrada.nextLine();
		
		System.out.println("Valor");
		double novoValor3 = entrada.nextDouble();
		entrada.nextLine();
		
		c.addGuincho(novaData3, novaHora3, novoValor3);

		System.out.println("_____________________________________\n");
		System.out.println("_____________________________________\n");

		System.out.println(c.getProdutos());
		
		Produto p1 = c.getProdutos().get(0);
		Produto p2 = c.getProdutos().get(1);
		Produto p3 = c.getProdutos().get(2);
		Produto p4 = c.getProdutos().get(3);
		Produto p5 = c.getProdutos().get(4);
		Produto p6 = c.getProdutos().get(5);

		System.out.println(c.getProdutos().size());
		
		System.out.println("_____________________________________\n");
		System.out.println("_____________________________________\n");

		System.out.println("Gerando relatorio...");
		System.out.println("Gastos por produto...");

		Relatorio r = new Relatorio();
		System.out.println(r.tipoProduto(p1) + ": " + r.calcularGastos(p1));
		System.out.println(r.tipoProduto(p2) + ": " + r.calcularGastos(p2));
		System.out.println(r.tipoProduto(p3) + ": " + r.calcularGastos(p3));
		System.out.println(r.tipoProduto(p4) + ": " + r.calcularGastos(p4));
		System.out.println(r.tipoProduto(p5) + ": " + r.calcularGastos(p5));
		System.out.println(r.tipoProduto(p6) + ": " + r.calcularGastos(p6));

		System.out.println("Gastos por cliente...");
		System.out.println(new Relatorio().calcularGastos(c));
	}	
}