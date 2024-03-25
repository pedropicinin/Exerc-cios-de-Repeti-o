import java.util.Scanner;
public class ex48 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        System.out.println("Digite um numero positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("Digite um numero inteiro positivo.");
        }
        else {
            String numeroSTR = String.valueOf(numero);

            String numeroInvertido = "";
            for (int i = numeroSTR.length() - 1; i >= 0; i--) {
                numeroInvertido += numeroSTR.charAt(i);
            }
            System.out.println("Numero invertido: " + numeroInvertido);
        }

        input.close();
    }
}
