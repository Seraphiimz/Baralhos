// Fig. 7.11: DeckOfCardsTest.java
// Aplicativo de embaralhar e distribuir cartas.

public class MainBaralho {
   // executa o aplicativo
   public static void main(String[] args) {
       // Cria o baralho tradicional usando o tipo 1
       BaralhoInterface baralhoTradicional = BaralhoFactory.createBaralho(1);
       
       // Cria o baralho Uno usando o tipo 2
       BaralhoInterface baralhoUno = BaralhoFactory.createBaralho(2);
       
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


