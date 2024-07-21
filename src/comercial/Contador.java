package comercial;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro:");
        // setando o scanner para ler o int requerido
        int parametroUm = terminal.nextInt();
        System.out.println("Digite o segundo parâmetro:");
        // setando o scanner para ler o int requerida (aqui a mesma coisa!)
        int parametroDois = terminal.nextInt();
        
        try {
            // Chamando o método contendo a lógica de contagem
            contar(parametroUm, parametroDois);
        
        } catch (ParametrosInvalidosException e) {
            // Imprimindo a mensagem da exceção
            System.out.println(e.getMessage());
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        // Validar se parametroUm é maior que parametroDois e lançar a exceção
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        int contagem = parametroDois - parametroUm;
        // O for está bem aqui!
        for (int i = 1; i <= contagem; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
