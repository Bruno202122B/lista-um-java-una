import java.util.Scanner;

public class ExercicioSete {
   public static void main(String[] args) {
      
     
      Scanner entrada = new Scanner(System.in);
      
     
      System.out.print("Digite o salário fixo do vendedor: ");
      double salarioFixo = entrada.nextDouble();
      
      
      System.out.print("Digite o valor total das vendas realizadas no mês: ");
      double vendasMes = entrada.nextDouble();
      
      
      System.out.print("Digite o percentual que o vendedor ganha sobre o total das vendas mensais: ");
      double percentualComissao = entrada.nextDouble();
      
      
      double comissao = (percentualComissao / 100) * vendasMes;
      
      
      double salarioTotal = salarioFixo + comissao;
      
      
      System.out.printf("O salário total do vendedor é R$ %.2f", salarioTotal);
   }
}