package funcionarios;

import java.time.LocalDate;

import funcionario.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;

public class Motoboy extends Funcionario{
	
	private String carteiraDeHabilitacao;

	public Motoboy(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario,
			EstadoCivil estadoCivil, LocalDate dataNascimento, String carteiraDeHabilitacao) {
		super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	public String getCarteiraDeHabilitacao() {
		return carteiraDeHabilitacao;
	}

	public void setCarteiraDeHabilitacao(String carteiraDeHabilitacao) {
		this.carteiraDeHabilitacao = carteiraDeHabilitacao;
	}

	@Override
	public String toString() {
		return "\n Motoboy " +
	            super.toString()
				+ "\n carteiraDeHabilitacao: " + carteiraDeHabilitacao;
	}

	@Override
	public double getSalarioFinal() {
		return super.salario;
	}
	
	

}
