package src;


import java.util.Scanner;

public class ContaTerminal{
    public static void main (String[] args){
        System.out.println("hello");
        Scanner sc = new Scanner(System.in);

        System.out.println("Bom dia, qual é seu nome?");
        String name = sc.next();
        System.out.println("Por favor, digite o número da Conta !");
        int account = sc.nextInt();
        System.out.println("Por favor, digite o número da Agência !");
        int agencyNumber = sc.nextInt();
        System.out.println("Por favor, digite o saldo atual da sua conta.");
        double balance = sc.nextDouble();

        System.out.println("Olá " + name + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencyNumber +", conta "+ account+" e seu saldo "+ balance +" já está disponível para saque");
    }




}
