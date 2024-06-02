import java.util.Scanner;

public class ContaTerminal1 {

    static int numero;
    static String agencia;
    static String nomeCliente;
    static float saldo =237.48f;

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o numero nome!");
        nomeCliente = sc.nextLine();
        System.out.println("Por favor, digite o numero da Agencia !");
        agencia = sc.next();
        System.out.println("Por favor, digite o numero da Conta");
        numero = sc.nextInt();

        System.out.println("Ola " + nomeCliente + " ,obrigado por criar uma conta em nosso banco, sua agencia e " +agencia + " conta " +numero + " e seu saldo "+ saldo +" já esta disponivel para saque");


    }
}
