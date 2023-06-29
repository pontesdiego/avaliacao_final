package cargo.confianca;

import java.time.LocalDate;

import funcionario.Endereco;
import funcionario.EstadoCivil;
import funcionario.Funcionario;
import funcionario.Genero;
import funcionario.Setor;
import interfaces.Contratacao;

public class Diretor extends CargoDeConfianca implements Contratacao{
	
	private final double PREMIO = 0.3;

	public Diretor(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero, double salario,
			EstadoCivil estadoCivil, LocalDate dataNascimento) {
		super(nome, cpf, rg, endereco, setor, genero, salario, estadoCivil, dataNascimento);
		// TODO Auto-generated constructor stub
	}

	public double getPREMIO() {
		return PREMIO;
	}

	@Override
	public String toString() {
		return "\n Diretor" +
	            super.toString()
				+ "\n PREMIO = 30%"
				+"\n Bonificação: 25%";
	}

	@Override
	public double getSalarioFinal() {
		salario += (super.salario * Bonificacao.DIRETOR.valor);
		return  salario + (super.salario * PREMIO);
	}

	@Override
	public void admitir(Funcionario funcionario) {
		System.out.println("Funcionario Contratado: " + funcionario);
		
	}

	@Override
	public void demitir(Funcionario funcionario) {
		System.out.println("Funcionario Demitido: " + funcionario);
		
	}
	
	
	

}
