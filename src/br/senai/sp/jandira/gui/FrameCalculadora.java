package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import br.senai.sp.jandira.model.Tabuada;

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
		
		ImageIcon icone = new ImageIcon ("src/br/senai/sp/jandira/img/questionario.png");
		JLabel icon = new JLabel(icone);
		icon.setBounds(9, 7, 65, 65);
		
		JLabel labelTabuada = new JLabel();
		labelTabuada.setText("Tabuada 1.0");
		labelTabuada.setForeground(Color.RED);
		labelTabuada.setBounds(100, 20, 200, 30);
		labelTabuada.setFont(new Font(null, 0, 20));
		
		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setBounds(30, 70, 200, 30);
		labelMultiplicando.setFont(new Font(null, 0, 20));
		
		JTextField textFieldMultiplicando = new JTextField();
		textFieldMultiplicando.setBounds(350, 70, 100, 30);
		
		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Minimo Multiplicador:");
		labelMinimoMultiplicador.setBounds(30, 110, 220, 30);
		labelMinimoMultiplicador.setFont(new Font(null, 0, 20));
		
		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBounds(350, 110, 100, 30);
		
		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Maximo Multiplicador:");
		labelMaximoMultiplicador.setBounds(30, 150, 230, 30);
		labelMaximoMultiplicador.setFont(new Font(null, 0, 20));
		
		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBounds(350, 150, 100, 30);
		
		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBounds(30, 200, 150, 30);
		buttonCalcular.setBackground(Color.GREEN);
		buttonCalcular.setFont(new Font(null, 0, 20));
		
		
		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBounds(250, 200, 200, 30);
		buttonLimpar.setBackground(Color.YELLOW);
		buttonLimpar.setFont(new Font(null, 0, 20));
		
		JScrollPane scroll = new JScrollPane();
	    scroll.setBounds(30, 250, 400, 300);
	    JList lista = new JList();
	    lista.setBackground(Color.ORANGE);
		
		//Adicionar os componentes de tela
		painel.add(labelTabuada);
		painel.add(labelMultiplicando);
		painel.add(textFieldMultiplicando);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(scroll);
		painel.add(lista);
		painel.add(icon);
		
		//tornar a tela visivel
		tela.setVisible(true);
		
		//Definir os ouvintes
		buttonCalcular.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Tabuada tabuada = new Tabuada();
				tabuada.multiplicando = Integer.parseInt(textFieldMultiplicando.getText());
				tabuada.minMultiplicador = Integer.parseInt(textFieldMinimoMultiplicador.getText());
				tabuada.maxMultiplicador = Integer.parseInt(textFieldMaximoMultiplicador.getText());
				
				if (tabuada.minMultiplicador > tabuada.maxMultiplicador) {
					JOptionPane.showMessageDialog(null, "Operação não realizada.", "ERROR", JOptionPane.OK_OPTION);
					textFieldMultiplicando.setText("");
					textFieldMinimoMultiplicador.setText("");
					textFieldMaximoMultiplicador.setText("");
				}
				
				lista.setListData(tabuada.getTabuada());
				scroll.getViewport().add(lista);
				
				
			}
			
			
		});
		
		buttonLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				textFieldMultiplicando.setText("");
				textFieldMinimoMultiplicador.setText("");
				textFieldMaximoMultiplicador.setText("");
				
				DefaultListModel<String> model = new DefaultListModel<>();
				lista.setModel(model);
			}
		});
		
	}

}
