import java.util.Scanner;

public class ExercicioUm {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);{

      System.out.print("Digite o primeiro número: ");
      double num1 = scanner.nextDouble();

      System.out.print("Digite o segundo número: ");
      double num2 = scanner.nextDouble();

      double media = (num1 + num2) / 2;

      System.out.println("A média aritmética dos números " + num1 + " e " + num2 + " é " + media);
   }
   }
}