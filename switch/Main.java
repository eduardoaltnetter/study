import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String resposta = "s";

        while (resposta.equalsIgnoreCase("s")) {

            System.out.println("Digite o primeiro número:");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int num2 = scanner.nextInt();

            System.out.println("Digite a operação (+, -, *, /):");
            String operation = scanner.next();

            switch (operation) {

                case "+":
                    System.out.println("Resultado: " + (num1 + num2));
                    break;

                case "-":
                    System.out.println("Resultado: " + (num1 - num2));
                    break;

                case "*":
                    System.out.println("Resultado: " + (num1 * num2));
                    break;

                case "/":
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: divisão por zero");
                    }
                    break;

                default:
                    System.out.println("Operação inválida");
            }

            System.out.println("Deseja realizar outra operação? (s/n)");
            resposta = scanner.next();
        }

        System.out.println("Programa encerrado.");
    }
}