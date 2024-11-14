public class Parentesis {
    public static boolean esParentizada (String cadena) {
        boolean esParentizada = false;

        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == '(') {
                for (int j = i + 1; j < cadena.length(); j++) {
                    if (cadena.charAt(j) == ')') {
                        esParentizada = true;
                    } else {
                        esParentizada = false;
                    }
                }
            } else {
                esParentizada = false;
                break;
            }
        }
        return esParentizada;
    }

    public static void main(String[] args) {
        String cadena = "una )cadena (mal (parentizada)";

        System.out.println(esParentizada(cadena));
    }
}
