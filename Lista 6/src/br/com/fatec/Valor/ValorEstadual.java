package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;

public interface ValorEstadual {

	double obterValorEstado(Animal animal);
	
	String mostrarInformacaoEstadual(String genero);
}
