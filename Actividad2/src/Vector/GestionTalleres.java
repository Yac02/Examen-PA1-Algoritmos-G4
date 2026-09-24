/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vector;

import static Vector.Datos.encontrarMayorMenor;
import static Vector.Datos.insertar;
import static Vector.Datos.mostrarVector;
import static Vector.Datos.ordenarBurbuja;

/**
 *
 * @author Lenovo
 */
public class GestionTalleres
{
    public static void main(String[] args)
    {
        int[] inscritos = {28, 15, 34, 21, 19, 40, 12, 26};
        
        System.out.println("=== VECTOR ORIGINAL ===");
        mostrarVector(inscritos);
        
         System.out.println("\n=== MAYOR Y MENOR ===");
        encontrarMayorMenor(inscritos);

        System.out.println("\n=== INSERTAR 99 EN POSICIÓN 3 ===");
        inscritos = insertar(inscritos, 99, 3);
        mostrarVector(inscritos);

        System.out.println("\n=== VECTOR ORDENADO (BURBUJA) ===");
        ordenarBurbuja(inscritos);
        mostrarVector(inscritos);
    }
}
