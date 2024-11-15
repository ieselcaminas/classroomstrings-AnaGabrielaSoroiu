public class Parentesis {
    public static boolean esParentizada (String cadena) {
        boolean esParentizada = false;
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                contador++;
            } else if (cadena.charAt(i) == ')') {
                contador--;
            }
        }

        if (contador == 0) {
            esParentizada = true;
        } else {
            esParentizada = false;
        }
        return esParentizada;
    }

    public static void main(String[] args) {
        String cadena = "Esto (es (un ejemplo) (de) una (cadena bien) parentizada)";

        System.out.println(esParentizada(cadena));
    }
}
