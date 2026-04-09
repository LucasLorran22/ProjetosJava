import java.util.Scanner;

public class Main {

    public static double somar(double primeiro_numero, double segundo_numero){

        double result;

        result = primeiro_numero + segundo_numero;

        return result;
    }

    public static double subtrair(double primeiro_numero, double segundo_numero){

        double result;

        result = primeiro_numero + segundo_numero;

        return result;
    }

    public static double multiplicar(double primeiro_numero, double segundo_numero){

        double result;

        result = primeiro_numero + segundo_numero;

        return result;
    }

    public static double dividir(double primeiro_numero, double segundo_numero){

        double result;

        result = primeiro_numero + segundo_numero;

        return result;
    }

    public static void main(String[] args) {

        String operador;
        double primeiro_numero, segundo_numero;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Java\n");

        System.out.println("Informe o operador: (+ - x /)\n Soma(+) \n Subtração(-) \n Multiplicação (x) \n Divisão (/)");
        operador = scanner.nextLine();

        System.out.println("Informe o primeiro número:");
        primeiro_numero = scanner.nextDouble();

        System.out.println("Informe o segundo número:");
        segundo_numero = scanner.nextDouble();

        switch (operador){
            case "+":
                System.out.println(somar(primeiro_numero, segundo_numero));
                break;
            case "-":
                System.out.println(subtrair(primeiro_numero,segundo_numero));
                break;
            case "x":
                System.out.println(multiplicar(primeiro_numero,segundo_numero));
                break;
            case "/":
                System.out.println(dividir(primeiro_numero,segundo_numero));
                break;
            default:
                System.out.println("Operador inválido.");
        }

        scanner.close();
    }
}
