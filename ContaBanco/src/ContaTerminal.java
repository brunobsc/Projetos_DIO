import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
	public static void main(String[] args) {
		int numero;
		String agencia;
		String nomeCliente;
		float saldo;
		
		Scanner sc = new Scanner (System.in).useLocale(Locale.US);
		
		System.out.println("Informe seu nome completo: ");
		nomeCliente = sc.nextLine();
		
		System.out.println("Informe o numero de sua conta: ");
		numero = sc.nextInt();
		
		System.out.println("Informe a agencia: ");
		agencia = sc.next();
		
		System.out.println("Informe seu saldo: ");
		saldo = sc.nextFloat();
		
		System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",nomeCliente, agencia, numero, saldo );
		
		
	}
}
