package main;

import java.time.LocalDate;
import java.time.Month;

import cargo.confianca.Diretor;
import cargo.confianca.Gerente;
import funcionario.Endereco;
import funcionario.EstadoCivil;
import funcionario.Genero;
import funcionario.Setor;
import funcionario.UnidadeFederativa;
import funcionarios.Engenheiro;
import funcionarios.Motoboy;

public class Main {

	public static void main(String[] args) {
		
		Diretor diretor = new Diretor("Diego", "89363755486", "41421243425",
				new Endereco("Vista alegre", "768", "Bloococs", "86939368", "Salvador", UnidadeFederativa.BAHIA), Setor.RECURS0S_HUMANOS,
				Genero.MASCULINO, 1000, EstadoCivil.SEPARADO, LocalDate.of(2005, Month.APRIL, 30));
		
		Engenheiro engenheiro = new Engenheiro("Carlos", "89363755486", "41421243425",
				new Endereco("Vista alegre", "768", "Bloococs", "666", "Curuzu", UnidadeFederativa.SAO_PAULO), Setor.OPERACOES,
				Genero.FEMININO, 1000, EstadoCivil.SOLTEIRO, LocalDate.of(2000, Month.APRIL, 18), "78325255");
		
		Motoboy motoboy = new Motoboy("Vidal", "89363755486", "41421243425",
				new Endereco("Vista alegre", "768", "Bloococs", "86939368", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO), Setor.OPERACOES,
				Genero.FEMININO, 1000, EstadoCivil.DIVORCIADO, LocalDate.of(2000, Month.APRIL, 18), "78325255");
		
		Gerente gerente = new Gerente("Tido", "89363755486", "41421243425",
				new Endereco("Buraquinho", "666", "Blosfcs", "748789", "Tamandua", UnidadeFederativa.BAHIA), Setor.RECURS0S_HUMANOS,
				Genero.FEMININO, 1000, EstadoCivil.DIVORCIADO, LocalDate.of(2000, Month.APRIL, 18));
		
		System.out.println(diretor);
		
		System.out.println("");
		
		diretor.demitir(motoboy);
		
		System.out.println("");
		
		System.out.println(gerente);
		
		System.out.println("");
		
		System.out.println(engenheiro);
		
		

	}

}
