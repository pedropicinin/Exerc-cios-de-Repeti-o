import java.util.Scanner;
public class ex51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de termos (n):");
        int n = input.nextInt();

        double soma = 0;
        int numerador = 1;
        int denominador = 1;

        for (int i = 1; i <= n; i++) {
            soma += (double) numerador / denominador;
            System.out.print(numerador + "/" + denominador);
            if (i < n) {
                System.out.print(" + ");
            } else {
                System.out.println();
            }
            numerador++;
            denominador += 2;
        }

        System.out.println("S = " + soma);

        input.close();
    }
}