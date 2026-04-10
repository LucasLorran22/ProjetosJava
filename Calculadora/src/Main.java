import java.util.Scanner;

public class Main {

    public static double somar(double primeiroNumero, double segundoNumero){
        return primeiroNumero + segundoNumero;
    }

    public static double subtrair(double primeiroNumero, double segundoNumero){
        return primeiroNumero - segundoNumero;
    }

    public static double multiplicar(double primeiroNumero, double segundoNumero){
        return primeiroNumero * segundoNumero;
    }

    public static double dividir(double primeiroNumero, double segundoNumero){
        return primeiroNumero / segundoNumero;
    }

    public static double moduloDividicao(double primeiroNumero, double segundoNumero){
        return primeiroNumero % segundoNumero;
    }

    public static String lerOperador(Scanner scanner){

        System.out.println("""
                           \nInforme o operador: (+ - x / %)
                              Soma (+)
                              Subtração (-)
                              Multiplicação (x)
                              Divisão (/)
                              Módulo (%)
                           """);

        return scanner.nextLine();

    }

    public static double lerNumero(Scanner scanner, String mensagem){

        double numero;

        System.out.println(mensagem);
        numero = scanner.nextDouble();
        scanner.nextLine(); //limpa o buffer

        return numero;
    }

    public static String desejaContinuar(Scanner scanner){
        System.out.println("\n\nDeseja calcular novamente? (sim/não)");
        return scanner.nextLine();
    }

    public static double validarDivisao(String operador, double segundoNumero, Scanner scanner){

        while (segundoNumero == 0 && operador.equals("/")) {
            System.out.println("\nATENÇÃO! Não é possível dividir por zero (0)!");
            segundoNumero = lerNumero(scanner,"\nInforme novamente o segundo número:");
        }

        return segundoNumero;
    }

    public static void main(String[] args) {

        double primeiroNumero, segundoNumero;
        String continuar;
        String operador;
        Scanner scanner = new Scanner(System.in);


        System.out.println("\nCALCULADORA JAVA\n");

        do {
            operador = lerOperador(scanner);

            primeiroNumero = lerNumero(scanner,"\nInforme o primeiro número:");

            segundoNumero = lerNumero(scanner,"Informe o segundo número:");

            validarDivisao(operador, segundoNumero, scanner);

            System.out.println("\nRESULTADO: ");

            switch (operador) {
                case "+":
                    System.out.print(somar(primeiroNumero, segundoNumero));
                    break;
                case "-":
                    System.out.print(subtrair(primeiroNumero, segundoNumero));
                    break;
                case "x":
                    System.out.print(multiplicar(primeiroNumero, segundoNumero));
                    break;
                case "/":
                    System.out.print(dividir(primeiroNumero, segundoNumero));
                    break;
                case "%":
                    System.out.println(moduloDividicao(primeiroNumero, segundoNumero));
                    break;
                default:
                    System.out.print("Operador inválido.");
            }

            continuar = desejaContinuar(scanner);

        } while(continuar.equalsIgnoreCase("sim"));

        System.out.println("\nSistema encerrado!");

        scanner.close();

    }

}
