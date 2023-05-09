import java.util.Scanner;

public class ExercicioCinco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        double horasTrabalhadas = scanner.nextDouble();

        System.out.print("Digite o valor recebido por hora de trabalho: ");
        double valorHora = scanner.nextDouble();

        System.out.print("Digite o valor do salário família: ");
        double salarioFamilia = scanner.nextDouble();

        System.out.print("Digite o número de filhos com idade menor que 14 anos: ");
        int numFilhos = scanner.nextInt();

        double salarioBase = horasTrabalhadas * valorHora; // calcula o salário base
        double valorSalarioFamilia = salarioFamilia * numFilhos; // calcula o valor do salário família
        double salarioBruto = salarioBase + valorSalarioFamilia; // calcula o salário bruto

        System.out.println("Salário base: R$ " + salarioBase);
        System.out.println("Salário família: R$ " + valorSalarioFamilia);
        System.out.println("Salário bruto: R$ " + salarioBruto);
    }
}