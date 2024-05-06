import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome");
        String nome = scanner.next();
        
        System.out.println("Digite o numero da Agencia");
        String agencia = scanner.next();

        System.out.println("Digite o número da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Digite swu Saldo");
        double saldo = scanner.nextDouble();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println("Ola " + nome );

        System.out.println("O número da conta é " + conta + " o número da agencia é " + agencia);

        System.out.println("Meu Saldo é " + saldo);
        
        
    }
}
