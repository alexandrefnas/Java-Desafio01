import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome completo:");
        String nomeCliente = scanner.next();
        
        System.out.println("Digite o número da conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite numero da agência:");
        String numeroAgencia = scanner.next();
        
        System.out.println("Digite o seu saldo:");
        BigDecimal saldo = scanner.nextBigDecimal();

        
        //imprimindo os dados obtidos pelo usuario
        System.out.println(
                "Ola " + nomeCliente.toUpperCase() + ", obrigado por criar uma conta em nosso banco, sua agência " 
                        + numeroAgencia.toUpperCase() + ",\n conta " + numeroConta + " e seu saldo "
                        + saldo + " já está disponível para saque.");

        scanner.close();
          
    }
    
}
