package br.senai.sp.jandira;

import br.senai.sp.jandira.gui.FrameCalculadora;
import br.senai.sp.jandira.model.Tabuada;

public class AppTabuada {

	public static void main(String[] args) {
		
		FrameCalculadora tela = new FrameCalculadora();
		tela.titulo = "Tabuada";
		tela.largura = 600;
		tela.altura = 600;
		tela.criarTela();
		
		Tabuada tabuada = new Tabuada();
		tabuada.multiplicando = 2;
		tabuada.minMultiplicador = 1;
		tabuada.maxMultiplicador = 10;
		
		String[] resultado = tabuada.getTabuada();
		int i = 0;
		
		
		while (i < resultado.length) {
			System.out.println(resultado[i]);
			
			i++;
		}

	}

}
