package cargo.confianca;

import java.time.LocalDate;

import funcionario.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;

public abstract class CargoDeConfianca extends Funcionario{
	
	protected Bonificacao bonificacao;

	public CargoDeConfianca(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero,
			double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
		super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
	}

	public Bonificacao getBonificacao() {
		return bonificacao;
	}

	public void setBonificacao(Bonificacao bonificacao) {
		this.bonificacao = bonificacao;
	}

	@Override
	public String toString() {
		return "\n" + super.toString();
	}
	
	
	
	
	
	
	

}
