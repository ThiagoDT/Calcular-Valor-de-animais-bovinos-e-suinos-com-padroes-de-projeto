package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;
import br.com.fatec.animal.Mestiso;

public class ValorEstadoBoiKilo extends ValorEstadoBoi implements ValorEstadual {

	private static ValorEstadoBoiKilo kilo;
	private ValorEstadoBoiKilo() {
		// TODO Auto-generated constructor stub
	}
	
	public static ValorEstadoBoiKilo criarValorEstado()
	{
		kilo= new ValorEstadoBoiKilo();
		return kilo;
	}

	public ValorEstadoBoiKilo BoiGordo(double a)
	{
		kilo.valorBoiGordo=a;
		return this;
	}
	public ValorEstadoBoiKilo BoiMagro(double a)
	{
		kilo.valorBoiMagro=a;
		return this;
	}
	public ValorEstadoBoiKilo Garrote(double a)
	{
		kilo.valorGarrote=a;
		return this;
	}
	public ValorEstadoBoiKilo Bezerro(double a)
	{
		kilo.valorBezerro=a;
		return this;
	}
	public ValorEstadoBoiKilo Desmamado(double a)
	{
		kilo.valorDesmamado=a;
		return this;
	}
	public ValorEstadoBoiKilo finalizarCriacao()
	{
		return kilo;
	}

	@Override
	public double obterValorEstado(Animal animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Mestiso )
		{
			return faseAtualBoi(animal);
		}
		else 
		{
			return faseAtualBoi(animal);
		}
	}

	@Override
	public String mostrarInformacaoEstadual(String genero) {
		// TODO Auto-generated method stub
		String resposta="";
		resposta="Valor Estatual em Kilo para bovinos(Cotação)";
		
		if(genero.equals("macho"))
				resposta+= "\nDesmamado: "+valorDesmamado
				+ "\nBezerro: "+valorBezerro
				+ "\nGarrote: "+valorGarrote
				+ "\nBoi magro: "+valorBoiMagro
				+ "\nBoi gordo:"+valorBoiGordo;
		else
				resposta+= "\nDesmamada: "+valorDesmamado
				+ "\nBezerra: "+valorBezerro
				+ "\nNovilha: "+valorGarrote
				+ "\nVaca Boiadeira: "+valorBoiMagro
				+ "\nVaca gordo:"+valorBoiGordo;
		return resposta;
	}
	
	
}
