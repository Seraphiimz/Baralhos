// BaralhoFactory.java
public class BaralhoFactory {
    public static BaralhoInterface createBaralho(int tipo) {
        if (tipo == 1) {
            return new BaralhoTradicional();  // Cria um baralho tradicional
        } else if (tipo == 2) {
            return new BaralhoUno();  // Cria um baralho Uno
        } else {
            throw new IllegalArgumentException("Tipo de baralho inválido");
        }
    }
}
