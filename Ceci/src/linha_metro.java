public class linha_metro {
    private int linha;
    private String cor;
    private String estacao;

    public linha_metro(int linha, String cor, String estacao) {
        this.linha = linha;
        this.cor = cor;
        this.estacao = estacao;

    }

    @Override
    public String toString() {
        return "Linha " + linha +
                "-" + cor +
                " Estação: " + estacao;
    }
}
