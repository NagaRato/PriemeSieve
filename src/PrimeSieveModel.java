import java.util.ArrayList;

public class PrimeSieveModel {

    private final boolean[] primeOrNot;

    public PrimeSieveModel(int limit) {
        primeOrNot = new boolean[limit+1];
        for (int b = 0; b < primeOrNot.length; b++){
            primeOrNot[b] = true;
        }

    }

    public void filterPrimes() {
        for (int f = 2; f < primeOrNot.length; f++) {
            if (primeOrNot[f]) {
                fitlerIntegersDivisibleBy(f);
            }
        }
    }

    private void fitlerIntegersDivisibleBy(int i) {
        for (int d = i*2; d < primeOrNot.length; d += i) {
            primeOrNot[d] = false;
        }
    }

    public ArrayList<Integer> getPrimes() {
        ArrayList<Integer> primeIntegers = new ArrayList<>();

        for (int i = 0; i < primeOrNot.length; i++) {
            if (i > 1 && primeOrNot[i]) {
                primeIntegers.add(i);
            }
        }
        return primeIntegers;
    }
}
