package br.com.fatec.Valor;

import br.com.fatec.animal.Animal;
import br.com.fatec.animal.Suino;

public class ValorEstadoPorcoKilo extends ValorEstadoPorco implements ValorEstadual {

	private static ValorEstadoPorcoKilo kilo;
	
	
	private  ValorEstadoPorcoKilo() {
		// TODO Auto-generated constructor stub
	}
	
	public static ValorEstadoPorcoKilo criarValor() {
		kilo= new ValorEstadoPorcoKilo();
		return kilo;
	}
	public ValorEstadoPorcoKilo ValorPorco(double a)
	{
		kilo.valorPorco = a;
		return this;
	}
	public ValorEstadoPorcoKilo ValorLeitao(double a)
	{
		kilo.valorLeitao = a;
		return this;
	}
	public ValorEstadoPorcoKilo finalizarCriacao()
	{
		return kilo;
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
