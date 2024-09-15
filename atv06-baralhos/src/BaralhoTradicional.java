import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaralhoTradicional implements BaralhoInterface {
    private List<Carta> deck;  // Baralho de cartas
    private static final int NUMBER_OF_CARDS = 52; // Quantidade de cartas
    private static final String[] FACES = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
    private static final String[] NAIPES = {"\u2665", "\u2666", "\u2663", "\u2660"}; // ♥ ♦ ♣ ♠

    // Construtor do Baralho Tradicional
    public BaralhoTradicional() {
        deck = new ArrayList<>();
        // Criando as cartas do baralho tradicional
        for (int count = 0; count < NUMBER_OF_CARDS; count++) {
            deck.add(new Carta(FACES[count % 13], NAIPES[count / 13], 0, 
                NAIPES[count / 13].equals("\u2665") || NAIPES[count / 13].equals("\u2666") ? Cor.VERMELHO : Cor.PRETO));
        }
    }

    // Embaralhar as cartas
    @Override
    public void shuffle() {
        Collections.shuffle(deck);  // Utiliza o método da classe Collections para embaralhar a lista
    }

    // Distribuir carta do topo
    @Override
    public Carta dealCard() {
        return deck.size() > 0 ? deck.remove(deck.size() - 1) : null;
    }

    // Retornar o tamanho do baralho
    @Override
    public int size() {
        return deck.size();
    }

    // Representação em string do baralho
    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        int column = 0;
        for (Carta card : deck) {
            s.append(card.toString()).append("   ");
            column++;
            if (column % 4 == 0) {
                s.append("\n");
            }
        }
        return s.toString();
    }
}
