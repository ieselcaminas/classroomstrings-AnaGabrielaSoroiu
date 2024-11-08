public class Invertida {
    public static String invertir(String cadena) {
        String[] palabras = cadena.split(" ");
        String invertida = "";

        for (int i = palabras.length - 1; i >= 0; i--) {
            invertida += palabras[i] + " ";
        } return invertida;
    }

    public static void main(String[] args) {
        String cadena = "esto es una frase";

        System.out.println(invertir(cadena));
    }
}
