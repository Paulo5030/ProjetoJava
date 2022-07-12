public class ExercicioMultiplos {
    public static void main(String args[]) { // todos os numeros inteiros ate 1000
        for( int e = 0; e <= 1000; e ++) {
            if (e % 3 == 0) //o simbolo % tem como resultado o resto da divisão entre 2 números, neste caso e/3
            System.out.println(e);
        }
    }
}
