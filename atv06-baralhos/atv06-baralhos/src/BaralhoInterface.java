import java.util.List;

public interface BaralhoInterface {
    void shuffle();
    Carta dealCard();
    int size();
    List<Carta> getDeck();
}
