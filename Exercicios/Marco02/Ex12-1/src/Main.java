public class Main {
    public static void main(String[] args) {
        PilhaVet pilhaVet = new PilhaVet(20);
        System.out.println(pilhaVet.palindromo("Ovo"));
        System.out.println(pilhaVet.palindromo("aibofobia"));
        System.out.println(pilhaVet.palindromo("anilina"));
        System.out.println(pilhaVet.palindromo("arara"));
        System.out.println(pilhaVet.palindromo("mamam"));
        System.out.println(pilhaVet.palindromo("matam"));
        System.out.println(pilhaVet.palindromo("omissíssimo"));
        System.out.println(pilhaVet.palindromo("radar"));
        System.out.println(pilhaVet.palindromo("reviver"));
        System.out.println(pilhaVet.palindromo("Mateus")); // testando uma nao palindroma

        System.out.println(pilhaVet.top());

    }
}
