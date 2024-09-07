// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

public class MainBaralho
{
   // executa o aplicativo
	public static void main(String[] args) {
        BaralhoInterface baralhoTradicional = BaralhoFactory.createBaralho("tradicional");
        BaralhoInterface baralhoUno = BaralhoFactory.createBaralho("uno");
	  
        // Teste o baralho tradicional
        System.out.println("Baralho Tradicional:");
        baralhoTradicional.shuffle();
        System.out.println(baralhoTradicional);

        // Teste o baralho Uno
        System.out.println("\nBaralho Uno:");
        baralhoUno.shuffle();
        System.out.println(baralhoUno);

        // Distribuindo cartas do baralho Uno
        System.out.println("\nDistribuindo 10 cartas do baralho Uno:");
        for (int i = 0; i < 10; i++) {
            System.out.println(baralhoUno.dealCard());
        }
   } // fim de main
} // fim da classe DeckOfCardsTest


