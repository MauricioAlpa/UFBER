package Sistema;

public class Veiculo
{
    private String modelo;
    private String ano;
    private String cor;
    private String placa;
    
    public Veiculo(String modelo, String ano, String cor, String placa)
    {
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    // Getters
    public String getModelo() {
        return this.modelo;
    }

    public String getAno() {
        return this.ano;
    }
    
    public String getCor() {
        return this.cor;
    }
    
    public String getPlaca() {
        return this.placa;
    }

    // Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }
    
    public void setCor(String cor) {
        this.cor = cor;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
