package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class FrameCalculadora {
	
	public String titulo;
	public int largura;
	public int altura;
	
	public void criarTela() {
		
		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);
		
		
		//Obter uma referência do painel de conteúdo da tela
		Container painel = tela.getContentPane();
		
		
		//Criar os componentes de tela
		
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setForeground(Color.RED);
		labelTabuada.setBounds(30, 20, 100, 30);
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(30, 70, 100, 30);
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(altura, altura, largura, altura);
		
		
		
		//Adicionar os componentes de tela
		painel.add(labelTabuada);
		painel.add(labelMultiplicando);
		
		
		//tornar a tela visivel
		tela.setVisible(true);
		
	}

}
