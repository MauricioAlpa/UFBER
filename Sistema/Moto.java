package Sistema;

public class Moto extends Veiculo
{
    private String cilindradas;

    public Moto(String modelo, String ano, String cor, String placa, String cilindradas)
    {
        super(modelo, ano, cor, placa);
        this.cilindradas = cilindradas;
    }
}
