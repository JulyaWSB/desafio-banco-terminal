import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu número:");
        int número = scanner.nextInt();

        System.out.println("Digite sua Agência:");
        String Agência = scanner.next();

        System.out.println("Digite seu nome:");
        String nome = scanner.next();
        
        System.out.println("Digite seu Saldo:");
        double Saldo = scanner.nextDouble();

        System.out.println("Ola " + nome + ", " + "obrigada por criar uma conta em nosso banco, sua agência é: " + Agência + ", " + "sua conta: " + número+ ", e seu saldo é: " + Saldo);
        
        
    }
}

