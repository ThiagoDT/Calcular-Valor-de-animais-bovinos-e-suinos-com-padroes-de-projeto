package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;

public abstract class ValorEstadoPorco {

	protected double valorPorco;
	protected double valorLeitao;
	
	protected double faseAtualPorco(Animal animal)
	{
		if(animal.getVivencia().equals("Leitão"))
			return valorLeitao;
		if(animal.getVivencia().equals("Porco"))
			return valorPorco;
		return -1;
	}
}
