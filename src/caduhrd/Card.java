
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

    public String getSymbol() {
        return symbol;
    }

    public String getValue() {
        return value;
    }

    public int getPoint() {
        return point;
    }
}
