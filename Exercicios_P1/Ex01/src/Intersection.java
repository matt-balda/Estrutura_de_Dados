public class Intersection {

    public static int[] interseccaoDoisVetores(int[] vet1, int[] vet2) {
        int aux[] = new int[vet1.length];
        for (int i = 0; i < vet1.length; i++) {
            for (int j = 0; j < vet2.length; j++) {
                if (vet1[i] == vet2[j]) {
                    aux[i] = vet1[i];
                    break;
                }
            }
        }
        return aux;
    }
}
