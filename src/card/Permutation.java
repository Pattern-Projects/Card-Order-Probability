package card;

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
        int shift = 0; //TODO: Calculate shift
        return (position +  shift) % cap + 1;
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
