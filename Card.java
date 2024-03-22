public class Card {
    // suit
    // value

    public static void getCards(){
    
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
        for (String suit : suits) {
            
            for (String value : values) {
                System.out.println(value + suit);
            }
        }
    }

    public static void main(String[] args){
        getCards();
    }
}
