import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        int soma=0;

        for (int i = menor; i <= maior; i++) {
            soma += i;
        }

        System.out.println("\nSoma dos números no intervalo: " + soma);

        input.close();
    }
}
