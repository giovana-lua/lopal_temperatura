package br.dev.giovana.temperatura.model;

import java.util.Scanner;

public class Temperatura {
	
	private double celsius;
	
	public void setCelsius(double celsius) {
		celsius = celsius;
	}
	public double getCelsius() {
		return celsius;
	}
	
	public double converterParaKelvin() {
		
		double kelvin = celsius + 273.15;
		return kelvin;
	}
	
	
	
	
	
	
	
	

}
