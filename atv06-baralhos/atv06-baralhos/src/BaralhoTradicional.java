
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaralhoTradicional implements BaralhoInterface {
    private List<Carta> deck;  // Baralho de cartas
    private final int NUMBER_OF_CARDS = 52; // Quantidade de cartas
    private Random randomNumbers;

    // Construtor do Baralho Tradicional
    public BaralhoTradicional() {
        String faces[] = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Valete", "Dama", "Rei"};
        String naipes[] = {"\u2665", "\u2666", "\u2663", "\u2660"}; // ♥ ♦ ♣ ♠

        deck = new ArrayList<>();
        randomNumbers = new Random();

        // Criando as cartas do baralho tradicional
        for (int count = 0; count < NUMBER_OF_CARDS; count++) {
            deck.add(new Carta(faces[count % 13], naipes[count / 13], 0, naipes[count / 13].equals("\u2665") || naipes[count / 13].equals("\u2666") ? Cor.VERMELHO : Cor.PRETO));
        }
    }

    // Embaralhar as cartas
    @Override
    public void shuffle() {
        for (int i = 0; i < deck.size(); i++) {
            int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
            Carta temp = deck.remove(second);
            deck.add(0, temp);
        }
    }

    // Distribuir carta do topo
    @Override
    public Carta dealCard() {
        return deck.size() > 0 ? deck.remove(deck.size() - 1) : null;
    }

    @Override
    public int size() {
        return deck.size();
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        int column = 0;
        for (Carta card : deck) {
            column++;
            s.append(card.toString()).append("   ");
            if (column % 4 == 0) {
                s.append("\n");
            }
        }
        return s.toString();
    }
}
