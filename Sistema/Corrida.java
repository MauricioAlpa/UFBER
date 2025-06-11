package Sistema;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Corrida
{
    private String tipoDeCorrida;
    private Trajeto trajeto;
    private LocalDateTime horarioSolicitacao;
    private double valor;
    private Scanner leitor = new Scanner(System.in);
    
    public Corrida(String tipoDeCorrida, LocalDateTime horarioSolicitacao, double valor)
    {
        this.tipoDeCorrida = tipoDeCorrida;
        this.horarioSolicitacao = horarioSolicitacao;
        this.valor = 0;
    }
    
    public Corrida(LocalDateTime horarioSolicitacao, double valor)
    {
        System.out.println("Qual o tipo de corrida? ");
        this.tipoDeCorrida = leitor.nextLine();
        this.horarioSolicitacao = horarioSolicitacao;
        this.valor = 0;
    }
    
    public String getTipoDeCorrida() {
        return this.tipoDeCorrida;
    }
    
    public LocalDateTime getHorarioSolicitacao() {
        return horarioSolicitacao;
    }  
    
    public double getValor() {
        return this.valor;
    }
    
    public void setTipoDeCorrida(String tipoDeCorrida) {
        this.tipoDeCorrida = tipoDeCorrida;
    }

    public void setHorarioSolicitacao(LocalDateTime horarioSolicitacao) {
        this.horarioSolicitacao = horarioSolicitacao;
    }
    
    public double calculaValor() 
    {
        if(this.tipoDeCorrida.equals("corrida")) {
            return 
        }
    }
}
 