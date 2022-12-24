package monedas;

import javax.swing.JOptionPane;

public class Valida {
	
	public boolean validaEntrada(String entrada){
		   boolean valido = true;

		   if(!entrada.matches("[0-9]*")){
		      valido = false;
		      JOptionPane.showMessageDialog(null, "Solo se permiten números", "Dato invalido", JOptionPane.ERROR_MESSAGE);

		   }
		   return valido;
		}
}