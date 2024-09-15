import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaralhoUno implements BaralhoInterface {
    private List<Carta> deck;
    private static final String[] CORES = {"Vermelho", "Verde", "Azul", "Amarelo"};
    private static final String[] TIPOS = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "+2", "Inverter", "Pular"};
    private static final String[] CORINGAS = {"+4", "Troca de Cor"};

    // Construtor do Baralho Uno
    public BaralhoUno() {
        deck = new ArrayList<>();
        adicionarCartasNormais();
        adicionarCartasEspeciais();
    }

    // Adiciona as cartas normais ao baralho
    private void adicionarCartasNormais() {
        for (String cor : CORES) {
            for (String tipo : TIPOS) {
                deck.add(new Carta(tipo, cor, 0));  // Duas cartas de cada tipo e cor
                deck.add(new Carta(tipo, cor, 0));
            }
        }
    }

    // Adiciona cartas especiais ao baralho
    private void adicionarCartasEspeciais() {
        for (int i = 0; i < 4; i++) {
            deck.add(new Carta(CORINGAS[0], "Coringa", 0));  // Carta "+4"
            deck.add(new Carta(CORINGAS[1], "Coringa", 0));  // Carta "Troca de Cor"
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
        for (Carta card : deck) {
            s.append(card.toString()).append("\n");
        }
        return s.toString();
    }
}
