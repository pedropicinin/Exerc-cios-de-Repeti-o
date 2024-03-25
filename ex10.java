import java.util.Scanner;
public class ex10 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int num1, num2;
        System.out.println("Digite o primeiro numero: ");
        num1 = input.nextInt();
        System.out.println("Digite o segundo numero: ");
        num2 = input.nextInt();

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);


        for (int i = menor; i <= maior; i++) {
            System.out.print(i + " ");
        }

        input.close();
    }
}
