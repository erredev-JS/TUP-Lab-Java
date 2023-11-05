import java.util.ArrayList;
public class ValidacionDeDatos {



    public class Main {
        public static void main(String[] args) {
            ArrayList<String> datos = new ArrayList<>();

            datos.add("correo1@example.com");
            datos.add("correo2@openai");
            datos.add("123-456-7890");
            datos.add("987654321");
            datos.add("2023-10-25");
            datos.add("25/10/23");
            datos.add("12345");
            datos.add("ABCDE1234");

            for (String dato : datos) {
                if (validarEmail(dato)) {
                    System.out.println("Correo electrónico válido: " + dato);
                } else if (validarNumeroDeTelefono(dato)) {
                    System.out.println("Número de teléfono válido: " + dato);
                } else if (validarFecha(dato)) {
                    System.out.println("Fecha válida: " + dato);
                } else if (validarCodigoPostal(dato)) {
                    System.out.println("Código postal válido: " + dato);
                } else {
                    System.out.println("Dato no válido: " + dato);
                }
            }
        }

        public static boolean validarEmail(String email) {
            // Expresión regular para validar direcciones de correo electrónico
            String emailRegex = "^[A-Za-z0-9+_.-]+@(.+)$";
            return email.matches(emailRegex);
        }

        public static boolean validarNumeroDeTelefono(String telefono) {
            // Expresión regular para validar números de teléfono
            String telefonoRegex = "^[0-9]{3}-[0-9]{3}-[0-9]{4}$";
            return telefono.matches(telefonoRegex);
        }

        public static boolean validarFecha(String fecha) {
            // Expresión regular para validar fechas en formato "yyyy-MM-dd"
            String fechaRegex = "\\d{4}-\\d{2}-\\d{2}";
            return fecha.matches(fechaRegex);
        }

        public static boolean validarCodigoPostal(String codigoPostal) {
            // Expresión regular para validar códigos postales de 5 dígitos
            String codigoPostalRegex = "^[0-9]{5}$";
            return codigoPostal.matches(codigoPostalRegex);
        }
    }

}
