public class BusquedaPalabra {
    public static int[] encontrarIndices(char[] caracteres, String palabra) {
        int[] indices = new int[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);
            indices[i] = -1;
            for (int j = 0; j < caracteres.length; j++) {
                if (caracteres[j] == letra) {
                    indices[i] = j;
                    break;
                }
            }
            if (indices[i] == -1) {
                return new int[]{-1};
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        char[] caracteres = {'a', 'c', 'd', 'i', 'm', 'r', 't', 'u'};
        String palabra = "dia";

        int[] resultado = encontrarIndices(caracteres, palabra);
        System.out.print("Solución: [");
        for (int i = 0; i < resultado.length; i++) {
            System.out.print(resultado[i] + (i < resultado.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }
}