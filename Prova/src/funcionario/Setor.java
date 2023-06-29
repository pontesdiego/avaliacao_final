package funcionario;

public enum Setor {

	ENGENHARIA("Engenharia"),
	SAUDE("Saúde"),
	JURIDICO("Juridico"),
	RECURS0S_HUMANOS("Recursos Humanos"),
	MARKETING("Marketing"),
	OPERACOES("Operações");
	
	protected final String texto;

	private Setor(String texto) {
		this.texto = texto;
	}

	public String getTexto() {
		return texto;
	}
	
	
	
	
	
}
