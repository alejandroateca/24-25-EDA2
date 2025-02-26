public class SumaObjetivo {
    public static int[] encontrarIndices(int[] numeros, int objetivo) {
        int maxValor = Integer.MIN_VALUE;
        for (int num : numeros) {
            if (num > maxValor) {
                maxValor = num;
            }
        }

        int[] vistos = new int[maxValor + 1];
        for (int i = 0; i < vistos.length; i++) {
            vistos[i] = -1;
        }

        for (int i = 0; i < numeros.length; i++) {
            int complemento = objetivo - numeros[i];
            if (complemento >= 0 && complemento <= maxValor && vistos[complemento] != -1) {
                return new int[]{vistos[complemento], i};
            }
            vistos[numeros[i]] = i;
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] numeros = {3, 2, 9, 8};
        int objetivo = 10;

        int[] resultado = encontrarIndices(numeros, objetivo);
        System.out.println("Solución: [" + resultado[0] + ", " + resultado[1] + "]");
    }
}
