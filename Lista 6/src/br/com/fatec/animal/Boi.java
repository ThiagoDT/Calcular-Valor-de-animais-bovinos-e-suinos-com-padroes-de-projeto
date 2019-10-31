package br.com.fatec.animal;

public abstract class Boi  extends  Animal{

	
	
	public Boi(double peso, String genero) {
		// TODO Auto-generated constructor stub
		this.peso=peso;
		this.genero=genero;
		this.vivenciaAtual = vivenciaAtualBoi(genero, peso);
	}
	protected abstract String vivenciaAtualBoi(String genero, double peso);
}
