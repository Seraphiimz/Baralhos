
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BaralhoUno implements BaralhoInterface {
    private List<Carta> deck;
    private Random randomNumbers;

    public BaralhoUno() {
        String cores[] = {"Vermelho", "Verde", "Azul", "Amarelo"};
        String tipos[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+2", "Inverter", "Pular"};

        deck = new ArrayList<>();
        randomNumbers = new Random();

        // Adicionando cartas de Uno
        for (String cor : cores) {
            for (String tipo : tipos) {
                deck.add(new Carta(tipo, cor, 0));  // Duas cartas de cada tipo e cor
                deck.add(new Carta(tipo, cor, 0));
            }
        }

        // Adicionando cartas especiais (+4 e troca de cor)
        for (int i = 0; i < 4; i++) {
            deck.add(new Carta("+4", "Coringa", 0));
            deck.add(new Carta("Troca de Cor", "Coringa", 0));
        }
    }

    @Override
    public void shuffle() {
        for (int i = 0; i < deck.size(); i++) {
            int second = randomNumbers.nextInt(deck.size());
            Carta temp = deck.remove(second);
            deck.add(0, temp);
        }
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
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (Carta card : deck) {
            s.append(card.toString()).append("\n");
        }
        return s.toString();
    }
}
