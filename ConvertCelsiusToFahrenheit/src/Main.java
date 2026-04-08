
import java.util.Scanner;

public class Main {

    public static double converteCelsiusParaFahrenheit(double valorTemperaturaCelsius){

        double valorTemperaturaFahrenheit;

        valorTemperaturaFahrenheit = (valorTemperaturaCelsius * 1.8) + 32;

        return valorTemperaturaFahrenheit;
    }

    public static void main(String args[]) {
        double valorTemperaturaCelsius;
        double valorTemperaturaFahrenheit;
        String mensagem;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a temporatura em graus Celsius:");
        valorTemperaturaCelsius = scanner.nextDouble();

        valorTemperaturaFahrenheit = converteCelsiusParaFahrenheit(valorTemperaturaCelsius);

        mensagem = String.format("A temperatura de %.2f Celsius é equivalente a %.2f Fahrenheit",valorTemperaturaCelsius,valorTemperaturaFahrenheit);

        System.out.println(mensagem);

        scanner.close();

    }
}