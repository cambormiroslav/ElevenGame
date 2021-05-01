package caduhrd;

import java.util.ArrayList;
import java.util.List;
import elevengame.*;
import java.util.Collections;

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
        generateRandomDeck();
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
     * not implemented yet
     * @return nothing
     */
    public Card generateRandomCard() {
        throw new UnsupportedOperationException("Zatím neimplementováno.");
    }

    /**
     * generate random deck
     * Mira
     */
    private void generateRandomDeck() {
        String[] symbols = DataStore.loadSymbols();
        String[] values = DataStore.loadValues();
        int[] points = DataStore.loadNPoints();
        
        for (int i = 0; i < symbols.length; i++) {
            for (int j = 0; j < values.length; j++) {
                for (int k = 0; k < points.length; k++) {
                    cards.add(new Card(symbols[i], values[j], points[k]));
                }
            }
        }
        Collections.shuffle(cards);
    }

    /**
     * call checking cards if can be chosen
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
     * call checking cards if can be chosen
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
     * getter of List reprezented cards on table
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
     * remove the last card from deck of random cards
     */
    private void removeCardFromCards(int number){
        cards.remove(number - 1);
    }
    
    /**
     * check if is won game
     * if not return false
     * @return boolean value 
     */
    public boolean isWonGame(){
        return (cards.size() == 0)?(true):(false);
    }
}
