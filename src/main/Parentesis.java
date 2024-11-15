public class Parentesis {
    public static boolean esParentizada (String cadena) {
        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                contador++;
            } else if (cadena.charAt(i) == ')') {
                contador--;
                if (contador < 0) {
                    return false;
                }
            }
        }
        return contador == 0;
    }

    public static void main(String[] args) {
        String cadena = "una )cadena (mal (parentizada)";

        System.out.println(esParentizada(cadena));
    }
}
