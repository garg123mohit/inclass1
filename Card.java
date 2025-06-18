public class Card {

    public static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    
    private int value; 
    private String suit;

    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public String getSuit() {
        return suit;
    }
    
    public void setSuit(String suit) {
        this.suit = suit;
    }
}