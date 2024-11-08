public class Longitud {
    public static int longitud(String cadena) {
        String palabras[] = cadena.split(" ");
        int caracteres = 4;
        int contador = 0;

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].length() == caracteres) {
                contador++;
            }
        } return contador;
    }

    public static void main(String[] args) {
        String cadena = "Hola qué tal";
        int resultado;

        resultado = longitud(cadena);

        System.out.println(resultado);
    }
}