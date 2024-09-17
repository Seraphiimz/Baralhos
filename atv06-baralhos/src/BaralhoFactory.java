public abstract class BaralhoFactory {
    // Método Factory que será implementado pelas subclasses
    public abstract BaralhoInterface createBaralho();

    // Hook: método opcional que pode ser sobrescrito pelas subclasses
    public void preProcessamento() {
        // Operações que podem ser feitas antes de criar o baralho (opcional)
        System.out.println("Processando baralho antes da criação...");
    }

    // Método template
    public BaralhoInterface criar() {
        preProcessamento();
        BaralhoInterface baralho = createBaralho();
        posProcessamento();
        return baralho;
    }

    // Hook: método opcional que pode ser sobrescrito pelas subclasses
    public void posProcessamento() {
        // Operações que podem ser feitas após criar o baralho (opcional)
        System.out.println("Processamento finalizado.");
    }
}
