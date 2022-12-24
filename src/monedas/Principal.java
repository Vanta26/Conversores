package monedas;

import temperaturas.OpcionesTemperaturas;

import javax.swing.*;


public class Principal {
	
	public static void main(String[] args) {
		
		OpcionesMonedas monedas = new OpcionesMonedas();
		OpcionesTemperaturas temperatura = new OpcionesTemperaturas();
		Valida validacion = new Valida(); 
		
		boolean continuar = true;
	
		while(continuar) {
			String opciones = (JOptionPane.showInputDialog(null, "Seleccione conversor", "Menú", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de moneda", "Conversor de temperatura"}, "Seleccion")).toString();
			boolean conversores = true;
			
			switch (opciones) {
			
			case "Conversor de moneda": {
				
				while(conversores) {
					String inputValue = JOptionPane.showInputDialog("Ingrese valor a convertir");						
					
					if (validacion.validaEntrada(inputValue)) {
						double valorRecibido = Double.parseDouble(inputValue);
						
						monedas.ConvertirMonedas(valorRecibido); 
						int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea convertir otra moneda?");
							
						if (JOptionPane.OK_OPTION != respuesta) {
							conversores = false;
							
						} 
					}
				}break;
			}
			
			case "Conversor de temperatura": {
				
				while(conversores) {
					String inputValue = JOptionPane.showInputDialog("Ingrese valor a convertir");						
					
					if (validacion.validaEntrada(inputValue)) {
						double valorRecibido = Double.parseDouble(inputValue);
						
						temperatura.ConvertirTemperatura(valorRecibido);
						int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea convertir otra temperatura?");
							
						if (JOptionPane.OK_OPTION != respuesta) {
							conversores = false;
						} 
					}
				}
				
			}break;
			}
			
			int respuesta = JOptionPane.showConfirmDialog(null, "¿Desea regresar al menú principal?");
			
			if (JOptionPane.OK_OPTION != respuesta) {
				JOptionPane.showMessageDialog(null, "Programa finalizado");
				continuar = false;
			} 
		}
	}
	
}
