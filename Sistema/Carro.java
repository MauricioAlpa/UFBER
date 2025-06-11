package Sistema;


public class Carro extends Veiculo
{
    private String numAssentos;
    private int tamanhoPortaMalas;

    public Carro(String modelo, String ano, String cor, String placa, String numAssentos, int tamanhoPortaMalas)
    {
        super(modelo, ano, cor, placa);
        this.numAssentos = numAssentos;
        this.tamanhoPortaMalas = tamanhoPortaMalas;
    }
}
