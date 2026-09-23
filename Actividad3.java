//hecho por Johann

public class Actividad3 {

    public static void main(String[] args) {

        // Matriz de 4 aulas y 5 horarios
        int[][] matriz = {
            {20, 25, 18, 30, 22},
            {15, 28, 24, 19, 26},
            {32, 20, 27, 25, 21},
            {18, 22, 16, 29, 24}
        };

        // ----------------------------------------
        // MOSTRAR LA MATRIZ
        // ----------------------------------------

        System.out.println("MATRIZ DE OCUPACION");
        System.out.println();

        System.out.println("        H0  H1  H2  H3  H4");

        for (int fila = 0; fila < matriz.length; fila++) {

            System.out.print("Aula " + fila + ": ");

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                System.out.print(matriz[fila][columna] + "  ");

            }

            System.out.println();
        }


        // ----------------------------------------
        // TOTAL DE ESTUDIANTES POR AULA
        // ----------------------------------------

        System.out.println();
        System.out.println("TOTAL DE ESTUDIANTES POR AULA");

        for (int fila = 0; fila < matriz.length; fila++) {

            int total = 0;

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                total = total + matriz[fila][columna];

            }

            System.out.println("Aula " + fila + " = " + total + " estudiantes");
        }


        // ----------------------------------------
        // TOTAL DE ESTUDIANTES POR HORARIO
        // ----------------------------------------

        System.out.println();
        System.out.println("TOTAL DE ESTUDIANTES POR HORARIO");

        for (int columna = 0; columna < matriz[0].length; columna++) {

            int total = 0;

            for (int fila = 0; fila < matriz.length; fila++) {

                total = total + matriz[fila][columna];

            }

            System.out.println("Horario " + columna + " = " + total + " estudiantes");
        }


        // ----------------------------------------
        // BUSCAR LA MAYOR OCUPACION
        // ----------------------------------------

        int mayor = matriz[0][0];

        int filaMayor = 0;
        int columnaMayor = 0;

        for (int fila = 0; fila < matriz.length; fila++) {

            for (int columna = 0; columna < matriz[fila].length; columna++) {

                if (matriz[fila][columna] > mayor) {

                    mayor = matriz[fila][columna];

                    filaMayor = fila;

                    columnaMayor = columna;
                }
            }
        }


        // ----------------------------------------
        // RESULTADO DE LA MAYOR OCUPACION
        // ----------------------------------------

        System.out.println();
        System.out.println("MAYOR OCUPACION");

        System.out.println("Mayor cantidad de estudiantes: " + mayor);

        System.out.println("Aula: " + filaMayor);

        System.out.println("Horario: " + columnaMayor);

    }
}