package temperaturas;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {
	
	public void ConvertirCelciusFahrenheit(double valor) {
		double tempCelcius = (valor * 9/5) + 32;
		tempCelcius = (double)Math.round(tempCelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempCelcius + " Fahrenheit");
	}
	public void ConvertirCelciusKelvin(double valor) {
		double tempKelvin = valor + 273.15;
		tempKelvin = (double)Math.round(tempKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempKelvin + " Kelvin");
	}
	public void ConvertirCelciusRankine(double valor) {
		double tempRankine = (valor * 9/5) + 491.67;
		tempRankine = (double)Math.round(tempRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempRankine + " Rankine");
	}
	
	
	
	public void ConvertirFahrenheitCelcius(double valor) {
		double tempFahrenheit =  (valor - 32) * 5/9;
		tempFahrenheit = (double)Math.round(tempFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempFahrenheit + " Celcius");
	}
	public void ConvertirFahrenheitKelvin(double valor) {
		double tempKelvin =  (valor - 32) * 5/9 + 273.15;
		tempKelvin = (double)Math.round(tempKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempKelvin + " Kelvin");
	}
	public void ConvertirFahrenheitRankine(double valor) {
		double tempRankine =  valor + 459.67;
		tempRankine = (double)Math.round(tempRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempRankine + " Rankine");
	}
	
	
	
	public void ConvertirRankineCelcius(double valor) {
		double tempCelcius =  (valor - 491.67) * 5/9;
		tempCelcius = (double)Math.round(tempCelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempCelcius + " Celcius");
	}
	public void ConvertirRankineKelvin(double valor) {
		double tempKelvin =  ((valor - 491.67) / 1.8000) + 273.15;
		tempKelvin = (double)Math.round(tempKelvin * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempKelvin + " Kelvin");
	}
	public void ConvertirRankineFahrenheit(double valor) {
		double tempFahrenheit = valor - 459.67;
		tempFahrenheit = (double)Math.round(tempFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempFahrenheit + " Fahrenheit");
	}
	
	
	public void ConvertirKelvinCelcius(double valor) {
		double tempCelcius = valor + 273.15;
		tempCelcius = (double)Math.round(tempCelcius * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempCelcius + " Celcius");
	}
	public void ConvertirKelvinFahrenheit(double valor) {
		double tempFahrenheit = 1.8 * (valor - 273) + 32;
		tempFahrenheit = (double)Math.round(tempFahrenheit * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempFahrenheit + " Fahrenheit");
	}
	public void ConvertirKelvinRankine(double valor) {
		double tempRankine = valor * (9/5);
		tempRankine = (double)Math.round(tempRankine * 100d) / 100;
		JOptionPane.showMessageDialog(null, tempRankine + " Rankine");
	}
}
