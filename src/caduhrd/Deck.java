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
     *
     */
    private void updateTable() {

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
     *
     * @return
     */
    private boolean checkDeck() {

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
        return "Deck{" + "cards=" + cards + ", onTable=" + onTable + ", putAway=" + putAway + '}';
    }
}
