import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        // Conhecer e importar a classe scanner
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuario e armazenar os valores digitados
        System.out.print("Account number: ");
        int accNumber = sc.nextInt();
        System.out.print("Agency number: ");
        sc.nextLine();
        String accAgencyNumber = sc.nextLine();
        System.out.print("Client name: ");
        String accClientName = sc.nextLine();
        System.out.print("Balance: ");
        double accBalance = sc.nextDouble();

        // Exibir a mensagem conta criada
        System.out.println("Olá " + accClientName
                + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + accAgencyNumber + ", conta "
                + accNumber + " e seu saldo "
                + String.format("%.2f", accBalance) + " já está disponível para saque.");

        sc.close();
    }
}