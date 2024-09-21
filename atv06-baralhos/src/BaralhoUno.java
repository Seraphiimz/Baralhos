import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaralhoUno implements BaralhoInterface {
    private List<Carta> deck;
    private static final String[] CORES = {"Vermelho", "Verde", "Azul", "Amarelo"};
    private static final String[] TIPOS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+2", "Inverter", "Pular"};
    private static final String[] CORINGAS = {"+4", "Troca de Cor"};

    public BaralhoUno() {
        deck = new ArrayList<>();
        for (String cor : CORES) {
            for (String tipo : TIPOS) {
                deck.add(new Carta(tipo, cor, 0)); 
                deck.add(new Carta(tipo, cor, 0));
            }
        }
        
        for (int i = 0; i < 4; i++) {
            deck.add(new Carta(CORINGAS[0], "Coringa", 0));
            deck.add(new Carta(CORINGAS[1], "Coringa", 0));
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
