package model;

public enum OpcoesProdutos {
	CARRO("1 - Carro"), MOTO("2 - Moto"), BICICLETA("3 - Bicicleta"), 
	MANUTENCAO("4 - Manutencao"), LIMPEZA("5 - Limpeza"), GUINCHO("6 - Guincho");
	
	private final String opcao;
	OpcoesProdutos(String valorOpcao) {
		opcao = valorOpcao;
	}
	public String getOpcao() {
		return opcao;
	}
}
 