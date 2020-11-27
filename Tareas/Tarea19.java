/*
 * 
 * 
 * Nombre: JAMC Matr: 1915173 Hora: N2
 * Serie C (TAREA 19)
 * Calcular e imprimir la Serie para los N primeros términos
 * [2, - 3, - 5, - 7 , 4 , 6, - 9, - 11, - 13, 8, 10, 12, -15, -17, -19, 14, ...]
 * 
 * 
 * 
 */

import java.util.Scanner;

public class Tarea19 
{
    public static void main(String[] args) 
    {
        @SuppressWarnings("resource")
		Scanner s = new Scanner(System.in);
        int n, c = 1, c1 = 3, c2 = 1, c3 = 1;
        System.out.print("| Ingresa la Cantidad de Números a Mostrar |: ");
        n = s.nextInt();
        do
        {
            for(int i = 1; i < c+1; i++)
            {   
                if(c2 < n+1)
                {
                	System.out.print("["+(2*c3)+"] ");
                	c2++;
                	c3++;
                }   
            }
            c++;
            for(int j = 1; j < 4; j++)
            {
                if(c2 < n+1)
                {
                	System.out.print("["+(-1*c1)+"] ");
                	c1 = c1 + 2;
                	c2++;                    
                }
            }
        } while(c2 < n+1);
    }
}