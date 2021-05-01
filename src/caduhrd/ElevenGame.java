package caduhrd;

import elevengame.*;
import java.util.List;
/**
 *
 * @author Cambor, Duracka, Hrdlicka
 */
public class ElevenGame implements GameInterface{
    
    Deck decks;

    public ElevenGame() {
        this.decks = new Deck();
    }

    @Override
    public String getName() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int nCards() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getDeckSize() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getCardDescriptionAt(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean anotherPlayIsPossible() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean playAndReplace(List<Integer> iSelectedCards) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isWon() {
        return (decks.isWonGame())?(true):(false);
    }

}
