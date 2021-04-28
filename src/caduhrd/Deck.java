package caduhrd;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cambor, Duracka, Hrdlicka
 */
public class Deck {

    private List<Card> cards;
    private List<Card> onTable;

    public Deck() {
        this.cards = new ArrayList<>();
        this.onTable = new ArrayList<>();
    }

    /**
     * for two cards
     * Mira
     */
    public void updateTable(int first, int second) {
        if(checkDeck(first, second)){
            
        }
    }
    
    /**
     * for three cards
     * Mira
     */
    public void updateTable(int first, int second, int third) {
        if(checkDeck(first, second, third)){
            
        }
    }

    /**
     *
     * @return
     */
    public Card generateRandomCard() {

    }

    /**
     *
     * @return
     */
    public Card generateRandomDeck() {

    }

    /**
     *
     * @return
     */
    public boolean replaceChosenCards() {

    }

    /**
     * for two cards
     * Mira
     * @return value of boolean
     */
    private boolean checkDeck(int first, int second) {
        if((onTable.get(first).getPoint() +  onTable.get(second).getPoint()) == 11){
            return true;
        }
        return false;
    }
    
    /**
     * for three cards
     * Mira
     * @param first
     * @param second
     * @param third
     * @return value of boolean
     */
    private boolean checkDeck(int first, int second, int third) {
        if((onTable.get(first).getPoint() +  onTable.get(second).getPoint() + onTable.get(third).getPoint()) == 0){
            return true;
        }
        return false;
    }

    /**
     *
     * @return
     */
    public List<Card> getOnTable() {
        return onTable;
    }

    @Override
    public String toString() {
        return "Deck{" + "cards=" + cards + ", onTable=" + onTable + '}';
    }
}
