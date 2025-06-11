package Sistema;
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Ufber
{
    private ArrayList<Motorista> motoristas = new ArrayList<>();
    private ArrayList<Passageiro> passageiros = new ArrayList<>();
    private ArrayList<Corrida> corridas = new ArrayList<>();
    private Scanner leitor = new Scanner(System.in);
    
    public void adicionarMotorista(Motorista m) {
        motoristas.add(m);
    }
    
    
    public void adicionarPassageiro(Passageiro p) { 
        passageiros.add(p);
    }
    
    public void pedirCorrida(Passageiro passageiro, String tipoDeCorrida, String embarque, String desembarque) {
        System.out.println("Qual o tipo de veículo (Carro/Moto): ");
        String veiculo = leitor.nextLine();

        System.out.println("Qual a distância total da corrida:");
        String entrada = leitor.nextLine();
        int distancia = Integer.parseInt(entrada);

        for(Motorista m : motoristas){
            if(m.isDisponivel() && m.getModal().equalsIgnoreCase(veiculo)){
                double valor = Corrida.calcularValor(veiculo, tipoDeCorrida, distancia);

                Corrida novaCorrida = new Corrida(veiculo, tipoDeCorrida, embarque, desembarque, LocalDateTime.now(), valor);
            
                m.setDisponivel(false);
                passageiro.adicionarCorrida(novaCorrida);

                System.out.println("Corrida solicitada para o passageiro " + passageiro.getNome() +
                               ", seu motorista será: " + m.getNome() + 
                               ". Valor da corrida: R$" + valor);
                return;
            }
        }
        System.out.println("Nenhum motorista disponível no momento.");
    }   
}
