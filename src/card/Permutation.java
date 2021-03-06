package card;

import static card.Permutations.record;
import static util.Math.factorial;

public class Permutation {
    int [] permutation;
    int index, cap, a, x;

    public Permutation(int index, int cap) {
        permutation = new int[cap];
        this.index = index;
        this.cap = cap;
        this.a = (int) (index / cap);
        this.x = index % cap;

        calculatePermutation();

    }

    public void calculatePermutation() {
        for (int i = 0; i < cap; i++) {
            permutation[i] = value(i);
        }
    }

    public int value (int position) {
        //index, position, a, x, cap
        int b = 0;
        try {
            b = factorial(cap - position);
        } catch (Exception e) {
            e.printStackTrace();
        }

        int shift = 0;
        try {
            shift = ((index + 1)/factorial(cap-position))-position; //TODO: Solve solution
        } catch (Exception e) {
            e.printStackTrace();
        }
        int result = (shift) % cap;

        record.append("position: " + position);
        record.append("b (factorial(cap-i)): " + b);
        record.append("shift: " + shift);
        record.append("result: " + result);
        record.append("\n");

        return result;
    }

    public void print() {
        StringBuilder string = new StringBuilder();
        for (int i = 0; i < permutation.length; i++) {
            string.append(permutation[i]);
            if (i < permutation.length-1)
                string.append(",");
        }
        record.append(string.toString());
    }



}
