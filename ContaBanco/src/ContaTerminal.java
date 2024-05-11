import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia, nome_cliente;
        double saldo;

        System.out.println("Bem-vindo ao Banco Dio!");
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();
        System.out.println("Por favor, informe a Agência: ");
        agencia = scanner.nextLine();
        System.out.println("Por favor, insira o nome do cliente: ");
        nome_cliente = scanner.nextLine();
        System.out.println("Por favor, coloque o saldo da conta: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nome_cliente + " obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
