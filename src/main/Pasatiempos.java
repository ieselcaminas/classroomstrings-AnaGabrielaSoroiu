public class Pasatiempos {
    public static String crearPasatiempo (String cadena) {
        String pasatiempo = "";

        pasatiempo = cadena.replaceAll("[AEIOUaeiou]", ".");

        return pasatiempo;
    }

    public static void main(String[] args) {
        String cadena = "un ejemplo de pasatiempos";

        System.out.println(crearPasatiempo(cadena));
    }
}
