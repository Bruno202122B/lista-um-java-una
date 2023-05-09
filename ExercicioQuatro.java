import java.util.Scanner;

public class ExercicioQuatro {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);{

        System.out.print("Digite o valor do capital: ");
      double valorCap = scanner.nextDouble();
      
        System.out.print("Digite o prazo de aplicação em meses: ");
      int valorPrazo = scanner.nextInt();

       System.out.print("Digite, em decimal, a taxa de juros a ser aplicada: ");
      double valorJuros = scanner.nextDouble();
     
      double valorMontante = valorCap * Math.pow(1 + valorJuros, valorPrazo);
      
      System.out.print("O montante recebido é \n" + valorMontante);
   }
   }
}