public class Carta {
    private String face;
    private String cor;
    private int valor;

    // Construtor que aceita face, cor e valor
    public Carta(String face, String cor, int valor) {
        this.face = face;
        this.cor = cor;
        this.valor = valor;
    }

    public String getFace() {
        return face;
    }

    public String getCor() {
        return cor;
    }

    public int getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return String.format("%s de %s", face, cor);
    }
}
