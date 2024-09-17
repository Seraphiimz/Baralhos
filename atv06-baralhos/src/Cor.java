public enum Cor {
    // Cores do Baralho Tradicional
    VERMELHO("\u001B[31m", "vermelho"),
    PRETO("\u001B[30m", "preto"), 
    
    // Cores do Baralho Uno
    AZUL("\u001B[34m", "azul"),
    VERDE("\u001B[32m", "verde"),
    AMARELO("\u001B[33m", "amarelo"),
    VERMELHO_UNO("\u001B[31m", "vermelho"), 

    RESET("\u001B[0m", "reset");

    private final String ansiCode;
    private final String nome;

    Cor(String ansiCode, String nome) {
        this.ansiCode = ansiCode;
        this.nome = nome;
    }

    public String ansiCode() {
        return this.ansiCode;
    }

    public String getNome() {
        return this.nome;
    }
}
