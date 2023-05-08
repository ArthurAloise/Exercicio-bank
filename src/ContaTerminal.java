import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência! ");
        int numeroAgencia = scan.nextInt()
                ;
        String agencia = "067-8";
        double saldo = 200d;
        String nomeCliente = "MARIO ANDRADE";

        if(numeroAgencia == 1021){
            System.out.println("Olá " + nomeCliente +
                    ", obrigado por criar uma conta em nosso banco, sua agência é "
                    + agencia + ", conta " +numeroAgencia+ " e seu saldo R$"
                    + saldo + " já está disponível para saque.");
        }
    }
}
