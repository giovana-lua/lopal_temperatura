package br.dev.giovana.temperatura.model;

import java.util.Scanner;

public class Temperatura {
	
	private double celsius;
	
	//metodos setters e getters
	public void setCelsius(double celsius) {
		this.celsius = celsius;
	}
	public double getCelsius() {
		return celsius;
	}
	
	//metodos para a conversão
	public double converterParaKelvin() {
		
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	public double converterParaFahrenheit() {
		double fahrenheit = (celsius * 9/5) + 32;
		return fahrenheit;
		
	}
	
	
	
	
	
	
	

}
