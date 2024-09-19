import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        float saldo_conta = 237.48f;

        Scanner scanner = new Scanner (System.in);
        
        System.out.println("Bem vindo ao Banco DIO. Digite abaixo o seu NOME: ");
        String nome = scanner.next();

        System.out.printf("Olá, %s! É bom te ter conosco. Por favor, digite abaixo o número da sua conta.\n", nome);
        int numero_conta = scanner.nextInt();

        System.out.printf ("Perfeito. O número da sua conta é %d \n", numero_conta);
        System.out.printf ("Digite o número da sua agência abaixo: \n");

        String agencia = scanner.next();

        System.out.printf("Sua agência é a %s \n", agencia);

        System.out.println ("Processando todos os seus dados...");
        System.out.println (".");
        System.out.println ("..");
        System.out.println ("...");
        scanner.close();

        System.out.printf ("Olá, %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo de %.2f já está disponível para saque!", nome, agencia, numero_conta, saldo_conta);



}
}