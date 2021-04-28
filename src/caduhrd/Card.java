
package caduhrd;

/**
 *
 * @author Cambor, Duracka, Hrdlicka
 */
public class Card {
    private String symbol;
    private String value;
    private int point;

    public Card(String symbol, String value, int point) {
        this.symbol = symbol;
        this.value = value;
        this.point = point;
    }

    /**
     * 
     * @return 
     */
    public String getSymbol() {
        return symbol;
    }

    /**
     * 
     * @return 
     */
    public String getValue() {
        return value;
    }
    
    /**
     * 
     * @return 
     */
    public int getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return "Card{" + "symbol=" + symbol + ", value=" + value + ", point=" + point + '}';
    }
}
