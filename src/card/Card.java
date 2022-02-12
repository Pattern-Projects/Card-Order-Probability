package card;
public class Card {

    public static int cap;
    public int value;

    {cap++;}

    public void setCap (int cap) {
        this.cap = cap;
    }

    public void describe() {
        System.out.println("Card: "+value);
        System.out.println("High Neighbour: "+highNeighbour());
        System.out.println("Low Neighbour: "+lowNeighbour());
        System.out.println();
    }

    public int highNeighbour () {
        return (value+1 > cap) ? 1 : value+1;
    }

    public int lowNeighbour () {
        return (value-1 < 1) ? cap : value-1;
    }

    public static void test() {
        System.out.println("Card");
    }

    public Card () {
        this.value = cap;
        System.out.println("new Card: "+ value);
    }
}
