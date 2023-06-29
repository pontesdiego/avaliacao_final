package funcionarios;

import java.time.LocalDate;

import funcionario.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;

public class Engenheiro extends Funcionario{
	
	private String crea;

	public Engenheiro(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String crea) {
		super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
		this.crea = crea;
	}

	public String getCrea() {
		return crea;
	}

	public void setCrea(String crea) {
		this.crea = crea;
	}

	@Override
	public String toString() {
		return "\n Engenheiro " +
	            super.toString()
				+ "\n crea: " + crea;
	}

	@Override
	public double getSalarioFinal() {
		return super.salario;
	}
	
	

}
