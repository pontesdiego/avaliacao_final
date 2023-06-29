package cargo.confianca;

public enum Bonificacao {
	
	GERENTE(0.15),
	DIRETOR(0.25);
	
	protected final double valor;

	private Bonificacao(double valor) {
		this.valor = valor;
	}

	public double getValor() {
		return valor;
	}
	
	
	

}
