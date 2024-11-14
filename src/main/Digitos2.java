public class Digitos2 {
    public static int esNumero (String cadena) {
        int contador = 0;
        boolean esNumero = true;
        String[] palabras = cadena.split(" ");

        for (int i = 0; i < palabras.length; i++) {
            esNumero = true;

            for (int j = 0; j < palabras[i].length(); j++) {
                if (!Character.isDigit(palabras[i].charAt(j))) {
                    esNumero = false;
                    break;
                }
            }

            if (esNumero) {
                contador++;
            }
        } return contador;
    }

    public static void main(String[] args) {
        String cadena = "1 20 hola 234 45a";

        System.out.println(esNumero(cadena));
    }
}
