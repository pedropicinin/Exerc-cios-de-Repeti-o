import java.util.Scanner;
public class ex42 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        int contador1 = 0, contador2 = 0, contador3 = 0, contador4 = 0;

        System.out.println("Digite os numeros(Digite um número negativo para terminar): ");
        
        while(true) {
            System.out.print("Numero: ");
            double num = input.nextDouble();

            if (num < 0) {
                break;
            }

            if (num >= 0 && num <= 25) {
                contador1 ++; 
            }
            if (num > 25 && num <= 50) {
                contador2 ++; 
            }
            if (num > 50 && num <= 75) {
                contador3 ++; 
            }
            if (num > 75 && num <= 100) {
                contador4 ++; 
            }
        }

        System.out.println("[0-25] - "+contador1);
        System.out.println("[26-50] - "+contador2);
        System.out.println(" [51-75] - "+contador3);
        System.out.println("[76-100] - "+contador4);

        input.close();
    }
}