public class Longitud2 {
    public static boolean longitud2(String cadena) {
        String[] palabras = cadena.split(" ");

        boolean existe = false;
        int num = 2;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == num) {
                existe = true;
                break;
            }
        } return existe;
    }

    public static void main(String[] args) {
        String cadena = "esto es una frase";

        System.out.println(longitud2("Sí tiene la longitud indicada."));
    }
}