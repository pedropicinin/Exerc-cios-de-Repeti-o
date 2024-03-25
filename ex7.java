import java.util.Scanner;
public class ex7 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int numero, maior = Integer.MIN_VALUE;

        for (int i = 1; i <= 5; i++) {
            System.out.println("Digite o " + i + "º número:");
            numero = input.nextInt();

            if (numero > maior) {
                maior = numero;
            }
        }

        System.out.println("O maior número: " + maior);
        

        input.close();
    }
}