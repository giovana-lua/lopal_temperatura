package br.dev.giovana.temperatura.gui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import br.dev.giovana.temperatura.model.Temperatura;

public class TelaConversor {

	private JLabel labelCelsius;
	private JTextField txtCelsius;
	private JLabel labelResultado;
	private JButton btnFahrenheit;
	private JButton btnKelvin;

	private Font labels = new Font("Arial", Font.BOLD, 13);
	private Color labelsColor = new Color(178, 23, 241);
	private Font labelfont = new Font("Arial", Font.BOLD, 16);

	public void criarTela() {
		
		//Criando um Jframe
		JFrame tela = new JFrame();

		Dimension tamanho = new Dimension();
		tamanho.setSize(360, 250);
		tela.setSize(tamanho);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setTitle("Conversor de Temperatura");
		tela.setLayout(null);
		tela.setLocationRelativeTo(null);
		tela.setResizable(false);

		// criando um Jlabel e um JtextField para Celsius

		labelCelsius = new JLabel();
		labelCelsius.setFont(labels);
		labelCelsius.setText("Temperatura em graus Celsius: ");
		labelCelsius.setBounds(40, 10, 300, 30);

		txtCelsius = new JTextField();
		txtCelsius.setHorizontalAlignment(JTextField.RIGHT);
		txtCelsius.setBounds(40, 45, 260, 30);

		// criando os botões
		btnFahrenheit = new JButton();
		btnFahrenheit.setText("Fahrenheit");
		btnFahrenheit.setFont(labels);
		btnFahrenheit.setForeground(labelsColor);
		btnFahrenheit.setBounds(180, 90, 120, 30);

		btnKelvin = new JButton();
		btnKelvin.setText("Kelvin");
		btnKelvin.setFont(labels);
		btnKelvin.setForeground(labelsColor);
		btnKelvin.setBounds(40, 90, 120, 30);

		// Criando um label do resultado
		labelResultado = new JLabel();
		labelResultado.setText(null);
		labelResultado.setFont(labelfont);
		labelResultado.setBounds(150, 130, 90, 30);

		// Adicionando os componentes a tela
		tela.getContentPane().add(labelCelsius);
		tela.getContentPane().add(txtCelsius);
		tela.getContentPane().add(btnKelvin);
		tela.getContentPane().add(btnFahrenheit);
		tela.getContentPane().add(labelResultado);

		// Adicionando um ouvinte de ação (listener) ao botão Fahrenheit
		btnFahrenheit.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Temperatura temperatura = new Temperatura();

				double celsius = Double.parseDouble(txtCelsius.getText());
				temperatura.setCelsius(celsius);
				String fahrenheit = String.valueOf(temperatura.converterParaFahrenheit());
				labelResultado.setText(fahrenheit);

			}
		});
		//Adicionando um ouvinte de ação (listener) ao botão Kelvin
		btnKelvin.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				Temperatura temperatura = new Temperatura();

				double celsius = Double.parseDouble(txtCelsius.getText());
				temperatura.setCelsius(celsius);
				String kelvin = String.valueOf(temperatura.converterParaKelvin());
				labelResultado.setText(kelvin);
				
				

			}
		});

		// Ultima linha (torna a tela visivel)
		tela.setVisible(true);
	}

}
