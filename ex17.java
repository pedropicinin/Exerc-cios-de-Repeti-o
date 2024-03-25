import java.util.Scanner;
public class ex17 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite um numero: ");
        int n = input.nextInt();

        int resultado = 1;

        System.out.print(n + "! = ");

        for (int i = n; i > 0; i--) {
            resultado *= i;
            System.out.print(i);
            if (i > 1) {
                System.out.print(".");
            }
        }

        System.out.print(" = " + resultado);
        input.close();
    }
}
