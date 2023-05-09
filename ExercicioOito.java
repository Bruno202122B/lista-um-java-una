import java.util.Scanner;

public class ExercicioOito {
   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int totalVeiculos, totalRodas, qtdCarros, qtdMotos;

      System.out.println("Informe o total de veículos no estacionamento:");
      totalVeiculos = input.nextInt();

      System.out.println("Informe o total de rodas dos veículos no estacionamento:");
      totalRodas = input.nextInt();

      qtdCarros = (totalRodas - (totalVeiculos * 2)) / 2;
      qtdMotos = totalVeiculos - qtdCarros;

      System.out.println("O estacionamento possui " + qtdCarros + " carros e " + qtdMotos + " motos.");
   }
}