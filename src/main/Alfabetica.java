public class Alfabetica {
    public static boolean esAlfabetica(String palabra) {
        boolean alfabetica = false;

        for (int i = 0; i < palabra.length() - 1; i++) {
            if (palabra.charAt(i) > palabra.charAt(i + 1)) {
                alfabetica = false;
            } else {
                alfabetica = true;
            }
        } return alfabetica;
    }


    public static void main(String[] args) {
        String palabra = "abcd";

        System.out.println(esAlfabetica(palabra));
    }
}
