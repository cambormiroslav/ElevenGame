package caduhrd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cambor, Duracka, Hrdlicka
 */
public class Deck {
    private Card[] cards;
    private List<Card> onTable;
    private boolean[] putAway;

    public Deck() {
        this.cards = new Card[52];
        this.onTable = new ArrayList<>();
        this.putAway = new boolean[52];
    }
    
    private void updateTable(){
        
    }
    
    public Card generateRandomCard(){
        
    }
    
    public Card generateRandomDeck(){
        
    }
    
    public boolean replaceChosenCards(){
        
    }
    
    private boolean checkDeck(){
        
    }

    public List<Card> getOnTable() {
        return onTable;
    }

    public boolean[] getPutAway() {
        return putAway;
    }

    @Override
    public String toString() {
        return "Deck{" + "cards=" + cards + ", onTable=" + onTable + ", putAway=" + putAway + '}';
    }
}
