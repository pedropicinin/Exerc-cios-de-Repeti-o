import java.util.Scanner;
public class ex24 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite a quantidade de notas: ");
        int n = input.nextInt();

        int soma = 0;
        double media;

        for (int i = 1; i < n; i++) {
            System.out.println("Digite o " + i + "º número:");
            double num = input.nextDouble();
            soma += num;
        }

        media = (double) soma / n;

        System.out.println("A media número: " + media);
        

        input.close();
    }
}
