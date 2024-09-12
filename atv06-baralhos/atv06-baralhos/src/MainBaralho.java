// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

public class MainBaralho
{
   // executa o aplicativo
	public static void main(String[] args) {
		BaralhoFactory baralhoTradicionalFactory = new BaralhoTradicionalFactory();
        BaralhoFactory baralhoUnoFactory = new BaralhoUnoFactory();
        
        BaralhoInterface baralhoTradicional = baralhoTradicionalFactory.createBaralho();
        BaralhoInterface baralhoUno = baralhoUnoFactory.createBaralho();
        
        // Teste o baralho tradicional
        System.out.println("Baralho Tradicional:");
        baralhoTradicional.shuffle();
        System.out.println(baralhoTradicional);

        // Teste o baralho Uno
        System.out.println("\nBaralho Uno:");
        baralhoUno.shuffle();
        System.out.println(baralhoUno);
   } // fim de main
} // fim da classe DeckOfCardsTest


