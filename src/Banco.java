import java.util.Scanner;

public class Banco {

    public static void main(String[] args) {

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.print("Por favor, digite o código da agência: ");
        agencia = scanner.next();
        System.out.print("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();
        System.out.print("Por favor, digite o saldo do cliente: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    }

}
