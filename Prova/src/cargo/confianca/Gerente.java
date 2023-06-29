package cargo.confianca;

import java.time.LocalDate;

import funcionario.Endereco;
import funcionario.EstadoCivil;
import funcionario.Genero;
import funcionario.Setor;

public class Gerente extends CargoDeConfianca{

	public Gerente(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario,
			EstadoCivil estadoCivil, LocalDate dataNascimento) {
		super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "\n Gerente"
				+ super.toString()
				+"\n Bonificação: 25%";
	}

	@Override
	public double getSalarioFinal() {
		return super.salario + (super.salario * Bonificacao.GERENTE.valor);
	}
	
	

}
