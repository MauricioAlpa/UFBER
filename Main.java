import Sistema.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) 
    {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Usuario ou Motorista?");
        String user = leitor.nextLine();
        
        
        if(user.equalsIgnoreCase("usuario")){
            System.out.println("O que você deseja fazer?");
            System.out.println("1)Pedir Corrida");
        }
    }
}
