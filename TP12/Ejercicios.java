import java.util.ArrayList;
class Ejercicios {
    public static void main(String[] args) {
        // Ejercicio 1

        String endWithDigit = "\\d$";
        String cadena = "Pepito5";
        System.out.println(cadena.matches(endWithDigit));

        // Ejercicio 2

        String startWithDigit = "^\\d";
        cadena = "5pepe";
        System.out.println(cadena.matches(startWithDigit));

        // Ejercicio 3

        cadena = "Abfg"; // Ejemplo de cadena que cumple con el rango
        System.out.println(cadena.matches("^[a-zA-Z]{5,10}$"));

        // Ejercicio 4

        String dni = "12-345-678"; // Ejemplo de DNI válido
        System.out.println(dni.matches("^\\d{2}-\\d{3}-\\d{3}$"));

        // Ejercicio 5

        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> listaDeCorreos = new ArrayList<>();
        listaDeCorreos.add("correo1@example.com");
        listaDeCorreos.add("correo2@openai");
        listaDeCorreos.add("correo3@example.com");

        String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";

        for (String email : listaDeCorreos) {
            if (email.matches(emailRegex)) {
                emails.add(email);
            }
        }

        System.out.println("Correos electrónicos válidos:");
        for (String validEmail : emails) {
            System.out.println(validEmail);
        }
        // Ejercicio 6

        cadena = "Esta es una cadena que contiene abc en algún lugar.";

       System.out.println(cadena.contains("abc"));

    }


}
