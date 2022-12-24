package temperaturas;

import javax.swing.JOptionPane;

public class OpcionesTemperaturas {

	ConvertirTemperatura temperaturas = new ConvertirTemperatura();
	
	public void ConvertirTemperatura(double ValorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione temperatura", "Temperaturas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Grados Celcius a Fahrenheit", "Grados Celcius a Kelvin", "Grados Celcius a Rankine", 
				"Grados Fahrenheit a Celcius", "Grados Fahrenheit a Kelvin", "Grados Fahrenheit a Rankine", "Grados Rankine a Celcius", "Grados Rankine a Fahrenheit", "Grados Rankine a Kelvin", "Grados Kelvin a Celcius",
				"Grados Kelvin a Fahrenheit", "Grados Kelvin a Rankine"}, "Seleccion")).toString();
		
		
		switch (opciones) {
		case "Grados Celcius a Fahrenheit": 
			temperaturas.ConvertirCelciusFahrenheit(ValorRecibido);
			break;	
		case "Grados Celcius a Kelvin": 
			temperaturas.ConvertirCelciusKelvin(ValorRecibido);
			break;	
		case "Grados Celcius a Rankine": 
			temperaturas.ConvertirCelciusRankine(ValorRecibido);
			break;	
		case "Grados Fahrenheit a Celcius":
			temperaturas.ConvertirFahrenheitCelcius(ValorRecibido);
			break;	
		case "Grados Fahrenheit a Kelvin": 
			temperaturas.ConvertirFahrenheitKelvin(ValorRecibido);
			break;	
		case "Grados Fahrenheit a Rankine":
			temperaturas.ConvertirFahrenheitRankine(ValorRecibido);
			break;
		case "Grados Kelvin a Celcius":
			temperaturas.ConvertirKelvinCelcius(ValorRecibido);
			break;
		case "Grados Kelvin a Fahrenheit":
			temperaturas.ConvertirKelvinFahrenheit(ValorRecibido);
			break;
		case "Grados Kelvin a Rankine":
			temperaturas.ConvertirKelvinRankine(ValorRecibido);
			break;	
		case "Grados Rankine a Celcius":
			temperaturas.ConvertirRankineCelcius(ValorRecibido);
			break;	
		case "Grados Rankine a Fahrenheit":
			temperaturas.ConvertirRankineFahrenheit(ValorRecibido);
			break;	
		case "Grados Rankine a Kelvin":
			temperaturas.ConvertirRankineKelvin(ValorRecibido);
			break;	
	}
	}
}
