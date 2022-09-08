package br.senai.sp.jandira.model;

import java.util.ArrayList;

public class Tabuada {
	
	public int multiplicando;
	public int minMultiplicador;
	public int maxMultiplicador;
	
	public String[] getTabuada() {
		
		int tamanho = maxMultiplicador - minMultiplicador + 1;
		String[] tabuada = new String[tamanho];
		int i = 0;
		
		while(minMultiplicador <= maxMultiplicador ) {
			
			int produto = multiplicando * minMultiplicador;
			
			
			String resultado = multiplicando + " X " + minMultiplicador + " = " + produto;
			tabuada[i] = resultado;
			
			
			i++;
			minMultiplicador++;
			
			
		}
		
		return tabuada;
		
		
	
		
	}
	
	

	
}
