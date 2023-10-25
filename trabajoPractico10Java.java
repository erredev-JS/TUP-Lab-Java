import java.util.Scanner;

public class trabajoPractico10Java {
    public static void main(String[] args) {
        // Programa principal

        // Ejercicio 1, 2 y 3

        // Creamos una instancia de la clase Perro
        Perro Dogo = new Perro("Fido", "Dogo", 20);
        Dogo.ladrar();

        // Ejercicio 5

        Circulo radio = new Circulo(5);
        System.out.println("AREA:" + radio.area());
        System.out.println("Circunferencia del círculo: " + radio.circunferencia());

        // Ejercicio 6 y 7

        // Creamos una instancia de la clase Estudiante
        Estudiante estudiante1 = new Estudiante("Uriel", "2506", 30);

        // Ejercicio 8 y 9

        // Creamos una instancia de la clase Libro
        Libro libro1 = new Libro("Harry El Sucio", "Pepe argento", 2010);
        libro1.mostrarInfo();

        // Ejercicio 10 y 11

        // Creamos una instancia de la clase CuentaBancaria
        CuentaBancaria Santander = new CuentaBancaria(200, 1);

        // Ejercicio 12

        // Creamos una instancia de la clase Rectangulo y calculamos su área y perímetro
        Rectangulo rectangulo1 = new Rectangulo(2.50, 40);
        double areaRectangulo = rectangulo1.calcularArea();
        double perimetroRectangulo = rectangulo1.calcularPerimetro();
        System.out.println("El área del rectángulo es: " + areaRectangulo);
        System.out.println("El perímetro del rectángulo es: " + perimetroRectangulo);

        // Ejercicio 13 y 14

        // Creamos una instancia de la clase Coche y llamamos a los métodos
        Coche miCoche = new Coche("Toyota", "Corolla", 2022);
        miCoche.Acelerar();
        miCoche.Frenar();

        // Ejercicio 15

        // Creamos una instancia de la clase Pelicula y llamamos al método para imprimir datos
        Pelicula miPelicula = new Pelicula("Inception", "Christopher Nolan", 148);
        miPelicula.imprimirDatos();
    }

    // Clases

    // Ejercicio 1, 2 y 3
    static class Perro {
        private String nombre;
        private String raza;
        private int edad;

        // Constructor para establecer los valores de nombre, raza y edad
        public Perro(String nombre, String raza, int edad) {
            this.nombre = nombre;
            this.raza = raza;
            this.edad = edad;
        }

        public void ladrar() {
            System.out.println("Guau, guau");
        }
    }

    // Ejercicio 4
    static class Circulo {
        private double radio;

        public Circulo(double radio) {
            this.radio = radio;
        }

        public double area() {
            double area = Math.PI * Math.pow(radio, 2);
            return area;
        }

        public double circunferencia() {
            double circunferencia = 2 * Math.PI * radio;
            return circunferencia;
        }
    }

    // Ejercicio 6 y 7
    static class Estudiante {
        private String nombre;
        private String id;
        private int edad;

        // Constructor para establecer los valores de nombre, id y edad
        public Estudiante(String nombre, String id, int edad) {
            this.nombre = nombre;
            this.id = id;
            this.edad = edad;
        }
    }

    // Ejercicio 8 y 9
    static class Libro {
        private String titulo;
        private String autor;
        private int añoPublicacion;

        public Libro(String titulo, String autor, int añoPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            this.añoPublicacion = añoPublicacion;
        }

        public void mostrarInfo() {
            System.out.println("Título: " + titulo);
            System.out.println("Autor: " + autor);
            System.out.println("Año de Publicación: " + añoPublicacion);
        }
    }

    // Ejercicio 10 y 11
    static class CuentaBancaria {
        private int saldo;
        private int numeroDeCuenta;

        public CuentaBancaria(int saldo, int numeroDeCuenta) {
            this.numeroDeCuenta = numeroDeCuenta;
            this.saldo = saldo;
        }

        public double depositar() {
            Scanner sc = new Scanner(System.in);
            double deposito = sc.nextDouble();
            saldo += deposito;
            return saldo;
        }

        public double retirar() {
            Scanner sc = new Scanner(System.in);
            double retiro = sc.nextDouble();
            saldo -= retiro;
            return saldo;
        }
    }

    // Ejercicio 12
    static class Rectangulo {
        private double ancho;
        private double alto;

        public Rectangulo(double ancho, double alto) {
            this.ancho = ancho;
            this.alto = alto;
        }

        public double calcularArea() {
            double area = ancho * alto;
            return area;
        }

        public double calcularPerimetro() {
            double perimetro = (ancho * 2) + (alto * 2);
            return perimetro;
        }
    }

    // Ejercicio 13 y 14
    static class Coche {
        private String marca;
        private static String modelo;
        private int añoFab;

        public Coche(String marca, String modelo, int añoFab) {
            this.marca = marca;
            this.modelo = modelo;
            this.añoFab = añoFab;
        }

        public void Acelerar() {
            System.out.println("El coche " + modelo + " Aceleró");
        }

        public void Frenar() {
            System.out.println("El coche " + modelo + " Frenó");
        }
    }

    // Ejercicio 15
    static class Pelicula {
        private String titulo;
        private String director;
        private double minutosDuracion;

        public Pelicula(String titulo, String director, double minutosDuracion) {
            this.titulo = titulo;
            this.director = director;
            this.minutosDuracion = minutosDuracion;
        }

        public void imprimirDatos() {
            System.out.println("Director: " + director + " Titulo: " + titulo + " Duracion en minutos: " + minutosDuracion);
        }
    }
}
