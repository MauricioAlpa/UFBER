package Sistema;

public class Trajeto {
    private Localizacao origem;
    private Localizacao destino;

    public Trajeto(Localizacao origem, Localizacao destino) {
        this.origem = origem;
        this.destino = destino;
    }

    public Localizacao getOrigem() {
        return origem;
    }

    public Localizacao getDestino() {
        return destino;
    }
}
