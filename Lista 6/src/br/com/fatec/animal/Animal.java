package br.com.fatec.animal;

public abstract class Animal {

	protected String genero;
	protected String vivenciaAtual;
	protected double peso;
	
	public double getPeso()
	{
		return peso;
	}
	public String getGenero()
	{
		return genero;
	}
	public String getVivencia()
	{
		return vivenciaAtual;
	}
}
