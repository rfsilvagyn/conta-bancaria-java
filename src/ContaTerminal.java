import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String agencia;
        int conta;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o Nome do Cliente:");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o número da Agência:");
        agencia = sc.next();

        System.out.println("Por favor, digite o número da Conta Corrente:");
        conta = sc.nextInt();

        System.out.println("Por favor, digite o Saldo:");
        saldo = sc.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia
                        + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");

        sc.close();
    }
}
