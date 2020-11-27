/*
 * 
 * 
 * Nombre: JAMC Matr: 1915173 Hora: N2
 * Serie A (TAREA 17)
 * Calcular e imprimir la Serie para los N primeros términos
 * [1, 8, 243, 16384, 1953125, ...]
 * 
 * 
 */

import java.util.Scanner;

public class Tarea17 
{
	public static void main(String[] args) 
	{
		@SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
		System.out.print("| Ingrese la Cantidad de Elementos a Mostrar |: ");
		int n = s.nextInt();
		for (int i = 1; i < n+1; i++) 
		{
			int e = (2 * i - 1);
			int w = (int) (Math.pow(i, e));
			System.out.print("["+w+"] ");
		}
	}
}