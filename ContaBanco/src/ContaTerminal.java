import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        System.out.println("Seja bem-vindo a seu banco!");
    
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu numero de conta");
        int numero = scanner.nextInt();
        
        System.out.println("Digite sua agencia ");
        String agencia = scanner.next();

        
        scanner.nextLine();

        System.out.println("Digite seu nome ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo");
        float saldo = scanner.nextFloat();

        scanner.close();


        System.out.println("Olá " +  nome + ", obrigado por criar uma conta em nosso banco, sua agência é "
        + agencia + ", conta " + numero + " e seu saldo "+ saldo + " já está disponível para saque.");

    }
}
