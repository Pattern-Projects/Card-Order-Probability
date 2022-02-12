package card;

public class Permutation {
    int [] permutation;

    public Permutation(int seed, int cap) {
        permutation = new int[cap];
        for (int i = 0; i < cap; i++) {
            int value = ((seed + i) + ( i * (int)(seed/cap) )) % cap; //TODO: Repair formula
            permutation[value] = i+1;
        }
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
