public class Digitos {
    public static int digitos(String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (Character.isDigit(cadena.charAt(i))) {
                contador++;
            }
        } return contador;

    }

    public static void main(String[] args) {
        String cadena = "un 1 y un 20";
        int resultado;

        resultado = digitos(cadena);

        System.out.println("Tiene " + resultado + " digitos.");
    }
}