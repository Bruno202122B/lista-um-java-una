import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de segundos: ");
        int segundos = scanner.nextInt();

        int horas = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        segundos = segundos % 60;

        System.out.println("O tempo correspondente é " + horas + "h " + minutos + "min " + segundos + "s.");
    }
}






