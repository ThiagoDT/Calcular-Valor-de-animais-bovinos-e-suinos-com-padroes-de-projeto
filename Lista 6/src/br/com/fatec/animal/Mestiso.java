package br.com.fatec.animal;

public class Mestiso extends Boi {

	public Mestiso(double peso, String genero) {
		super(peso, genero);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	protected String vivenciaAtualBoi(String genero,double peso) {
		// TODO Auto-generated method stub
		if(genero.equals("macho"))
		{
			if(peso<=165)
				return "Desmamado";
			else if(peso<=195)
				return "Bezerro";
			else if( peso<=240)
				return "Garrote";
			else if(peso<=460)
				return "Boi magro";
			else 
				return "Boi gordo";
		}
		else
		{
			if(peso<=135)
				return "Desmamada";
			else if(peso<=165)
				return "Bezerra";
			else if( peso<=240)
				return "Novilha";
			else if(peso<=400)
				return "Vaca Boiadeira";
			else 
				return "Vaca gorda";
		}
	}
	

}
