package Sistema;
import java.util.ArrayList;
import java.util.Scanner;

public class Motorista
{
    private String nome;
    private String cpf;
    private String telefone;
    private String modal;
    private boolean disponivel;
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public Motorista(String nome, String cpf, String telefone, String modal)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.modal = modal;
        this.disponivel = true;
    }
    
    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public String getModal() {
        return modal;
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public ArrayList<Veiculo> getVeiculos() {
        return veiculos;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setModal(String modal) {
        this.modal = modal;
    }
    
    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public void adicionarVeiculo(String modelo, String ano, String cor, String placa, String assento, int tamanhoPortaMalas) {
        Carro c = new Carro(modelo, ano, cor, placa, assento, tamanhoPortaMalas);
        veiculos.add(c);
    }
    
    public void adicionarVeiculo(String modelo, String ano, String cor, String placa, String cc) {
        Moto m = new Moto(modelo, ano, cor, placa, cc);
        veiculos.add(m);
    }
}

