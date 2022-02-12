package card;

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

    public int factorial(int n) throws Exception {
        //Todo: Enum for factorial results
        if (n < 1) {
            throw new Exception("(n < 1) not allowed"); //TODO: Write own exception
        } else if (n > 17) {
            throw new Exception("(n > 17) not allowed for resource protection");
        }
        int result = 1;
        for (; n > 0 ; n--) {
            result *= n;
        }
        return result;
    }

    public void printPermutation() {
        for (int i = 0; i < permutations.length; i++) {
            permutations[i].print();
        }
    }

}
