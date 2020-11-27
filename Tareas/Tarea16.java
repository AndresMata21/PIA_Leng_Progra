/*
 * 
 * 
 * Nombre: JAMC Matr: 1915173 Hora: N2
 * Conversi�n de Monedas (TAREA 16)
 * Elabore un programa que a trav�s de un Men� de opciones permita al usuario convertir de pesos a las siguientes monedas:
 * 1. D�lar 2. Euro 3. Yen(Japon�s) 4. D�lar de Hong Kong
 * 
 * 
 */


import javax.swing.JOptionPane;

public class Tarea16 
{
	public static void main(String[] args) 
	{
		String teclado = "";
		String options[] = {"Fin", "D�lar $", "Euro �", "Yen �", "D�lar HK HK$"};
		float d, e, y, hk, conv;
		int v;
		
		JOptionPane.showMessageDialog(null, "Bienvenido al Sistema de Conversi�n Monetaria\n'C-H-E-R-S-O', usuario.");
		do 
		{
			v = JOptionPane.showOptionDialog(null, "Seleccionar el Tipo de Conversi�n de Peso MX a:", 
					"Conversi�n Monetaria", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			switch (v) 
			{
				case 1:
					teclado = JOptionPane.showInputDialog(null,"Ingresa la cantidad en Pesos MX", "1 MXN = 0.04934 USD");
					d = Float.parseFloat(teclado);
					conv = (float) (d * 0.04934);
					JOptionPane.showMessageDialog(null, d + " MXN = " + conv + " USD");
					break;
				case 2:
					teclado = JOptionPane.showInputDialog(null,"Ingresa la cantidad en Pesos MX", "1 MXN = 0.04158 EUR");
					e = Float.parseFloat(teclado);
					conv = (float) (e * 0.04158);
					JOptionPane.showMessageDialog(null, e + " MXN = " + conv + " EUR");
					break;
				case 3:
					teclado = JOptionPane.showInputDialog(null,"Ingresa la cantidad en Pesos MX", "1 MXN = 5.1415 JPY");
					y = Float.parseFloat(teclado);
					conv = (float) (y * 5.1415);
					JOptionPane.showMessageDialog(null, y + " MXN = " + conv + " JPY");
					break;
				case 4:
					teclado = JOptionPane.showInputDialog(null,"Ingresa la cantidad en Pesos MX", "1 MXN = 0.3824 HKD");
					hk = Float.parseFloat(teclado);
					conv = (float) (hk * 0.3824);
					JOptionPane.showMessageDialog(null, hk + " MXN = " + conv + " HKD");
					break;
			}
		} while (v != 0);
		JOptionPane.showMessageDialog(null, "Tenga un buen d�a.");
	}
}