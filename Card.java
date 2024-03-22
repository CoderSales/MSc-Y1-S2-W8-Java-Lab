public class Card {
    // suit
    /*
     * Number   
     * 
     * hearts
     * diamonds
     * clubs
     * spades
     *    
     * 
     * 13 cards
     * 
     *  1- 10
     * AJQK
     * 
     * array suits
     * 
     * array values
     * 
     * 2 for loops
     */
    // value

    public static void getCards(){
    
    String[] suits = {"Hearts", "Diamonds", "Spades", "Clubs"};

    String[] values = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    
        for (String suit : suits) {
            
            for (String value : values) {
                System.out.println(suit + value);
            }
        }
    }

    public static void main(String[] args){
        getCards();
    }
}
