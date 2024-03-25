import java.util.Scanner;
public class ex34 {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in); 

        int num;

        System.out.println("Digite um numero inteiro: ");
        num = input.nextInt();

        boolean primo = true;

        if (num <=1 ) {
            primo = false;
        }
        else{
            for (int i = 2; i < num / 2; i++) {
                if (num % i == 0) {
                    primo = false;
                    break;
                }
            }
        }

        if (primo) {
            System.out.println(num + " e um numero primo");
        }
        else{
            System.out.println(num + " nao e um numero primo");
        }

        input.close();
    }
}