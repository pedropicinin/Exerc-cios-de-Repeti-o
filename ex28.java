import java.util.Scanner;
public class ex28 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite a quantidade de Cds:");
        int c = input.nextInt();

        double media, soma = 0;

        for (int i = 1; i <= c; i++) {
        System.out.println("Digite o preco do " + i + "º CD: ");
        double cds = input.nextDouble();

        soma += cds;
        }

        media = (double) soma / c;

        System.out.println("O total investido e R$"+soma);
        System.out.println("O valor medio pago para cada CD e R$"+media);

        input.close();
    }
}
