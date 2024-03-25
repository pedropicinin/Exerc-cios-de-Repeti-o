    import java.util.Scanner;
public class ex20 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
    
    while (true) {
        
        System.out.println("Digite um numero: ");
        int n = input.nextInt();

        int resultado = 1;

        System.out.print(n + "! = ");


        if (n >= 0 && n <= 16) { 
            for (int i = n; i > 0; i--) {
                resultado *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(".");
                }
            }
            System.out.print(" = " + resultado);
        }
        else {
            System.out.println("Digite um numero de 0 a 16");
        }
        System.out.println();
    }
    }
}