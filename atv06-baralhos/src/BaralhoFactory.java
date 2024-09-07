
public class BaralhoFactory {
    public static BaralhoInterface createBaralho(String tipo) {
        if (tipo.equalsIgnoreCase("tradicional")) {
            return new BaralhoTradicional();
        } else if (tipo.equalsIgnoreCase("uno")) {
            return new BaralhoUno();
        } else {
            throw new IllegalArgumentException("Tipo de baralho desconhecido: " + tipo);
        }
    }
}

