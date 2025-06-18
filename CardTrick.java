    import java.util.Scanner;
public class CardTrick {

    
    public static void main(String[] args) {
        Card[] hand = new Card[7];
        
        for(int i = 0; i < hand.length; i++) {
            Card card = new Card();
            
            card.setValue((int)(Math.random() * 13) + 1);
            
            card.setSuit(Card.SUITS[(int)(Math.random() * 4)]);
            
            hand[i] = card;
        }
        
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a  card value (1-13): ");
        int userValue = input.nextInt();
        System.out.println("Enter a suit (0-3 where 0=Hearts, 1=Diamonds, 2=Clubs, 3=Spades):");
        int userSuit = input.nextInt();
        
        Card userCard = new Card();
        userCard.setValue(userValue);
        userCard.setSuit(Card.SUITS[userSuit]);
        

        Card luckyCard = new Card();
        luckyCard.setValue(7);  
        luckyCard.setSuit(Card.SUITS[2]);  
        
        boolean found = false;
        for(Card card : hand) {
            if(card.getValue() == luckyCard.getValue() && 
               card.getSuit().equals(luckyCard.getSuit())) {
                found = true;
                break;
            }
        }
        if(found) {
            System.out.println("Congratulations! Your lucky card was in the magic hand!");
        } else {
            System.out.println("Sorry, your lucky card was not in the magic hand.");
        }
    }
}