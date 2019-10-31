package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;
import br.com.fatec.animal.Mestiso;
import br.com.fatec.animal.Netole;

public class ValorEstadoBoiArroba extends ValorEstadoBoi implements ValorEstadual {

	private static ValorEstadoBoiArroba arroba;
	
	private ValorEstadoBoiArroba() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public static ValorEstadoBoiArroba criarValorEstado()
	{
		return arroba= new ValorEstadoBoiArroba();
	}
	public ValorEstadoBoiArroba BoiGordo(double a)
	{
		arroba.valorBoiGordo=a;
		return this;
	}
	public ValorEstadoBoiArroba BoiMagro(double a)
	{
		arroba.valorBoiMagro=a;
		return this;
	}
	public ValorEstadoBoiArroba Garrote(double a)
	{
		arroba.valorGarrote=a;
		return this;
	}
	public ValorEstadoBoiArroba Bezerro(double a)
	{
		arroba.valorBezerro=a;
		return this;
	}
	public ValorEstadoBoiArroba Desmamado(double a)
	{
		arroba.valorDesmamado=a;
		return this;
	}
	public ValorEstadoBoiArroba finalizarCriacao()
	{
		return arroba;
	}

	@Override
	public double obterValorEstado(Animal animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Mestiso )
			return faseAtualBoi(animal);
		else if(animal instanceof Netole )
			return faseAtualBoi(animal);
		else
			return -1;
		
	}

	@Override
	public String mostrarInformacaoEstadual(String genero) {
		// TODO Auto-generated method stub
		String resposta="";
		resposta="Valor Estatual em Arroba para bovinos(Cotação)";
		
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
