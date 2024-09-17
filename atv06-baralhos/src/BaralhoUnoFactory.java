public class BaralhoUnoFactory extends BaralhoFactory {
    @Override
    public BaralhoInterface createBaralho() {
        return new BaralhoUno();  // Cria um baralho Uno
    }

    @Override
    public void preProcessamento() {
        System.out.println("Preparando o baralho Uno...");
    }
}
