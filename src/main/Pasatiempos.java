public class Pasatiempos {
    public static String pasatiempos (String cadena) {
        String pasatiempo = "";

        for (int i = 0; i < cadena.length(); i++) {
           pasatiempo = cadena.replaceAll("[AEIOUaeiou]", ".");
        } return pasatiempo;

    }

    public static void main(String[] args) {
        String cadena = "un ejemplo de pasatiempos";

        System.out.println(pasatiempos(cadena));
    }
}
