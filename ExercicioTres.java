import java.util.Scanner;

public class ExercicioTres {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);{

      System.out.print("Digite a temperatura em Fahrenheit: ");
      double valorFar = scanner.nextDouble();

      double valorCels = (valorFar - 32) / 1.8;

      System.out.println("A temperatura em graus centígrados é: " + valorCels + " °C");
   }
   }
}