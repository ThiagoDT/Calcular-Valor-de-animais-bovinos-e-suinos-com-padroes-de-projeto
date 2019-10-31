package br.com.fatec.animal;

public class Netole extends Boi {

	public Netole(double peso, String genero) {
		super(peso, genero);
		// TODO Auto-generated constructor stub
	}

	@Override
	protected String vivenciaAtualBoi(String genero, double peso) {
		// TODO Auto-generated method stub
		if(genero.equals("macho"))
		{
			if(peso<=180)
				return "Desmamado";
			else if(peso<=225)
				return "Bezerro";
			else if( peso<=285)
				return "Garrote";
			else if(peso<=460)
				return "Boi magro";
			else 
				return "Boi gordo";
		}
		else
		{
			if(peso<=150)
				return "Desmamada";
			else if(peso<=180)
				return "Bezerra";
			else if( peso<=255)
				return "Novilha";
			else if(peso<=415)
				return "Vaca Boiadeira";
			else 
				return "Vaca gorda";
		}
	}

}
