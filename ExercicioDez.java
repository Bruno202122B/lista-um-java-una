import java.util.Scanner;

public class ExercicioDez {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o primeiro valor: ");
        double valor1 = sc.nextDouble();
        
        System.out.println("Digite o segundo valor: ");
        double valor2 = sc.nextDouble();
        
        System.out.println("Digite o terceiro valor: ");
        double valor3 = sc.nextDouble();
        
        // cálculo da média aritmética
        double mediaAritmetica = (valor1 + valor2 + valor3) / 3;
        System.out.println("A média aritmética dos valores é: " + mediaAritmetica);
        
        // cálculo da média harmônica
        double mediaHarmonica = 3 / ((1/valor1) + (1/valor2) + (1/valor3));
        System.out.println("A média harmônica dos valores é: " + mediaHarmonica);
        
        // cálculo da média geométrica
        double mediaGeometrica = Math.cbrt(valor1 * valor2 * valor3);
        System.out.println("A média geométrica dos valores é: " + mediaGeometrica);
        
        sc.close();
    }
}