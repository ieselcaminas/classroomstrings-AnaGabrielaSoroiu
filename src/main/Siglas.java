public class Siglas {
    public static String siglas (String[] cadena) {
        String siglas = "";

        for (int i = 0; i < cadena.length; i++) {

           if (Character.isUpperCase(cadena[i].charAt(0))) {
             siglas += cadena[i].charAt(0);
           }
        } return siglas;
    }

    public static void main(String[] args) {
        String[] cadena = new String[] {"Escuela", "Oficial", "de", "Idiomas"};

        System.out.println(siglas(cadena));
    }
}
