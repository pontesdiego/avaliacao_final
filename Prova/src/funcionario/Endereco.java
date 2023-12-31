package funcionario;

public class Endereco {
	
	protected String logadouro;
	protected String numero;
	protected String complemento;
	protected String cep;
	protected String cidade;
	protected UnidadeFederativa uf;
	
	
	public Endereco(String logadouro, String numero, String complemento, String cep, String cidade,
			UnidadeFederativa uf) {
		super();
		this.logadouro = logadouro;
		this.numero = numero;
		this.complemento = complemento;
		this.cep = cep;
		this.cidade = cidade;
		this.uf = uf;
	}


	public String getLogadouro() {
		return logadouro;
	}


	public void setLogadouro(String logadouro) {
		this.logadouro = logadouro;
	}


	public String getNumero() {
		return numero;
	}


	public void setNumero(String numero) {
		this.numero = numero;
	}


	public String getComplemento() {
		return complemento;
	}


	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}


	public String getCep() {
		return cep;
	}


	public void setCep(String cep) {
		this.cep = cep;
	}


	public String getCidade() {
		return cidade;
	}


	public void setCidade(String cidade) {
		this.cidade = cidade;
	}


	public UnidadeFederativa getUf() {
		return uf;
	}


	public void setUf(UnidadeFederativa uf) {
		this.uf = uf;
	}


	@Override
	public String toString() {
		return ""
				+ "\n logadouro=" + logadouro +
				"\n numero=" + numero +
				"\n complemento=" + complemento +
				"\n cep=" + cep +
				"\n cidade=" + cidade +
				"\n uf=" + uf.texto + "(" + uf.sigla + ")";
	}
	
	
	
	

}
