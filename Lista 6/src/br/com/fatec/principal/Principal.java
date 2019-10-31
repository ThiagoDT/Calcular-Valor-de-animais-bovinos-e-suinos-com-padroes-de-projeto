package br.com.fatec.principal;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int escolha= 0;
		Sistema sistema= Sistema.criarSistema();
		do
		{
			escolha= Integer.parseInt(JOptionPane.showInputDialog("Escolha:\n"
					+ "1 - Criar Bois\n"
					+ "2 - Criar Porcos\n"
					+ "3 - Mostrar valor unico no boi\n"
					+ "4 - Mostrar valor unico porco\n"
					+ "5 - Mostrar valor grupo boi\n"
					+ "6 - Mostrar valor grupo porco\n"
					+ "0 - Sair"));
			
			if(escolha==1)
				sistema.criarBois();
			else if(escolha==2)
				sistema.criarPorcos();
			else if(escolha == 3)
				sistema.mostrarValorBoi();
			else if(escolha==4)
				sistema.mostrarValorPorco();
			else if(escolha == 5)
				sistema.mostrarValorBoiGrupo();
			else if(escolha==6)
				sistema.mostrarValorPorcoGrupo();
			
		}while(escolha!=0);
	
	}

}
