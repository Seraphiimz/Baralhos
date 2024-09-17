// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.
import java.util.List;

public class MainBaralho {
	// executa o aplicativo
    public static void main(String[] args) {
        BaralhoFactory baralhoTradicionalFactory = new BaralhoTradicionalFactory();
        BaralhoFactory baralhoUnoFactory = new BaralhoUnoFactory();

        BaralhoInterface baralhoTradicional = baralhoTradicionalFactory.criar();
        BaralhoInterface baralhoUno = baralhoUnoFactory.criar();

        System.out.println("Baralho Tradicional:");
        baralhoTradicional.shuffle();
        imprimirBaralhoComLimitePorLinha(baralhoTradicional.getDeck());

        System.out.println("\nBaralho Uno:");
        baralhoUno.shuffle();
        imprimirBaralhoComLimitePorLinha(baralhoUno.getDeck());
    }

    // Método auxiliar para impressão com limite por linha
    private static void imprimirBaralhoComLimitePorLinha(List<Carta> baralho) {
        final int MAX_CARDS_PER_LINE = 5;  // Número máximo de cartas por linha
        int count = 0;
        
        for (Carta carta : baralho) {
            System.out.print(carta + "  ");  // Imprime a carta na mesma linha
            count++;
            
            // Se alcançou o limite por linha, pula para a próxima
            if (count % MAX_CARDS_PER_LINE == 0) {
                System.out.println();  // Pula para a próxima linha
            }
        }
        
        // Pular uma linha no final, caso o último grupo de cartas não preencha a linha completa
        if (count % MAX_CARDS_PER_LINE != 0) {
            System.out.println();
        }
    } // fim de main
} // fim da classe DeckOfCardsTest
