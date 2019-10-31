package br.com.fatec.principal;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import br.com.fatec.Valor.ValorEstadoBoiArroba;
import br.com.fatec.Valor.ValorEstadoBoiKilo;
import br.com.fatec.Valor.ValorEstadoPorcoArroba;
import br.com.fatec.Valor.ValorEstadoPorcoKilo;
import br.com.fatec.Valor.ValorEstadual;
import br.com.fatec.animal.Animal;
import br.com.fatec.animal.Mestiso;
import br.com.fatec.animal.Netole;
import br.com.fatec.animal.Suino;
import br.com.fatec.calcular.CalcularValor;
import br.com.fatec.calcular.ValorArroba;
import br.com.fatec.calcular.ValorKilo;

public class Sistema {
	
	//Atributos
	private CalcularValor calcular;
	private ValorEstadual valorEstado;
	private List<Animal> animais;
	private static Sistema sistema;
	//Construtor e metodo para criação de um objeto
	private Sistema() {
		// TODO Auto-generated constructor stub
		animais= new ArrayList<Animal>();
	}
	public static Sistema criarSistema()
	{
		if(sistema==null)
			sistema= new Sistema();
		return sistema;
	}
	//Cria animais
	public void criarBois()
	{
		String genero, bois = "";
		int especie, peso;
		Random r= new Random();
		for(int x=0;x<=15;x++)
		{
			int escolha= r.nextInt((3-1))+1;
			peso= r.nextInt((1200-100))+100;
			especie= r.nextInt((3-1))+1;
			if(escolha==1)
				genero ="macho";
			else
				genero ="fêmea";
			if(especie==1) {
				animais.add(new Mestiso(peso, genero));
				bois+="Boi Mestico - peso: "+peso+" - genero: "+genero+" - Tipo:"+animais.get(animais.size()-1).getVivencia()+"\n";
			}
			else
			{
				animais.add(new Netole(peso, genero));
				bois+="Boi Netone  - peso: "+peso+" - genero: "+genero+" - Tipo:"+animais.get(animais.size()-1).getVivencia()+"\n";
			}
		}
		JOptionPane.showMessageDialog(null, bois);
	}
	public void criarPorcos()
	{
		int peso;
		String porcos="";
		Random r= new Random();
		for(int x=0;x<=15;x++)
		{
			peso= r.nextInt((300-6))+6;
			animais.add(new Suino(peso));
			porcos+="Porco suino  - peso: "+peso+" Tipo:"+animais.get(animais.size()-1).getVivencia()+"\n";
		}
		JOptionPane.showMessageDialog(null, porcos);
	}
	//Cria configuração
	private void criandoConfiguEstadoBoi(int escolha,String genero)
	{
		if(escolha==1) {
			valorEstado= ValorEstadoBoiArroba.criarValorEstado()
			.Desmamado(220)
			.Bezerro(270)
			.Garrote(191.3)
			.BoiMagro(171.8)
			.BoiGordo(162.8).finalizarCriacao();
			calcular= new ValorArroba();
		}
		else
		{
			valorEstado= ValorEstadoBoiKilo.criarValorEstado()
					.Bezerro(6.6)
					.Desmamado(7)
					.Garrote(6.5)
					.BoiMagro(5.75)
					.BoiGordo(5.55).finalizarCriacao();
			calcular= new ValorKilo();
		}
		JOptionPane.showMessageDialog(null, valorEstado.mostrarInformacaoEstadual(genero));
	}
	private void criandoConfiguEstadoPorco(int escolha, String genero)
	{
		if(escolha==1) {
			valorEstado= ValorEstadoPorcoArroba.criarValor()
					.ValorPorco(76)
					.ValorLeitao(120).finalizarCriacao();
			calcular= new ValorArroba();
		}
		else
		{
			valorEstado= ValorEstadoPorcoKilo.criarValor()
					.ValorLeitao(10)
					.ValorPorco(5.2).finalizarCriacao();
			calcular= new ValorKilo();
		}
		JOptionPane.showMessageDialog(null, valorEstado.mostrarInformacaoEstadual(genero));
	}
	private String[] pegadoInfomaçUsuario(String raca)
	{
		String[] vetInforma= new String[3];
		try {
			if(raca.equals("Bovinos"))
			{
				vetInforma[0]=JOptionPane.showInputDialog("Escolha qual valor sera calculado?\n1 - Mestiso\n2 - Netole");
				vetInforma[1]=JOptionPane.showInputDialog("Escolha o sexo animal?\nMacho\nFêmea").toLowerCase();
				vetInforma[2]=JOptionPane.showInputDialog("Escolha qual valor sera calculado?\n1 - Arroba\n2 - Kilo");
			}
			if(raca.equals("Porcos"))
			{
				vetInforma[1]=JOptionPane.showInputDialog("Escolha qual valor sera calculado?\n1 - Arroba\n2 - Kilo");
				do {
					vetInforma[0] = JOptionPane.showInputDialog("Escolha qual será a raça. \n1- Suino:\n2 - ...: ");
				}while(vetInforma[0]!="1");
			}
		}catch (Exception e) {
			pegadoInfomaçUsuario(raca);
		}
		return vetInforma;
	}
	
	//Mostra valores de um ou muitos animais
	public void mostrarValorBoi()
	{
		int pos=-1, raca=0, escolha;
		double valor=0;
		String sexo;
		String[] vetEscolhas;
		Random r= new Random();
		DecimalFormat d= new DecimalFormat("#.##");
		
		//requerimento do usuario
		vetEscolhas= pegadoInfomaçUsuario("Bovinos");
		raca = Integer.parseInt(vetEscolhas[0]);
		sexo = vetEscolhas[1];
		escolha=Integer.parseInt(vetEscolhas[2]);
		
		if(raca==1 && animais.size()!=0)
			do
			{
				 pos= r.nextInt(animais.size());
			}while(!(animais.get(pos) instanceof Mestiso)||!(sexo.equals(animais.get(pos).getGenero())));
		else if(raca==2 && animais.size()!=0)
			do
			{
				 pos= r.nextInt(animais.size());
			}while(!(animais.get(pos) instanceof Netole)||!(sexo.equals(animais.get(pos).getGenero())));
		
		if(pos>=0) {
			criandoConfiguEstadoBoi(escolha,animais.get(pos).getGenero());
			valor=calcular.calcular(animais.get(pos), valorEstado);
		}
		
		if(valor>0) {
			JOptionPane.showMessageDialog(null, "Animal Boi\nGenero: "+animais.get(pos).getGenero()+
					"\nPeso: "+animais.get(pos).getPeso()+
					"\nStatus atual: "+animais.get(pos).getVivencia()+
					"\nO valor do peso é: "+d.format(valor));
		}
			
	}
	public void mostrarValorPorco()
	{
		DecimalFormat d= new DecimalFormat("#.##");
		Random r= new Random();
		String[] vetEscolhas;
		int pos=0;
		double valor=0;
		int escolha, especie;
		
		vetEscolhas=pegadoInfomaçUsuario("Porcos");
		especie=Integer.parseInt(vetEscolhas[0]);
		escolha=Integer.parseInt(vetEscolhas[1]);
		
		if(especie==1 && animais.size()!=0) {
			do {
				
				pos= r.nextInt(animais.size());
			}while(!(animais.get(pos) instanceof Suino));
		}
		
		if(pos>=0){
			criandoConfiguEstadoPorco(escolha, animais.get(pos).getGenero());
			valor=calcular.calcular(animais.get(pos), valorEstado);
		}
		
		if(valor>0) {
			JOptionPane.showMessageDialog(null, "Animal Porco"+
					"\nPeso: "+animais.get(pos).getPeso()+
					"\nStatus atual: "+animais.get(pos).getVivencia()+
					"\nO valor do peso é: "+d.format(valor));
		}
	}
	public void mostrarValorBoiGrupo()
	{	
		//variaveis
		List<Animal> bois= new ArrayList<Animal>();
		DecimalFormat d= new DecimalFormat("#.##");
		String[]vetEscolhas;
		double valorTotal=0;
		String resposta="" , genero;
		int valor, escolha;
		
		//requerimento do usuario
		vetEscolhas= pegadoInfomaçUsuario("Bovinos");
		escolha = Integer.parseInt(vetEscolhas[0]);
	    genero = vetEscolhas[1];
		valor=Integer.parseInt(vetEscolhas[2]);
		
		//cria um cofiguração do estado
		criandoConfiguEstadoBoi(valor, genero);
		
		//separar os animais especificos
		if(escolha == 1) {
			for(Animal animal: animais)
				if(animal instanceof Mestiso &&  animal.getGenero().equals(genero))
					bois.add(animal);
			resposta="\nEspecie do animais: Mestiso";

		}
		else if(escolha == 2) {
			for(Animal animal: animais)
				if(animal instanceof Netole &&  animal.getGenero().equals(genero))
					bois.add(animal);
			resposta= "\nEspecie dos animais: Netole";
		}

		if(bois.size()!=0)
			//calcular o valor do grupo
			valorTotal=calcular.calcularGrupo(bois, valorEstado);
		
		//mostra a mensagem
		if(valorTotal>0)
			JOptionPane.showMessageDialog(null, "Animais do tipo Bovino"+
					"\nQuantidade dos animais pesados: "+bois.size()+
					"\nGenero dos animais: "+genero+resposta+
					"\nValor total "+d.format(valorTotal));
		
	}
	public void mostrarValorPorcoGrupo()
	{
		List<Animal> porcos = new ArrayList<Animal>();
		DecimalFormat d= new DecimalFormat("#.##");
		String[] vetEscolhas;
		int valor, escolha;
		
		vetEscolhas= pegadoInfomaçUsuario("Porcos");
		valor=Integer.parseInt(vetEscolhas[1]);
		escolha = Integer.parseInt(vetEscolhas[0]);
		JOptionPane.showMessageDialog(null, escolha);
		criandoConfiguEstadoPorco(valor,null);
		
		if(escolha == 1) {
			for(Animal animal: animais)
				if(animal instanceof Suino) {
					porcos.add(animal);
					
				}
		}
		if(porcos.size()>0) {
			double valorTotal=calcular.calcularGrupo(porcos, valorEstado);
			JOptionPane.showMessageDialog(null, "Animais do tipo Porco"+
					"\nQuantidade dos animais pesados: "+porcos.size()+
					"\nValor total "+d.format(valorTotal));
		}
		
	}
	
}
