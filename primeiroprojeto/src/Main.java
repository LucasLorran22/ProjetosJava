import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);
        String continua;
        int numero;
        int indice;

        do {
            System.out.println("Informe o número que deseja saber a tabuada: ");
            numero = scanner.nextInt();
            scanner.nextLine();

            for (indice = 1; indice <= 10; indice++) {
                System.out.printf("%d x %d = %d%n", numero, indice, numero * indice);
            }

            System.out.println("\nDeseja continuar? (sim/não)");
            continua = scanner.nextLine();

        } while (continua.equalsIgnoreCase("sim"));


        System.out.println("Programa encerrado.");

        scanner.close();
    }
}