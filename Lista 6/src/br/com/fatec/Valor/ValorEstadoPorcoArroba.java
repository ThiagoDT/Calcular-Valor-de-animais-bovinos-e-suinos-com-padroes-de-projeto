package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;
import br.com.fatec.animal.Suino;

public class ValorEstadoPorcoArroba extends ValorEstadoPorco implements ValorEstadual{

	private static ValorEstadoPorcoArroba arroba;
	private ValorEstadoPorcoArroba() {
		// TODO Auto-generated constructor stub
	}
	
	public static ValorEstadoPorcoArroba criarValor() {
		arroba= new ValorEstadoPorcoArroba();
		return arroba;
	}
	public ValorEstadoPorcoArroba ValorPorco(double a)
	{
		arroba.valorPorco = a;
		return this;
	}
	public ValorEstadoPorcoArroba ValorLeitao(double a)
	{
		arroba.valorLeitao = a;
		return this;
	}
	public ValorEstadoPorcoArroba finalizarCriacao()
	{
		return arroba;
	}
	
	@Override
	public double obterValorEstado(Animal animal) {
		// TODO Auto-generated method stub
		if(animal instanceof Suino)
		{
			return faseAtualPorco(animal);
		}
		return -1;
	}

	@Override
	public String mostrarInformacaoEstadual(String genero) {
		// TODO Auto-generated method stub
		
		return "Valor Estatual em Arroba para porcos(Cotação)"
				+ "\nLeitão: "+valorLeitao
				+ "\nPorco: "+valorPorco;
				
	}

}
