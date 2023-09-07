import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmetro");
        int parametroUm = terminal.nextInt();

        System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();

        try {
            contar(parametroUm, parametroDois);

        } catch (ParametrosInvalidosException exception) {
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");
        }

    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {

        int contagem;
        if (parametroUm < parametroDois) {
            contagem = (parametroDois - parametroUm) + 1;
            for (int i = 1; contagem > i ; i++) {
                System.out.println("Imprimindo o número " + i );
            }
        } else {
            throw new ParametrosInvalidosException();
        }
    }
}
