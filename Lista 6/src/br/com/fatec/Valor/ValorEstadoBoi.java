package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;

public abstract class  ValorEstadoBoi {

	
	protected double valorBoiGordo;
	protected double valorBoiMagro;
	protected double valorBezerro;
	protected double valorDesmamado;
	protected double valorGarrote;
	
	protected double faseAtualBoi(Animal animal)
	{
		if( animal.getGenero().equals("macho"))
		{
			if(animal.getVivencia().equals("Desmamado"))
				return valorDesmamado;
			else if(animal.getGenero().equals("Bezerro"))
				return valorBezerro;
			else if(animal.getVivencia().equals("Garrote"))
				return valorGarrote;
			else if(animal.getVivencia().equals("Boi magro"))
				return valorBoiMagro;
			else
				return valorBoiGordo;
			
		}
		else
		{
			if(animal.getVivencia().equals("Desmamada"))
				return valorDesmamado;
			else if(animal.getVivencia().equals("Bezerra"))
				return valorBezerro;
			else if(animal.getVivencia().equals("Novilha"))
				return valorGarrote;
			else if(animal.getVivencia().equals("Vaca Boiadeira"))
				return valorBoiMagro;
			else
				return valorBoiGordo;
		}
	}
}
