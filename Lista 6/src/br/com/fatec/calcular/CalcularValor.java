package br.com.fatec.calcular;

import java.util.List;

import br.com.fatec.Valor.ValorEstadual;
import br.com.fatec.animal.Animal;

public interface CalcularValor {

	double calcular(Animal animal, ValorEstadual valorEstadual);
	double calcularGrupo(List<Animal> animais, ValorEstadual valorEstadual);
}
