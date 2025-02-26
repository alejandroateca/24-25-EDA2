public class PuntoEquilibrio {
    public static int encontrarPuntoEquilibrio(int[] numeros) {
        int sumaTotal = 0, sumaIzquierda = 0;
        
        for (int num : numeros) {
            sumaTotal += num;
        }
        
        for (int i = 0; i < numeros.length; i++) {
            if (sumaIzquierda == sumaTotal - sumaIzquierda - numeros[i]) {
                return i;
            }
            sumaIzquierda += numeros[i];
        }
        
        return -1;
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println("Punto de equilibrio: " + encontrarPuntoEquilibrio(numeros));
    }
}
