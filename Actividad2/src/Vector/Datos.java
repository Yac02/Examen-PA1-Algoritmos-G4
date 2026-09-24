/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;

/**
 *
 * @author Lenovo
 */
public class Datos 
{   
    public static void mostrarVector(int[] v)
    {
        System.out.print("[ ");
        for (int i = 0; i < v.length; i++) 
        {
            System.out.print(v[i]);
            if (i < v.length - 1) System.out.print(", ");
        }
        System.out.println(" ]");
    }
    
    public static void encontrarMayorMenor(int[] v) 
    {
        int mayor = v[0], menor = v[0];
        int posMayor = 0, posMenor = 0;
        for (int i = 1; i < v.length; i++) 
        {
            if (v[i] > mayor) 
            { 
                mayor = v[i]; posMayor = i; 
            }
            if (v[i] < menor) 
            { 
                menor = v[i]; posMenor = i; 
            }
        }
        System.out.println("Mayor: " + mayor + " (índice " + posMayor + ")");
        System.out.println("Menor: " + menor + " (índice " + posMenor + ")");
    }

    public static int[] insertar(int[] v, int valor, int posicion) 
    {
        if (posicion < 0 || posicion > v.length) 
        {
            System.out.println("Posición inválida.");
            return v;
        }
        int[] nuevo = new int[v.length + 1];
        for (int i = 0; i < posicion; i++) nuevo[i] = v[i];
        nuevo[posicion] = valor;
        for (int i = posicion; i < v.length; i++) nuevo[i + 1] = v[i];
        return nuevo;
    }

    public static void ordenarBurbuja(int[] v) 
    {
        int n = v.length;
        boolean huboIntercambio;
        for (int i = 0; i < n - 1; i++) 
        {
            huboIntercambio = false;
            for (int j = 0; j < n - 1 - i; j++) 
            {
                if (v[j] > v[j + 1]) 
                {
                    int temp = v[j];
                    v[j] = v[j + 1];
                    v[j + 1] = temp;
                    huboIntercambio = true;
                }
            }
            if (!huboIntercambio) break;
        }
    }
}
