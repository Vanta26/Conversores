package monedas;

import javax.swing.JOptionPane;

public class OpcionesMonedas {
	
	ConvertirMoneda monedas = new ConvertirMoneda();
	public void ConvertirMonedas(double ValorRecibido) {
		String opciones = (JOptionPane.showInputDialog(null, "Seleccione moneda", "Monedas", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Peso argentino a Dólar", "Peso argentino a Euro", "Peso argentino a Libras Esterlinas", "Peso argentino a Yen Jápones", "Peso argentino a Won SurCoreano", 
				"Dólar a Peso argentino", "Euro a Peso argentino", "Libras Esterlinas a Peso argentino", "Yen Jápones a Peso argentino", "Won SurCoreano a Peso argentino"}, "Seleccion")).toString();
		
		switch (opciones) {
		case "Peso argentino a Dólar": 
			monedas.ConvertirPesoArgentinoDolar(ValorRecibido);
			break;	
		case "Peso argentino a Euro": 
			monedas.ConvertirPesoArgentinoEuro(ValorRecibido);
			break;	
		case "Peso argentino a Libras Esterlinas": 
			monedas.ConvertirPesoArgentinoLibraEsterlina(ValorRecibido);
			break;	
		case "Peso argentino a Yen Jápones":
			monedas.ConvertirPesoArgentinoYen(ValorRecibido);
			break;	
		case "Peso argentino a Won SurCoreano": 
			monedas.ConvertirPesoArgentinoWon(ValorRecibido);
			break;	
		case "Dólar a Peso argentino":
			monedas.ConvertirDolarPesoArgentino(ValorRecibido);
			break;	
		case "Euro a Peso argentino":
			monedas.ConvertirEuroPesoArgentino(ValorRecibido);
			break;	
		case "Libras Esterlinas a Peso argentino":
			monedas.ConvertirLibraEsterlinaPesoArgentino(ValorRecibido);
			break;	
		case "Yen Jápones a Peso argentino":
			monedas.ConvertirYenPesoArgentino(ValorRecibido);
			break;	
		case "Won SurCoreano a Peso argentino":
			monedas.ConvertirWonPesoArgentino(ValorRecibido);
			break;	
	}
}
}
