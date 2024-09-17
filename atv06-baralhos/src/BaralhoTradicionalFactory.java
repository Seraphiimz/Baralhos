public class BaralhoTradicionalFactory extends BaralhoFactory {
    @Override
    public BaralhoInterface createBaralho() {
        return new BaralhoTradicional();  // Cria um baralho tradicional
    }

    @Override
    public void preProcessamento() {
        System.out.println("Preparando o baralho tradicional...");
    }
}
