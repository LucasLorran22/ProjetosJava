import java.util.Scanner;

public class Main {

    public static double somar(double primeiro_numero, double segundo_numero){
        return primeiro_numero + segundo_numero;
    }

    public static double subtrair(double primeiro_numero, double segundo_numero){
        return primeiro_numero - segundo_numero;
    }

    public static double multiplicar(double primeiro_numero, double segundo_numero){
        return primeiro_numero * segundo_numero;
    }

    public static double dividir(double primeiro_numero, double segundo_numero){
        return primeiro_numero / segundo_numero;
    }

    public static double lerPrimeiroValor(Scanner scanner){
        double primeiroNumero;

        System.out.println("Informe o primeiro número:");
        primeiroNumero = scanner.nextDouble();

        return primeiroNumero;
    }

    public static double lerSegundoValor(Scanner scanner){
        double segundoNumero;

        System.out.println("Informe o segundo número:");
        segundoNumero = scanner.nextDouble();

        return segundoNumero;
    }    

    public static void main(String[] args) {

        String operador;
        double primeiroNumero, segundoNumero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Java\n");

        System.out.println("Informe o operador: (+ - x /)\n Soma(+) \n Subtração(-) \n Multiplicação (x) \n Divisão (/)");
        operador = scanner.nextLine();

        primeiroNumero = lerPrimeiroValor(scanner);

        segundoNumero = lerSegundoValor(scanner);

        while (segundoNumero == 0 && operador.equals("/")) {
            System.out.println("Não é possível dividir por zero (0)!");
            segundoNumero = lerSegundoValor(scanner);
        }

        switch (operador){
            case "+":
                System.out.println(somar(primeiroNumero, segundoNumero));
                break;
            case "-":
                System.out.println(subtrair(primeiroNumero,segundoNumero));
                break;
            case "x":
                System.out.println(multiplicar(primeiroNumero,segundoNumero));
                break;
            case "/":
                System.out.println(dividir(primeiroNumero,segundoNumero));
                break;
            default:
                System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}
