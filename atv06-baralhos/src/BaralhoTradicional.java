import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaralhoTradicional implements BaralhoInterface {
    private List<Carta> deck;
    private static final int NUMBER_OF_CARDS = 52; 
    private static final String[] FACES = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    private static final String[] NAIPES = {"\u2665", "\u2666", "\u2663", "\u2660"}; 

    public BaralhoTradicional() {
        deck = new ArrayList<>();
        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            deck.add(new Carta(FACES[i % 13], NAIPES[i / 13], 0));
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(deck);
    }

    @Override
    public Carta dealCard() {
        return deck.size() > 0 ? deck.remove(deck.size() - 1) : null;
    }

    @Override
    public int size() {
        return deck.size();
    }

    @Override
    public List<Carta> getDeck() {
        return deck;  // Implementação do método getDeck
    }

    @Override
    public String toString() {
        return deck.toString();
    }
}
