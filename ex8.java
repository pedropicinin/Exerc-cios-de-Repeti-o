import java.util.Scanner;
public class ex8 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int numero, soma = 0;
        double media;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número:");
            numero = input.nextInt();

            soma += numero;
        }

        media = (double) soma / 5;

        System.out.println("A soma dos números: " + soma);
        System.out.println("A media número: " + media);
        

        input.close();
    }
}