package monedas;

import javax.swing.JOptionPane;

public class ConvertirMoneda {
	
	public void ConvertirPesoArgentinoDolar(double valor) {
		double monedaDolar = valor / 173.92;
		monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
	}
	
	public void ConvertirPesoArgentinoEuro(double valor) {
		double monedaEuro = valor / 184.81;
		monedaEuro = (double)Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
	}
	
	public void ConvertirPesoArgentinoLibraEsterlina(double valor) {
		double monedaLibraEsterlina = valor / 211.951;
		monedaLibraEsterlina = (double)Math.round(monedaLibraEsterlina * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibraEsterlina + " Libras Esterlinas");
	}
	
	public void ConvertirPesoArgentinoYen(double valor) {
		double monedaYen = valor / 1.32;
		monedaYen = (double)Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yenes");
	}
	
	public void ConvertirPesoArgentinoWon(double valor) {
		double monedaWon = valor / 0.14;
		monedaWon = (double)Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wones");
	}
	
	
	public void ConvertirDolarPesoArgentino(double valor) {
		double monedaDolar = 173.92 * valor;
		monedaDolar = (double)Math.round(monedaDolar * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos argentinos ");
	}
	
	public void ConvertirEuroPesoArgentino(double valor) {
		double monedaEuro = 184.81 * valor;
		monedaEuro = (double)Math.round(monedaEuro * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos argentinos");
	}
	
	public void ConvertirLibraEsterlinaPesoArgentino(double valor) {
		double monedaLibraEsterlina = 211.951 * valor;
		monedaLibraEsterlina = (double)Math.round(monedaLibraEsterlina * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes en Pesos $ " + monedaLibraEsterlina + " Pesos argentinos");
	}
	
	public void ConvertirYenPesoArgentino(double valor) {
		double monedaYen = 1.32 * valor;
		monedaYen = (double)Math.round(monedaYen * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos argentinos");
	}
	
	public void ConvertirWonPesoArgentino(double valor) {
		double monedaWon = 0.14 * valor;
		monedaWon = (double)Math.round(monedaWon * 100d) / 100;
		JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Pesos argentinos");
	}
	
}
