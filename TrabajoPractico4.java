import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TrabajoPractico4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int opcion;

        do {
            System.out.println("Elija un ejercicio (1-10, 0 para salir):");
            opcion = sc.nextInt();
            sc.nextLine(); // Consumir la nueva línea

            switch (opcion) {
                case 1 -> ejercicio1(sc);
                case 2 -> ejercicio2(sc);
                case 3 -> ejercicio3(sc);
                case 4 -> ejercicio4();
                case 5 -> ejercicio5(sc);
                case 6 -> ejercicio6(sc);
                case 7 -> ejercicio7(sc);
                case 8 -> ejercicio8(sc);
                case 9 -> ejercicio9();
                case 10 -> ejercicio10(sc);
                case 0 -> System.out.println("¡Hasta luego!");
                default -> System.out.println("Opción no válida. Intente nuevamente.");
            }
        } while (opcion != 0);
    }

    // Ejercicio 1 - Calcular la media de una serie de números que se leen por teclado
    public static void ejercicio1(Scanner sc) {
        int[] numbers = new int[10];
        int evenNum = 0, oddNum = 0, even = 0, odd = 0;
        System.out.println("Ingresa 10 números");
        for (int i = 1; i <= 10; i++) {
            numbers[i - 1] = sc.nextInt();
            if (numbers[i - 1] >= 0) {
                evenNum += numbers[i - 1];
                even++;
            } else {
                oddNum += numbers[i - 1];
                odd++;
            }
        }
        System.out.println("Los números ingresados fueron: " + Arrays.toString(numbers));
        System.out.println("El promedio de los números positivos: " + evenNum / even);
        System.out.println("El promedio de los números negativos: " + oddNum / odd);
    }

    // Ejercicio 2 - Calcular la media de los números en las posiciones pares de un array
    public static void ejercicio2(Scanner sc) {
        int[] array = new int[10];
        int suma = 0, contador = 0;
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingresa el numero de la posición " + i);
            array[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            if (i % 2 != 0) {
                suma += array[i];
                contador++;
            }
        }
        System.out.println("La media de los numeros en las posiciones impares del array es: " + suma / contador);
    }

    // Ejercicio 3 - Calcular la media de notas de alumnos y mostrar los que superan la media
    public static void ejercicio3(Scanner sc) {
        System.out.println("Ingrese la cantidad de estudiantes");
        int cantStudents = sc.nextInt();
        double[] studentMarks = new double[cantStudents];
        double markSum = 0, average;

        for (int i = 0; i < cantStudents; i++) {
            int aux = 1;
            do {
                System.out.println("Ingrese la nota del alumno " + (i + 1));
                studentMarks[i] = sc.nextDouble();
                if (studentMarks[i] <= 10 && studentMarks[i] > 0) {
                    markSum += studentMarks[i];
                    aux = 0;
                } else {
                    System.out.println("Ingrese una nota válida");
                }
            } while (aux == 1);
        }

        average = markSum / cantStudents;
        System.out.println("La media de notas es de " + average);
        System.out.println("Alumnos que superan la media de notas:");
        for (int i = 0; i < cantStudents; i++) {
            if (studentMarks[i] > average) {
                System.out.println("Alumno " + (i + 1) + ": " + studentMarks[i]);
            }
        }
    }

    // Ejercicio 4 - Crear un array de números pares y mostrar su contenido
    public static void ejercicio4() {
        int[] Pares = new int[20];
        for (int i = 0; i < 20; i++) {
            Pares[i] = i * 2;
        }
        System.out.println("Contenido del array de números pares:");
        System.out.println(Arrays.toString(Pares));
    }

    // Ejercicio 5 - Contar números positivos, negativos y ceros en un array
    public static void ejercicio5(Scanner sc) {
        int[] array = new int[10];
        int positiveCount = 0, negativeCount = 0, zeroCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero para la posición " + i);
            array[i] = sc.nextInt();
            if (array[i] > 0) {
                positiveCount++;
            } else if (array[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }
        }
        System.out.println("Cantidad de números positivos: " + positiveCount);
        System.out.println("Cantidad de números negativos: " + negativeCount);
        System.out.println("Cantidad de ceros: " + zeroCount);
    }

    // Ejercicio 6 - Calcular la media de valores positivos y negativos en un array
    public static void ejercicio6(Scanner sc) {
        int[] array = new int[10];
        int positiveSum = 0, negativeSum = 0, positiveCount = 0, negativeCount = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese un número entero para la posición " + i);
            array[i] = sc.nextInt();
            if (array[i] > 0) {
                positiveSum += array[i];
                positiveCount++;
            } else if (array[i] < 0) {
                negativeSum += array[i];
                negativeCount++;
            }
        }
        double positiveAverage = positiveCount > 0 ? (double) positiveSum / positiveCount : 0;
        double negativeAverage = negativeCount > 0 ? (double) negativeSum / negativeCount : 0;
        System.out.println("Promedio de números positivos: " + positiveAverage);
        System.out.println("Promedio de números negativos: " + negativeAverage);
    }

    // Ejercicio 7 - Calcular la altura media y contar personas por encima/por debajo de la media
    public static void ejercicio7(Scanner sc) {
        System.out.println("Ingrese la cantidad de personas:");
        int cantidadPersonas = sc.nextInt();
        if (cantidadPersonas > 0) {
            int[] alturas = new int[cantidadPersonas];
            int sumaAlturas = 0;

            for (int i = 0; i < cantidadPersonas; i++) {
                System.out.println("Ingresar la altura de la persona en centímetros: " + (i + 1));
                int altura = sc.nextInt();
                alturas[i] = altura;
                sumaAlturas += altura;
            }
            double alturaMedia = sumaAlturas / (double) cantidadPersonas;
            int inferior = 0;
            int superior = 0;
            for (int i = 0; i < cantidadPersonas; i++) {
                if (alturas[i] > alturaMedia) {
                    inferior += 1;
                } else {
                    superior += 1;
                }
            }
            System.out.println("La altura media: " + alturaMedia);
            System.out.println("Personas con alturas INFERIORES a la media: " + inferior);
            System.out.println("Personas con alturas SUPERIORES a la media: " + superior);
        } else {
            System.out.println("El número ingresado no es un número positivo, reinicie el programa");
        }
    }

    // Ejercicio 8 - Encontrar el empleado con el sueldo más alto
    public static void ejercicio8(Scanner sc) {
        String[] nombres = new String[5];
        double[] sueldos = new double[5];
        double mayorSueldo = 0;
        int empleado = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Nombre del empleado:");
            nombres[i] = sc.nextLine();
            System.out.println("Sueldo:");
            sueldos[i] = sc.nextDouble();
            sc.nextLine(); // Consumir la nueva línea
            if (sueldos[i] > mayorSueldo) {
                mayorSueldo = sueldos[i];
                empleado = i;
            }
        }
        System.out.println("El empleado que más gana es " + nombres[empleado] + " y gana " + mayorSueldo);
    }

    // Ejercicio 9 - Llenar un array con números aleatorios
    public static void ejercicio9() {
        Random rand = new Random();
        int[] arr = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100) + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    // Ejercicio 10 - Sumar dos matrices de números enteros
    public static void ejercicio10(Scanner sc) {
        System.out.println("Ingrese el número de filas:");
        int filas = sc.nextInt();
        System.out.println("Ingrese el número de columnas:");
        int columnas = sc.nextInt();
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];

        System.out.println("Ingrese la matriz A:");
        leerMatriz(matrizA, sc);
        System.out.println("Ingrese la matriz B:");
        leerMatriz(matrizB, sc);

        int[][] matrizC = sumarMatrices(matrizA, matrizB);

        System.out.println("Matriz A:");
        mostrarMatriz(matrizA);
        System.out.println("Matriz B:");
        mostrarMatriz(matrizB);
        System.out.println("Matriz C (A + B):");
        mostrarMatriz(matrizC);
    }

    // Función para leer una matriz de números enteros desde la entrada estándar
    public static void leerMatriz(int[][] matriz, Scanner sc) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.printf("Ingrese el número para la posición [%d][%d]:%n", i, j);
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    // Función para mostrar una matriz de números enteros
    public static void mostrarMatriz(int[][] matriz) {
        for (int[] ints : matriz) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }

    // Función para sumar dos matrices de números enteros
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return matrizC;
    }
}
