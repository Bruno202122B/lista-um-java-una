import java.util.Scanner;

public class ExercicioDois {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);{

      System.out.print("Informe o valor do produto: ");
      double valorUM = scanner.nextDouble();

      double valorDOIS = valorUM * 1.1;

      System.out.println("Novo valor do produto: " + valorDOIS);
   }
   }
}