public class Somatorio {
    public static int somatorio(int n){
        if (n == 0){
            return 0;
        }else{
            return somatorio(n-1)+n;
        }
    }
}
