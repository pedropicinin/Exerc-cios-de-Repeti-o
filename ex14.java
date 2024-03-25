import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int[] numeros = new int[10];
        int par = 0, impar = 0;

        System.out.println("Digite 10 numeros: ");
        for (int i = 0; i < 10; i++) {
            numeros[i] = input.nextInt();
            if (numeros[i] % 2 == 0) {
                par++;
            }
            else {
                impar++;
            }
        }

        System.out.println("Quantidade de números pares: " + par);
        System.out.println("Quantidade de números ímpares: " + impar);



        input.close();
    }
}
