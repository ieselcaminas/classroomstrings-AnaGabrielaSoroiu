public class Longitud3 {
    public static boolean longitud3(String cadena) {
        String[] palabras = cadena.split(" ");
        boolean largo = false;
        int num = 6;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() >= num) {
                largo = true;
                break;
            }
        } return largo;
    }

    public static void main(String[] args) {
        String cadena = "esto es una frase";

        System.out.println(longitud3(cadena));
    }
}

