package funcionario;

import java.time.LocalDate;
import java.time.Period;

import interfaces.SalarioFinal;
import util.Util;

public abstract class Funcionario implements SalarioFinal{

	protected String nome;
	protected String cpf;
	protected String rg;
	protected Endereco endereco;
	protected Setor setor;
	protected Genero genero;
	protected double salario;
	protected EstadoCivil estadoCivil;
	protected LocalDate dataNascimento;
	
	public Funcionario(String nome, String cpf, String rg, Endereco endereco, Setor setor, Genero genero,
			double salario, EstadoCivil estadoCivil, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
		this.setor = setor;
		this.genero = genero;
		this.salario = salario;
		this.estadoCivil = estadoCivil;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Setor getSetor() {
		return setor;
	}

	public void setSetor(Setor setor) {
		this.setor = setor;
	}

	public Genero getGenero() {
		return genero;
	}

	public void setGenero(Genero genero) {
		this.genero = genero;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
	public int getIdade() {
		return Period.between(dataNascimento, LocalDate.now()).getYears();
	}

	@Override
	public String toString() {
		return ""
				+ "\n nome=" + nome +
				"\n cpf=" + cpf +
				"\n rg=" + rg +
				"\n endereco: " + endereco +
				"\n setor=" + setor.texto +
				"\n genero=" + genero.texto +
				"\n salario=" + Util.formatarDinheiro(salario) +
				"\n Salario Final: " + Util.formatarDinheiro(getSalarioFinal()) +
				"\n estadoCivil=" + estadoCivil.texto +
				"\n dataNascimento=" + Util.formatarData(dataNascimento) +
				"\n Idade: " + getIdade();
	}
	
	
	
	
	
	
}
