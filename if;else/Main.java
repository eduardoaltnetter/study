public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número:");
        int num2 = scanner.nextInt();

        System.out.println("Digite a operação (+, -, *, /):");
        String operation = scanner.next();

        if (operation.equals("+")) {
            System.out.println("Resultado: " + (num1 + num2));
        } else if (operation.equals("-")) {
            System.out.println("Resultado: " + (num1 - num2));
        } else if (operation.equals("*")) {
            System.out.println("Resultado: " + (num1 * num2));
        } else if (operation.equals("/")) {
            if (num2 != 0) {
                System.out.println("Resultado: " + (num1 / num2));
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operação inválida.");
        }
    }
}