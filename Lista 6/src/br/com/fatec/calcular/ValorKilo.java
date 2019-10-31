package br.com.fatec.calcular;
import java.util.List;

import br.com.fatec.Valor.ValorEstadual;
import br.com.fatec.animal.Animal;

public class ValorKilo implements CalcularValor{

	@Override
	public double calcular(Animal animal, ValorEstadual valorEstadual) {
		// TODO Auto-generated method stub
		
		double valorEstado= valorEstadual.obterValorEstado(animal);
		return animal.getPeso()*valorEstado;
	}

	@Override
	public double calcularGrupo(List<Animal> animais, ValorEstadual valorEstadual) {
		// TODO Auto-generated method stub
		double r=0;
		for(Animal animal: animais) {
			double valor = valorEstadual.obterValorEstado(animal);
			r += animal.getPeso() * valor;
		}
		return  r;
	}
}
