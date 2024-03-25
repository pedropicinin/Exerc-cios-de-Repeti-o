import java.util.Scanner;
public class ex12 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 
        
        int num;
        System.out.println("Digite o primeiro numero: ");
        num = input.nextInt();

        if (num <1 || num > 10) {
            System.out.println("Numero Invalido");
        }
        else {
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " x " + i + " = " + (num * i));
        }
        input.close();
        }
    }
}
