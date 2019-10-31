package br.com.fatec.animal;

public abstract class Porco extends Animal{

	public Porco(double peso) {
		// TODO Auto-generated constructor stub
		this.peso=peso;
		this.vivenciaAtual= vivenciaAtualPorco(peso);
	}
	
	protected abstract String vivenciaAtualPorco(double peso);
}
