package card;

import util.TextFile;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static util.Math.factorial;

public class Permutations {
    int cap;
    int range;
    Permutation[] permutations;

    static TextFile record;

    public Permutations (int cap) {
        record = new TextFile(Path.of("..\\test_folder\\records"));
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
        record.append("cap: " + cap);
        record.append("digits: 1 - " + cap);
        record.append("range: " + range);
        record.append("indexes: 1 - " + range);
        record.append("\n");

        for (int i = 0; i < range; i++) {
            record.append("Permutation of index: " + i);
            record.append("index = a.cap + x:");
            record.append("\ta: " + (int) (i / cap));
            record.append("\tx: " + i % cap);
            var permutation = new Permutation(i, cap);

            record.append("\n");

            permutations[i] = permutation;
        }

    }

    public void printPermutation() {
        for (Permutation permutation : permutations) {
            permutation.print();
        }
    }

}
