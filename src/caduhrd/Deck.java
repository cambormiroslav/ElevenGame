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
     * updates table cards and remove from cards deck
     * for two cards
     * Mira
     */
    private void updateTable(int first, int second) {
        onTable.add(first - 1, cards.get(cards.size() - 1));
        removeCardFromCards(cards.size());
        onTable.add(second - 1, cards.get(cards.size() - 1));
        removeCardFromCards(cards.size());
    }
    
    /**
     * updates table cards and remove from cards deck 
     * for three cards
     * Mira
     */
    private void updateTable(int first, int second, int third) {
        onTable.add(first - 1, cards.get(cards.size() - 1));
        removeCardFromCards(cards.size());
        onTable.add(second - 1, cards.get(cards.size() - 1));
        removeCardFromCards(cards.size());
        onTable.add(third - 1, cards.get(cards.size() - 1));
        removeCardFromCards(cards.size());
    }

    /**
     *
     * @return
     */
    public Card generateRandomCard() {
        
    }

    /**
     *
     * Mira
     * @return
     */
    public Card generateRandomDeck() {
        
    }

    /**
     * call checking cards
     * if can be remove call updateTable
     * (three cards)
     * Mira
     */
    public void replaceChosenCards(int first, int second) {
        if(checkDeck(first, second)){
            updateTable(first, second);
        }
    }
    
    /**
     * call checking cards
     * if can be remove call updateTable
     * (two cards)
     * Mira
     */
    public void replaceChosenCards(int first, int second, int third) {
        if(checkDeck(first, second, third)){
             updateTable(first, second);
        }
    }

    /**
     * check cards if can be remove (two cards)
     * Mira
     * @return value of boolean
     */
    private boolean checkDeck(int first, int second) {
        if((onTable.get(first - 1).getPoint() +  onTable.get(second - 1).getPoint()) == 11){
            return true;
        }
        return false;
    }
    
    /**
     * check cards if can be remove (three cards)
     * Mira
     * @param first
     * @param second
     * @param third
     * @return value of boolean
     */
    private boolean checkDeck(int first, int second, int third) {
        if((onTable.get(first - 1).getPoint() +  onTable.get(second - 1).getPoint() + onTable.get(third - 1).getPoint()) == 0){
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
    
    /**
     * 
     */
    private void removeCardFromCards(int number){
        cards.remove(number - 1);
    }
}
