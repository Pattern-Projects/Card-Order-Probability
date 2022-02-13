package ui;

import card.Card;
import card.Permutations;

import static card.Card.test;

public class CardUI {
    public static void main (String... args) {
        test(); //TODO: Remove if unused
        new CardUI(3);
    }

    public CardUI (int n) {
        new Permutations(n);
    }
}
