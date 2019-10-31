package br.com.fatec.animal;

public class Suino extends Porco {

	public Suino(double peso) {
		super(peso);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String vivenciaAtualPorco(double peso) {
		// TODO Auto-generated method stub
		if(peso<=15)
		{
			return "Leitão";
		}
		else
		{
			return "Porco";
		}
	}

}
