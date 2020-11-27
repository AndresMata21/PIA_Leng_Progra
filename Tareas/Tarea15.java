/*
 * 
 * Nombre: JAMC Matr: 1915173 Hora: N2
 * Conversión de Temperatura (TAREA 15)
 * Elabore un programa que mediante un Menú de opciones permitir calcular la conversión de escala de temperatura.
 *
 */

import javax.swing.JOptionPane;

public class Tarea15 
{
	public static void main(String[] args)
	{
		String teclado = "";
		String options[] = {"Fin", "°C -> °F", "°F -> °C"};
		float C, F, conv;
		int v;
		
		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Conversión Meteorológica\n'C-H-E-R-S-O', usuario.");
		do 
		{
			v = JOptionPane.showOptionDialog(null, "Seleccionar el Tipo de Conversión", 
					"Conversión Meteorológica", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (v) 
			{
				case 1:
					teclado = JOptionPane.showInputDialog("Ingresa la Temperatura en °C");
					C = Float.parseFloat(teclado);
					conv = (C * 9/5) + 32;
					JOptionPane.showMessageDialog(null, C +" °C = " + conv + " °F");
					break;
				case 2:
					teclado = JOptionPane.showInputDialog("Ingresa la Temperatura en °F");
					F = Float.parseFloat(teclado);
					conv = (F - 32) * 5/9;
					JOptionPane.showMessageDialog(null, F +" °F = " + conv + " °C");
					break;
			}
		} while (v != 0);
		JOptionPane.showMessageDialog(null, "Tenga un buen día.");
	}
}