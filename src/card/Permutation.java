package card;

import card.Permutations;

import static util.Utilities.factorial;

public class Permutation {
    int [] permutation;
    int index, cap, a, x;

    public Permutation(int index, int cap) {
        permutation = new int[cap];
        this.index = index;
        this.cap = cap;
        this.a = (int) index / cap;
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

        int shift = a + b + x + (cap - position); //TODO: Calculate shift
        int result = (shift) % cap;

        System.out.println("index: " + index);
        System.out.println("a: " + a);
        System.out.println("x: " + x);
        System.out.println("position: " + position);
        System.out.println("cap: " + cap);
        System.out.println("b: " + b);
        System.out.println("shift: " + shift);
        System.out.println("result: " + result);
        System.out.println();

        return result;
    }

    public void print() {
        for (int i = 0; i < permutation.length; i++) {
            System.out.print(permutation[i]);
            if (i < permutation.length-1)
                System.out.print(",");
        }
        System.out.println();
    }



}
