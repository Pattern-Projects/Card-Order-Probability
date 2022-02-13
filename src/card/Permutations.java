package card;

import static util.Utilities.factorial;

public class Permutations {
    int cap;
    int range;
    Permutation[] permutations;

    public Permutations (int cap) {
        this.cap = cap;
        try {
            range = factorial(cap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        permutations = new Permutation[range];
        populate();
        printPermutation();
    }

    public void populate() {
        System.out.println(cap);
        System.out.println(range);
        for (int i = 0; i < range; i++) {
            var permutation = new Permutation(i, cap);
            permutations[i] = permutation;
        }
    }

    public void printPermutation() {
        for (int i = 0; i < permutations.length; i++) {
            permutations[i].print();
        }
    }

}
