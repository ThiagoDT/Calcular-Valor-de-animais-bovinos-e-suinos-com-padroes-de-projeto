package br.com.fatec.calcular;

import java.util.List;

import br.com.fatec.Valor.ValorEstadual;
import br.com.fatec.animal.Animal;
import br.com.fatec.animal.Boi;

public class ValorArroba implements CalcularValor{

	@Override
	public double calcular(Animal animal, ValorEstadual valorEstadual) {
		// TODO Auto-generated method stub
		double arroba=0;
		double valor = valorEstadual.obterValorEstado(animal);
		if(animal instanceof Boi)
		{
			arroba= (animal.getPeso()*0.5)/15;
			return (arroba*valor);
		}
		else
		{
			arroba= (animal.getPeso()/14.64);
			return arroba*valor;
		}
	}

	@Override
	public double calcularGrupo(List<Animal> animais, ValorEstadual valorEstadual) {
		// TODO Auto-generated method stub
		double arroba = 0, r=0;
		for(Animal animal: animais) {
			double valor = valorEstadual.obterValorEstado(animal);
			if(animal instanceof Boi) 
				arroba= (animal.getPeso()*0.5)/15;
			
			else 
				arroba= (animal.getPeso()/14.64);
			
			r += arroba * valor;
		}
		return  r;
	}

	

}
